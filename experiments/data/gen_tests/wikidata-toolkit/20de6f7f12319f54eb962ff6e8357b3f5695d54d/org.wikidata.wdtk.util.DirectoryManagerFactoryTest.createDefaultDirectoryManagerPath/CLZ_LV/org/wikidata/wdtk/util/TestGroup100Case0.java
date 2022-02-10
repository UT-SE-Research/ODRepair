package org.wikidata.wdtk.util;

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
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager(path0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream2 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManagerImpl directoryManagerImpl2 = new org.wikidata.wdtk.util.DirectoryManagerImpl(path0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.wikidata.wdtk.util.DirectoryManagerFactory directoryManagerFactory0 = new org.wikidata.wdtk.util.DirectoryManagerFactory();
        java.lang.Class<?> wildcardClass1 = directoryManagerFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManagerImpl directoryManagerImpl2 = new org.wikidata.wdtk.util.DirectoryManagerImpl(path0, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager(path0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager4.createFile("", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.BZ2;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = directoryManager4.getInputStreamForFile("hi!", compressionType6);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: user.dir/hi!");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.BZ2 + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.BZ2));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = directoryManager2.createFile("user.dir", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = directoryManager4.getInputStreamForFile("user.dir", compressionType6);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: user.dir/user.dir");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = directoryManager2.createFile("user.dir", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = directoryManager2.createFile("", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"user.dir\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = directoryManager2.createFileAtomic("", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.BZ2;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = directoryManager2.getInputStreamForFile("", compressionType10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.BZ2 + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.BZ2));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        java.lang.Class<?> wildcardClass9 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = directoryManager2.createFile("", inputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: The requested directory \"user.dir/hi!\" does not exist and we are in read-only mode, so it cannot be created.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.Class<? extends org.wikidata.wdtk.util.DirectoryManager> wildcardClass0 = org.wikidata.wdtk.util.DirectoryManagerFactory.dmClass;
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        directoryManager2.createFile("hi!", "hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream1 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean13 = directoryManager11.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType15 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream16 = directoryManager11.getInputStreamForFile("hi!", compressionType15);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray22, (int) (short) 100);
        boolean boolean26 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray22, (int) (short) 100);
        int int27 = inputStream16.read(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = directoryManager2.createFile("", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + compressionType15 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType15.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[104, 105, 33, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        java.util.List<java.lang.String> strList4 = directoryManager2.getSubdirectories("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean10 = directoryManager8.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream13 = directoryManager8.getInputStreamForFile("hi!", compressionType12);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        int int24 = inputStream13.read(byteArray19);
        inputStream13.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = directoryManager2.createFile("", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"user.dir\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[104, 105, 33, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[104, 105, 33, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType14 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream15 = directoryManager10.getInputStreamForFile("hi!", compressionType14);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        int int26 = inputStream15.read(byteArray21);
        inputStream15.mark((int) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int35 = inputStream15.read(byteArray34);
        long long36 = directoryManager4.createFile("hi!", inputStream15);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + compressionType14 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType14.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[104, 105, 33, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream20 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[104, 105, 33, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean10 = directoryManager8.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream13 = directoryManager8.getInputStreamForFile("hi!", compressionType12);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = directoryManager2.createFile("hi!", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = directoryManager2.getOutputStreamForFile("user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream8 = directoryManager2.getOutputStreamForFile("user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        java.lang.Class<?> wildcardClass28 = inputStream7.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream23 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream21 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager16 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean18 = directoryManager16.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType20 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream21 = directoryManager16.getInputStreamForFile("hi!", compressionType20);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = directoryManager2.createFile("user.dir", inputStream21);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + compressionType20 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType20.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean10 = directoryManager8.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream13 = directoryManager8.getInputStreamForFile("hi!", compressionType12);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        int int24 = inputStream13.read(byteArray19);
        inputStream13.mark((int) (short) 100);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int33 = inputStream13.read(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = directoryManager2.createFileAtomic("", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: ");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType8 = org.wikidata.wdtk.util.CompressionType.BZ2;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream9 = directoryManager2.getInputStreamForFile("hi!", compressionType8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + compressionType8 + "' != '" + org.wikidata.wdtk.util.CompressionType.BZ2 + "'", compressionType8.equals(org.wikidata.wdtk.util.CompressionType.BZ2));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.lang.Class<?> wildcardClass5 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        java.lang.Class<?> wildcardClass7 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean10 = directoryManager8.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream13 = directoryManager8.getInputStreamForFile("hi!", compressionType12);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        int int24 = inputStream13.read(byteArray19);
        inputStream13.mark((int) (short) 100);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int33 = inputStream13.read(byteArray32);
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean41 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray39, (int) (short) 100);
        boolean boolean43 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray39, (int) (short) 100);
        int int44 = inputStream13.read(byteArray39);
        int int45 = inputStream13.available();
        // The following exception was thrown during execution in test generation
        try {
            long long46 = directoryManager2.createFileAtomic("user.dir", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("user.dir", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean15 = directoryManager13.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType17 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream18 = directoryManager13.getInputStreamForFile("hi!", compressionType17);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray24, (int) (short) 100);
        boolean boolean28 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray24, (int) (short) 100);
        int int29 = inputStream18.read(byteArray24);
        inputStream18.mark((int) (short) 100);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int38 = inputStream18.read(byteArray37);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean46 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray44, (int) (short) 100);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray44, (int) (short) 100);
        int int49 = inputStream18.read(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = directoryManager2.createFileAtomic("user.dir", inputStream18);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + compressionType17 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType17.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        long long22 = inputStream7.skip((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream23 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = directoryManager2.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: : Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream40 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        java.lang.Class<?> wildcardClass19 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager12.createFile("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream19 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager4.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream20 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager12.createFile("", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager18 = directoryManager14.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager16 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean18 = directoryManager16.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType20 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream21 = directoryManager16.getInputStreamForFile("hi!", compressionType20);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray27, (int) (short) 100);
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray27, (int) (short) 100);
        int int32 = inputStream21.read(byteArray27);
        int int33 = inputStream21.available();
        boolean boolean34 = inputStream21.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = directoryManager12.createFile("hi!", inputStream21);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + compressionType20 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType20.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean10 = directoryManager8.hasSubdirectory("hi!");
        java.util.List<java.lang.String> strList12 = directoryManager8.getSubdirectories("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream23 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        boolean boolean10 = directoryManager2.hasSubdirectory("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = directoryManager2.getOutputStreamForFile("user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: The requested directory \"hi!\" does not exist and we are in read-only mode, so it cannot be created.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip(10L);
        java.lang.Class<?> wildcardClass25 = inputStream7.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream10 = directoryManager2.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: : Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("hi!", compressionType18);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        int int30 = inputStream19.read(byteArray25);
        inputStream19.mark((int) (short) 100);
        int int33 = inputStream19.available();
        boolean boolean34 = inputStream19.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = directoryManager2.createFile("user.dir", inputStream19);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        boolean boolean21 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream22 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream14 = directoryManager2.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: : Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("user.dir", "user.dir");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("user.dir", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream41 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("");
        boolean boolean8 = directoryManager4.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream42 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean10 = directoryManager8.hasSubdirectory("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = directoryManager8.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        java.lang.Class<?> wildcardClass23 = inputStream18.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("hi!", compressionType10);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean19 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray17, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray17, (int) (short) 100);
        int int22 = inputStream11.read(byteArray17);
        inputStream11.mark((int) (short) 100);
        int int25 = inputStream11.available();
        boolean boolean26 = inputStream11.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = directoryManager2.createFile("hi!", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"hi!\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int36 = inputStream7.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream37 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        inputStream7.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("user.dir", compressionType18);
        java.io.InputStream inputStream20 = directoryManager2.getInputStreamForFile("hi!", compressionType18);
        java.lang.Class<?> wildcardClass21 = compressionType18.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream15 = directoryManager2.getInputStreamForFile("user.dir", compressionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream8 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        long long42 = inputStream7.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            inputStream18.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType14 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream15 = directoryManager10.getInputStreamForFile("hi!", compressionType14);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        int int26 = inputStream15.read(byteArray21);
        inputStream15.mark((int) (short) 100);
        int int29 = inputStream15.available();
        boolean boolean30 = inputStream15.markSupported();
        boolean boolean31 = inputStream15.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = directoryManager6.createFile("hi!", inputStream15);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + compressionType14 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType14.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        int int21 = inputStream7.available();
        boolean boolean22 = inputStream7.markSupported();
        boolean boolean23 = inputStream7.markSupported();
        org.wikidata.wdtk.util.DirectoryManager directoryManager26 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean28 = directoryManager26.hasFile("user.dir");
        java.util.List<java.lang.String> strList30 = directoryManager26.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = directoryManager26.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager36 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean38 = directoryManager36.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType40 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream41 = directoryManager36.getInputStreamForFile("hi!", compressionType40);
        java.io.InputStream inputStream42 = directoryManager26.getInputStreamForFile("hi!", compressionType40);
        org.wikidata.wdtk.util.DirectoryManager directoryManager45 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean47 = directoryManager45.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType49 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream50 = directoryManager45.getInputStreamForFile("hi!", compressionType49);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean58 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray56, (int) (short) 100);
        boolean boolean60 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray56, (int) (short) 100);
        int int61 = inputStream50.read(byteArray56);
        inputStream50.mark((int) (short) 100);
        byte[] byteArray69 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int70 = inputStream50.read(byteArray69);
        boolean boolean72 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray69, (int) (short) 0);
        int int73 = inputStream42.read(byteArray69);
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean81 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray79, (int) (short) 100);
        boolean boolean83 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray79, (int) (byte) 10);
        int int84 = inputStream42.read(byteArray79);
        int int85 = inputStream7.read(byteArray79);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(directoryManager26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertNotNull(directoryManager36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + compressionType40 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType40.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertNotNull(directoryManager45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + compressionType49 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType49.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream23 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream22);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        java.io.OutputStream outputStream4 = directoryManager2.getOutputStreamForFile("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = directoryManager2.getOutputStreamForFile("user.dir");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir/user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(outputStream4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("", "user.dir");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int83 = inputStream7.read(byteArray75);
        java.lang.Class<?> wildcardClass84 = byteArray75.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("user.dir", compressionType18);
        java.io.InputStream inputStream20 = directoryManager2.getInputStreamForFile("hi!", compressionType18);
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean26 = directoryManager24.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType28 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream29 = directoryManager24.getInputStreamForFile("hi!", compressionType28);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray35, (int) (short) 100);
        boolean boolean39 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray35, (int) (short) 100);
        int int40 = inputStream29.read(byteArray35);
        int int41 = inputStream29.available();
        boolean boolean42 = inputStream29.markSupported();
        boolean boolean43 = inputStream29.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long44 = directoryManager2.createFileAtomic("", inputStream29);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: ");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + compressionType28 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType28.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        boolean boolean10 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList12 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager16 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean18 = directoryManager16.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType20 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream21 = directoryManager16.getInputStreamForFile("hi!", compressionType20);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = directoryManager2.createFileAtomic("user.dir", inputStream21);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(directoryManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + compressionType20 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType20.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        java.lang.Class<?> wildcardClass12 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream39 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        int int21 = inputStream7.available();
        boolean boolean22 = inputStream7.markSupported();
        int int23 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        java.util.List<java.lang.String> strList12 = directoryManager2.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager16 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean18 = directoryManager16.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType20 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream21 = directoryManager16.getInputStreamForFile("hi!", compressionType20);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray27, (int) (short) 100);
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray27, (int) (short) 100);
        int int32 = inputStream21.read(byteArray27);
        inputStream21.mark((int) (short) 100);
        boolean boolean35 = inputStream21.markSupported();
        int int36 = inputStream21.available();
        long long38 = inputStream21.skip((long) (byte) 100);
        inputStream21.mark(0);
        boolean boolean41 = inputStream21.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = directoryManager2.createFileAtomic("user.dir", inputStream21);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(directoryManager16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + compressionType20 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType20.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray23, (int) (short) 100);
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray23, (int) (short) 100);
        int int28 = inputStream17.read(byteArray23);
        inputStream17.mark((int) (short) 100);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int37 = inputStream17.read(byteArray36);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = directoryManager2.createFileAtomic("", inputStream17);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: ");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        long long42 = inputStream7.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream44 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        long long42 = inputStream7.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream44 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        java.util.List<java.lang.String> strList4 = directoryManager2.getSubdirectories("hi!");
        boolean boolean6 = directoryManager2.hasFile("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        boolean boolean18 = directoryManager14.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean24 = directoryManager22.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType26 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream27 = directoryManager22.getInputStreamForFile("hi!", compressionType26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream27.read(byteArray33);
        inputStream27.mark((int) (short) 100);
        boolean boolean41 = inputStream27.markSupported();
        int int42 = inputStream27.available();
        long long44 = inputStream27.skip((long) (byte) 100);
        int int45 = inputStream27.available();
        // The following exception was thrown during execution in test generation
        try {
            long long46 = directoryManager14.createFile("user.dir", inputStream27);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + compressionType26 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType26.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("hi!", compressionType19);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (int) (short) 100);
        boolean boolean30 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (int) (short) 100);
        int int31 = inputStream20.read(byteArray26);
        inputStream20.mark((int) (short) 100);
        boolean boolean34 = inputStream20.markSupported();
        int int35 = inputStream20.available();
        long long37 = inputStream20.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = directoryManager2.createFileAtomic("user.dir", inputStream20);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean10 = directoryManager8.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream13 = directoryManager8.getInputStreamForFile("hi!", compressionType12);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray19, (int) (short) 100);
        int int24 = inputStream13.read(byteArray19);
        int int25 = inputStream13.available();
        boolean boolean26 = inputStream13.markSupported();
        inputStream13.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = directoryManager2.createFileAtomic("user.dir", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        boolean boolean18 = directoryManager14.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream41 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        int int21 = inputStream7.available();
        boolean boolean22 = inputStream7.markSupported();
        boolean boolean23 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        boolean boolean41 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("user.dir", compressionType16);
        java.io.InputStream inputStream18 = directoryManager8.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream19 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        // The following exception was thrown during execution in test generation
        try {
            inputStream19.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(inputStream19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream26 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager12.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager14.createFile("user.dir", "user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        boolean boolean27 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream29 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream23 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int36 = inputStream7.read(byteArray33);
        boolean boolean38 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) ' ');
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        java.util.List<java.lang.String> strList10 = directoryManager2.getSubdirectories("hi!");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("", "user.dir");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        inputStream18.mark(0);
        int int23 = inputStream18.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        java.util.List<java.lang.String> strList4 = directoryManager2.getSubdirectories("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = directoryManager2.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"user.dir\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean15 = directoryManager13.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType17 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream18 = directoryManager13.getInputStreamForFile("hi!", compressionType17);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = directoryManager9.createFileAtomic("", inputStream18);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + compressionType17 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType17.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("user.dir", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean13 = directoryManager11.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType15 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream16 = directoryManager11.getInputStreamForFile("hi!", compressionType15);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean24 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray22, (int) (short) 100);
        boolean boolean26 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray22, (int) (short) 100);
        int int27 = inputStream16.read(byteArray22);
        inputStream16.mark((int) (short) 100);
        boolean boolean30 = inputStream16.markSupported();
        int int31 = inputStream16.available();
        long long33 = inputStream16.skip((long) (byte) 100);
        inputStream16.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            long long36 = directoryManager2.createFileAtomic("user.dir", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + compressionType15 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType15.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray23, (int) (short) 100);
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray23, (int) (short) 100);
        int int28 = inputStream17.read(byteArray23);
        inputStream17.mark((int) (short) 100);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int37 = inputStream17.read(byteArray36);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean45 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray43, (int) (short) 100);
        boolean boolean47 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray43, (int) (short) 100);
        int int48 = inputStream17.read(byteArray43);
        long long50 = inputStream17.skip((long) ' ');
        long long52 = inputStream17.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long53 = directoryManager2.createFileAtomic("hi!", inputStream17);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        boolean boolean10 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList12 = directoryManager2.getSubdirectories("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        int int21 = inputStream7.available();
        boolean boolean22 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream25 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) (short) 10);
        int int23 = inputStream18.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream25 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("user.dir", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream8 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        boolean boolean21 = inputStream7.markSupported();
        long long23 = inputStream7.skip(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream24 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        boolean boolean41 = inputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream43 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean11 = directoryManager9.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager9.getSubdirectoryManager("");
        boolean boolean15 = directoryManager13.hasSubdirectory("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("hi!", compressionType18);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        int int30 = inputStream19.read(byteArray25);
        inputStream19.mark((int) (short) 100);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int39 = inputStream19.read(byteArray38);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean47 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, (int) (short) 100);
        boolean boolean49 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, (int) (short) 100);
        int int50 = inputStream19.read(byteArray45);
        inputStream19.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long53 = directoryManager2.createFileAtomic("user.dir", inputStream19);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        int int25 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream26 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean24 = directoryManager22.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType26 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream27 = directoryManager22.getInputStreamForFile("hi!", compressionType26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream27.read(byteArray33);
        inputStream27.mark((int) (short) 100);
        int int41 = inputStream27.available();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = directoryManager2.createFileAtomic("", inputStream27);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: ");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + compressionType26 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType26.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        inputStream22.mark((int) (short) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager4.createFile("user.dir", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        boolean boolean10 = directoryManager2.hasSubdirectory("");
        boolean boolean12 = directoryManager2.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        java.util.List<java.lang.String> strList4 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean6 = directoryManager2.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = directoryManager2.getOutputStreamForFile("user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        java.io.OutputStream outputStream16 = directoryManager12.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(outputStream16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList11 = directoryManager9.getSubdirectories("");
        boolean boolean13 = directoryManager9.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        long long28 = inputStream7.skip((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("user.dir");
        java.util.List<java.lang.String> strList19 = directoryManager15.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager21 = directoryManager15.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager25 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean27 = directoryManager25.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType29 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream30 = directoryManager25.getInputStreamForFile("hi!", compressionType29);
        java.io.InputStream inputStream31 = directoryManager15.getInputStreamForFile("hi!", compressionType29);
        inputStream31.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager36 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean38 = directoryManager36.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType40 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream41 = directoryManager36.getInputStreamForFile("hi!", compressionType40);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean49 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray47, (int) (short) 100);
        boolean boolean51 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray47, (int) (short) 100);
        int int52 = inputStream41.read(byteArray47);
        inputStream41.mark((int) (short) 100);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int61 = inputStream41.read(byteArray60);
        boolean boolean63 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray60, (int) (short) 1);
        int int64 = inputStream31.read(byteArray60);
        // The following exception was thrown during execution in test generation
        try {
            long long65 = directoryManager2.createFile("hi!", inputStream31);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(directoryManager21);
        org.junit.Assert.assertNotNull(directoryManager25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + compressionType29 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType29.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertNotNull(directoryManager36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + compressionType40 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType40.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 100);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("");
        java.util.List<java.lang.String> strList16 = directoryManager2.getSubdirectories("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        long long22 = inputStream7.skip((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = null; // flaky: directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("user.dir");
        java.util.List<java.lang.String> strList22 = directoryManager18.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = directoryManager18.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream34 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        long long35 = 0L; // flaky: directoryManager14.createFile("hi!", inputStream34);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
// flaky:         org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType14 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream15 = directoryManager10.getInputStreamForFile("user.dir", compressionType14);
        java.io.InputStream inputStream16 = directoryManager6.getInputStreamForFile("hi!", compressionType14);
        org.wikidata.wdtk.util.DirectoryManager directoryManager19 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean21 = directoryManager19.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType23 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream24 = directoryManager19.getInputStreamForFile("hi!", compressionType23);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean32 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray30, (int) (short) 100);
        boolean boolean34 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray30, (int) (short) 100);
        int int35 = inputStream24.read(byteArray30);
        inputStream24.mark((int) (short) 100);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int44 = inputStream24.read(byteArray43);
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (short) 100);
        boolean boolean54 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (short) 100);
        int int55 = inputStream24.read(byteArray50);
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (byte) 10);
        int int60 = inputStream16.read(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            long long61 = directoryManager2.createFileAtomic("", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + compressionType14 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType14.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertNotNull(directoryManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + compressionType23 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType23.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        long long22 = inputStream7.skip((long) 10);
        inputStream7.mark((int) (byte) 0);
        long long26 = inputStream7.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream28 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        org.wikidata.wdtk.util.DirectoryManager directoryManager21 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean23 = directoryManager21.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType25 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream26 = directoryManager21.getInputStreamForFile("hi!", compressionType25);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean34 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        int int37 = inputStream26.read(byteArray32);
        inputStream26.mark((int) (short) 100);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int46 = inputStream26.read(byteArray45);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, (int) (short) 0);
        int int49 = inputStream18.read(byteArray45);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (byte) 10);
        int int60 = inputStream18.read(byteArray55);
        boolean boolean62 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(directoryManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + compressionType25 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType25.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream14 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream12, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("user.dir", compressionType18);
        java.io.InputStream inputStream20 = directoryManager2.getInputStreamForFile("hi!", compressionType18);
        boolean boolean22 = directoryManager2.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        inputStream7.mark(100);
        long long44 = inputStream7.skip((long) (short) 1);
        long long46 = inputStream7.skip((long) (byte) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream21 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.CompressionType compressionType9 = org.wikidata.wdtk.util.CompressionType.BZ2;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = directoryManager2.getInputStreamForFile("", compressionType9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + compressionType9 + "' != '" + org.wikidata.wdtk.util.CompressionType.BZ2 + "'", compressionType9.equals(org.wikidata.wdtk.util.CompressionType.BZ2));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark((-1));
        boolean boolean27 = inputStream7.markSupported();
        long long29 = inputStream7.skip((long) 'a');
        long long31 = inputStream7.skip((long) (byte) -1);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = directoryManager2.getOutputStreamForFile("user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager8.createFile("user.dir", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        boolean boolean10 = directoryManager2.hasFile("user.dir");
        boolean boolean12 = directoryManager2.hasSubdirectory("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager23 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean25 = directoryManager23.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType27 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream28 = directoryManager23.getInputStreamForFile("hi!", compressionType27);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray34, (int) (short) 100);
        boolean boolean38 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray34, (int) (short) 100);
        int int39 = inputStream28.read(byteArray34);
        inputStream28.mark((int) (short) 100);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int48 = inputStream28.read(byteArray47);
        boolean boolean50 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray47, (int) (short) 1);
        int int51 = inputStream18.read(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream53 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(directoryManager23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + compressionType27 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType27.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream4 = directoryManager2.getOutputStreamForFile("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"hi!\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager2.hasFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        inputStream18.mark((int) (short) 10);
        int int27 = inputStream18.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        boolean boolean18 = directoryManager14.hasSubdirectory("");
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = directoryManager14.createFile("hi!", inputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        boolean boolean10 = directoryManager2.hasSubdirectory("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        java.util.List<java.lang.String> strList18 = directoryManager14.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager20 = directoryManager14.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean26 = directoryManager24.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType28 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream29 = directoryManager24.getInputStreamForFile("hi!", compressionType28);
        java.io.InputStream inputStream30 = directoryManager14.getInputStreamForFile("hi!", compressionType28);
        inputStream30.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager35 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean37 = directoryManager35.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType39 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream40 = directoryManager35.getInputStreamForFile("hi!", compressionType39);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray46, (int) (short) 100);
        boolean boolean50 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray46, (int) (short) 100);
        int int51 = inputStream40.read(byteArray46);
        inputStream40.mark((int) (short) 100);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int60 = inputStream40.read(byteArray59);
        boolean boolean62 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray59, (int) (short) 1);
        int int63 = inputStream30.read(byteArray59);
        long long65 = inputStream30.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long66 = directoryManager2.createFile("hi!", inputStream30);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(directoryManager20);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + compressionType28 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType28.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(directoryManager35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + compressionType39 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType39.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList11 = directoryManager9.getSubdirectories("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager21 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager25 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean27 = directoryManager25.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType29 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream30 = directoryManager25.getInputStreamForFile("user.dir", compressionType29);
        java.io.InputStream inputStream31 = directoryManager21.getInputStreamForFile("hi!", compressionType29);
        java.io.InputStream inputStream32 = directoryManager15.getInputStreamForFile("hi!", compressionType29);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = directoryManager9.createFile("", inputStream32);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(directoryManager21);
        org.junit.Assert.assertNotNull(directoryManager25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + compressionType29 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType29.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertNotNull(inputStream32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        java.lang.Class<?> wildcardClass19 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = null; // flaky: directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType22 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream23 = directoryManager18.getInputStreamForFile("hi!", compressionType22);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray29, (int) (short) 100);
        boolean boolean33 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray29, (int) (short) 100);
        int int34 = inputStream23.read(byteArray29);
        inputStream23.mark((int) (short) 100);
        int int37 = inputStream23.available();
        boolean boolean38 = inputStream23.markSupported();
        boolean boolean39 = inputStream23.markSupported();
        inputStream23.mark((int) (byte) -1);
        inputStream23.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
            long long44 = 0L; // flaky: directoryManager14.createFile("", inputStream23);
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
// flaky:         } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
// flaky:         org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + compressionType22 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType22.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("user.dir", compressionType18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream20 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType14 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream15 = directoryManager10.getInputStreamForFile("hi!", compressionType14);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        int int26 = inputStream15.read(byteArray21);
        inputStream15.mark((int) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int35 = inputStream15.read(byteArray34);
        int int36 = inputStream7.read(byteArray34);
        boolean boolean38 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray34, (int) (byte) 10);
        java.lang.Class<?> wildcardClass39 = byteArray34.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + compressionType14 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType14.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        inputStream7.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        boolean boolean18 = directoryManager14.hasSubdirectory("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean24 = directoryManager22.hasFile("user.dir");
        java.util.List<java.lang.String> strList26 = directoryManager22.getSubdirectories("");
        boolean boolean28 = directoryManager22.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager30 = directoryManager22.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = directoryManager22.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList34 = directoryManager32.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager38 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean40 = directoryManager38.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager48 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean50 = directoryManager48.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType52 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream53 = directoryManager48.getInputStreamForFile("user.dir", compressionType52);
        java.io.InputStream inputStream54 = directoryManager44.getInputStreamForFile("hi!", compressionType52);
        java.io.InputStream inputStream55 = directoryManager38.getInputStreamForFile("hi!", compressionType52);
        java.io.InputStream inputStream56 = directoryManager32.getInputStreamForFile("hi!", compressionType52);
        java.io.InputStream inputStream57 = directoryManager14.getInputStreamForFile("", compressionType52);
        boolean boolean59 = directoryManager14.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(directoryManager30);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(directoryManager38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertNotNull(directoryManager48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + compressionType52 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType52.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(inputStream57);
// flaky:         org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean16 = directoryManager14.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("hi!", compressionType18);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray25, (int) (short) 100);
        int int30 = inputStream19.read(byteArray25);
        int int31 = inputStream19.available();
        boolean boolean32 = inputStream19.markSupported();
        boolean boolean33 = inputStream19.markSupported();
        long long35 = inputStream19.skip(1L);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = directoryManager2.createFileAtomic("hi!", inputStream19);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType22 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream23 = directoryManager18.getInputStreamForFile("user.dir", compressionType22);
        java.io.InputStream inputStream24 = directoryManager14.getInputStreamForFile("hi!", compressionType22);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = directoryManager10.createFile("hi!", inputStream24);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + compressionType22 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType22.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(inputStream24);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        boolean boolean39 = inputStream7.markSupported();
        int int40 = inputStream7.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = null; // flaky: directoryManager4.getSubdirectoryManager("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
// flaky:         org.junit.Assert.assertNotNull(directoryManager8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager14.createFile("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("user.dir", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = inputStream7.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int83 = inputStream7.read(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        boolean boolean19 = inputStream18.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream20 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        java.lang.Class<?> wildcardClass41 = inputStream7.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        java.util.List<java.lang.String> strList24 = directoryManager2.getSubdirectories("");
        java.io.OutputStream outputStream26 = directoryManager2.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(outputStream26);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream16 = directoryManager14.getOutputStreamForFile("user.dir");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir/user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        long long29 = inputStream7.skip(100L);
        boolean boolean30 = inputStream7.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("");
        java.util.List<java.lang.String> strList16 = directoryManager12.getSubdirectories("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType14 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream15 = directoryManager10.getInputStreamForFile("hi!", compressionType14);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean23 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray21, (int) (short) 100);
        int int26 = inputStream15.read(byteArray21);
        inputStream15.mark((int) (short) 100);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int35 = inputStream15.read(byteArray34);
        int int36 = inputStream7.read(byteArray34);
        boolean boolean37 = inputStream7.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + compressionType14 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType14.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager11 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        boolean boolean6 = directoryManager2.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        java.util.List<java.lang.String> strList8 = directoryManager2.getSubdirectories("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.GZIP;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = directoryManager2.getInputStreamForFile("", compressionType10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.GZIP + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.GZIP));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager12.getInputStreamForFile("hi!", compressionType32);
        org.wikidata.wdtk.util.DirectoryManager directoryManager40 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean42 = directoryManager40.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType44 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream45 = directoryManager40.getInputStreamForFile("user.dir", compressionType44);
        int int46 = inputStream45.available();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = directoryManager12.createFile("user.dir", inputStream45);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(directoryManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + compressionType44 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType44.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4096 + "'", int46 == 4096);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        java.util.List<java.lang.String> strList10 = directoryManager2.getSubdirectories("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType12 = org.wikidata.wdtk.util.CompressionType.GZIP;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream13 = directoryManager2.getInputStreamForFile("hi!", compressionType12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + compressionType12 + "' != '" + org.wikidata.wdtk.util.CompressionType.GZIP + "'", compressionType12.equals(org.wikidata.wdtk.util.CompressionType.GZIP));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager2.getSubdirectoryManager("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("");
        boolean boolean16 = directoryManager12.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("hi!");
        boolean boolean10 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList12 = directoryManager2.getSubdirectories("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        long long9 = inputStream7.skip((long) (byte) 1);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType22 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream23 = directoryManager18.getInputStreamForFile("hi!", compressionType22);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray29, (int) (short) 100);
        boolean boolean33 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray29, (int) (short) 100);
        int int34 = inputStream23.read(byteArray29);
        inputStream23.mark((int) (short) 100);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int43 = inputStream23.read(byteArray42);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean51 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray49, (int) (short) 100);
        boolean boolean53 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray49, (int) (short) 100);
        int int54 = inputStream23.read(byteArray49);
        long long56 = inputStream23.skip((long) ' ');
        long long58 = inputStream23.skip((long) (byte) 100);
        long long60 = inputStream23.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long61 = directoryManager12.createFile("user.dir", inputStream23);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + compressionType22 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType22.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("user.dir", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager6.createFile("", "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        int int46 = inputStream7.read(byteArray45);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, 3);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        java.io.OutputStream outputStream4 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean6 = directoryManager2.hasSubdirectory("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        inputStream7.mark((int) (short) 10);
        boolean boolean22 = inputStream7.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (short) 100);
        boolean boolean9 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("");
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = directoryManager2.createFile("", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        boolean boolean6 = directoryManager2.hasFile("hi!");
        boolean boolean8 = directoryManager2.hasSubdirectory("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        org.wikidata.wdtk.util.DirectoryManager directoryManager16 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager20 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean22 = directoryManager20.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType24 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream25 = directoryManager20.getInputStreamForFile("user.dir", compressionType24);
        java.io.InputStream inputStream26 = directoryManager16.getInputStreamForFile("hi!", compressionType24);
        org.wikidata.wdtk.util.DirectoryManager directoryManager29 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean31 = directoryManager29.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType33 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream34 = directoryManager29.getInputStreamForFile("hi!", compressionType33);
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean42 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray40, (int) (short) 100);
        boolean boolean44 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray40, (int) (short) 100);
        int int45 = inputStream34.read(byteArray40);
        inputStream34.mark((int) (short) 100);
        byte[] byteArray53 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int54 = inputStream34.read(byteArray53);
        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean62 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray60, (int) (short) 100);
        boolean boolean64 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray60, (int) (short) 100);
        int int65 = inputStream34.read(byteArray60);
        boolean boolean67 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray60, (int) (short) 100);
        boolean boolean69 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray60, (int) (byte) 10);
        int int70 = inputStream26.read(byteArray60);
        int int71 = inputStream26.available();
        // The following exception was thrown during execution in test generation
        try {
            long long72 = directoryManager2.createFile("hi!", inputStream26);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(directoryManager16);
        org.junit.Assert.assertNotNull(directoryManager20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + compressionType24 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType24.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(directoryManager29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + compressionType33 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType33.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        boolean boolean40 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean42 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (byte) -1);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("user.dir");
        java.io.OutputStream outputStream8 = directoryManager6.getOutputStreamForFile("hi!");
        java.lang.Class<?> wildcardClass9 = directoryManager6.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = null; // flaky: directoryManager12.getSubdirectoryManager("user.dir");
        java.io.InputStream inputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = directoryManager14.createFile("user.dir", inputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
// flaky:         org.junit.Assert.assertNotNull(directoryManager14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        boolean boolean40 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean42 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        boolean boolean16 = directoryManager12.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager20 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean22 = directoryManager20.hasFile("user.dir");
        java.util.List<java.lang.String> strList24 = directoryManager20.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager26 = directoryManager20.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager30 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean32 = directoryManager30.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType34 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream35 = directoryManager30.getInputStreamForFile("hi!", compressionType34);
        java.io.InputStream inputStream36 = directoryManager20.getInputStreamForFile("hi!", compressionType34);
        inputStream36.mark((int) (short) 100);
        long long40 = inputStream36.skip((long) 10);
        inputStream36.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = directoryManager12.createFile("", inputStream36);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(directoryManager20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(directoryManager26);
        org.junit.Assert.assertNotNull(directoryManager30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + compressionType34 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType34.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("user.dir", compressionType16);
        java.io.InputStream inputStream18 = directoryManager8.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream19 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        java.io.OutputStream outputStream21 = directoryManager2.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(outputStream21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("");
        java.util.List<java.lang.String> strList8 = directoryManager6.getSubdirectories("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark((-1));
        boolean boolean27 = inputStream7.markSupported();
        long long29 = inputStream7.skip(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream30 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager12.getInputStreamForFile("hi!", compressionType32);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean44 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray42, (int) (short) 100);
        int int45 = inputStream36.read(byteArray42);
        boolean boolean47 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray42, (int) (byte) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        inputStream7.mark(100);
        int int43 = inputStream7.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        boolean boolean18 = directoryManager14.hasFile("");
        boolean boolean20 = directoryManager14.hasFile("");
        java.util.List<java.lang.String> strList22 = directoryManager14.getSubdirectories("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager23 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean25 = directoryManager23.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType27 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream28 = directoryManager23.getInputStreamForFile("hi!", compressionType27);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray34, (int) (short) 100);
        boolean boolean38 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray34, (int) (short) 100);
        int int39 = inputStream28.read(byteArray34);
        inputStream28.mark((int) (short) 100);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int48 = inputStream28.read(byteArray47);
        boolean boolean50 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray47, (int) (short) 1);
        int int51 = inputStream18.read(byteArray47);
        long long53 = inputStream18.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            inputStream18.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(directoryManager23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + compressionType27 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType27.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream27 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark((-1));
        boolean boolean27 = inputStream7.markSupported();
        long long29 = inputStream7.skip(1L);
        long long31 = inputStream7.skip((long) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        boolean boolean25 = inputStream18.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int36 = inputStream7.read(byteArray33);
        boolean boolean38 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) 'a');
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        long long28 = inputStream7.skip((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream30 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType18 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream19 = directoryManager14.getInputStreamForFile("user.dir", compressionType18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream21 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream19, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + compressionType18 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType18.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager17 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean19 = directoryManager17.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType21 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream22 = directoryManager17.getInputStreamForFile("hi!", compressionType21);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray28, (int) (short) 100);
        boolean boolean32 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray28, (int) (short) 100);
        int int33 = inputStream22.read(byteArray28);
        inputStream22.mark((int) (short) 100);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int42 = inputStream22.read(byteArray41);
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray48, (int) (short) 100);
        boolean boolean52 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray48, (int) (short) 100);
        int int53 = inputStream22.read(byteArray48);
        boolean boolean54 = inputStream22.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long55 = directoryManager2.createFileAtomic("", inputStream22);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: ");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertNotNull(directoryManager17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + compressionType21 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType21.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("");
        boolean boolean16 = directoryManager14.hasSubdirectory("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        boolean boolean21 = inputStream18.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean16 = directoryManager14.hasFile("hi!");
        boolean boolean18 = directoryManager14.hasFile("");
        boolean boolean20 = directoryManager14.hasFile("");
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = directoryManager14.createFile("user.dir", inputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"in\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        long long22 = inputStream7.skip((long) 10);
        inputStream7.mark((int) (byte) 0);
        long long26 = inputStream7.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream27 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: The requested directory \"user.dir/hi!\" does not exist and we are in read-only mode, so it cannot be created.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        boolean boolean39 = inputStream7.markSupported();
        boolean boolean40 = inputStream7.markSupported();
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean84 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (byte) 10);
        int int85 = inputStream7.read(byteArray75);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        int int13 = inputStream12.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager14.getInputStreamForFile("user.dir", compressionType32);
        org.wikidata.wdtk.util.DirectoryManager directoryManager40 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean42 = directoryManager40.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType44 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream45 = directoryManager40.getInputStreamForFile("hi!", compressionType44);
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean53 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray51, (int) (short) 100);
        boolean boolean55 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray51, (int) (short) 100);
        int int56 = inputStream45.read(byteArray51);
        inputStream45.mark((int) (short) 100);
        int int59 = inputStream45.available();
        boolean boolean60 = inputStream45.markSupported();
        boolean boolean61 = inputStream45.markSupported();
        inputStream45.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = directoryManager14.createFile("user.dir", inputStream45);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(directoryManager40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + compressionType44 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType44.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("user.dir", compressionType6);
        int int8 = inputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4096 + "'", int8 == 4096);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        java.io.InputStream inputStream12 = directoryManager2.getInputStreamForFile("hi!", compressionType10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream14 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream12, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = directoryManager2.getSubdirectoryManager("");
        boolean boolean26 = directoryManager2.hasFile("");
        java.io.OutputStream outputStream28 = directoryManager2.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(outputStream28);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        java.io.OutputStream outputStream4 = directoryManager2.getOutputStreamForFile("hi!");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("hi!");
        java.io.OutputStream outputStream8 = directoryManager2.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(outputStream4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(outputStream8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager4.createFile("hi!", "user.dir");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("user.dir");
        java.io.OutputStream outputStream8 = directoryManager6.getOutputStreamForFile("hi!");
        boolean boolean10 = directoryManager6.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(outputStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int83 = inputStream7.read(byteArray75);
        boolean boolean84 = inputStream7.markSupported();
        boolean boolean85 = inputStream7.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        long long42 = inputStream7.skip((long) (byte) 100);
        long long44 = inputStream7.skip(10L);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        org.wikidata.wdtk.util.DirectoryManager directoryManager21 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean23 = directoryManager21.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType25 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream26 = directoryManager21.getInputStreamForFile("hi!", compressionType25);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean34 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        int int37 = inputStream26.read(byteArray32);
        inputStream26.mark((int) (short) 100);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int46 = inputStream26.read(byteArray45);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, (int) (byte) -1);
        int int49 = inputStream7.read(byteArray45);
        int int50 = inputStream7.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(directoryManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + compressionType25 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType25.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream29 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        long long41 = inputStream7.skip((long) (byte) 100);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        boolean boolean27 = inputStream7.markSupported();
        inputStream7.mark((int) ' ');
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int36 = inputStream7.read(byteArray33);
        java.lang.Class<?> wildcardClass37 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        boolean boolean6 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager10.getSubdirectories("");
        boolean boolean16 = directoryManager10.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = directoryManager10.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager20 = directoryManager10.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = directoryManager10.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager26 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean28 = directoryManager26.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager36 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean38 = directoryManager36.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType40 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream41 = directoryManager36.getInputStreamForFile("user.dir", compressionType40);
        java.io.InputStream inputStream42 = directoryManager32.getInputStreamForFile("hi!", compressionType40);
        java.io.InputStream inputStream43 = directoryManager26.getInputStreamForFile("hi!", compressionType40);
        java.io.InputStream inputStream44 = directoryManager22.getInputStreamForFile("user.dir", compressionType40);
        java.io.InputStream inputStream45 = directoryManager2.getInputStreamForFile("", compressionType40);
        boolean boolean47 = directoryManager2.hasSubdirectory("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertNotNull(directoryManager20);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertNotNull(directoryManager26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertNotNull(directoryManager36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + compressionType40 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType40.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(inputStream42);
        org.junit.Assert.assertNotNull(inputStream43);
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (-1));
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (int) (byte) 10);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasSubdirectory("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean11 = directoryManager9.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager9.getSubdirectoryManager("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream15 = directoryManager9.getOutputStreamForFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(directoryManager13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean15 = directoryManager13.hasFile("user.dir");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager13.createFile("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir/hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager4.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean11 = directoryManager9.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager9.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager17 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean19 = directoryManager17.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType21 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream22 = directoryManager17.getInputStreamForFile("hi!", compressionType21);
        java.io.InputStream inputStream23 = directoryManager13.getInputStreamForFile("hi!", compressionType21);
        java.io.OutputStream outputStream25 = directoryManager13.getOutputStreamForFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertNotNull(directoryManager17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + compressionType21 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType21.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(outputStream25);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        java.lang.Class<?> wildcardClass5 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        inputStream7.mark((int) (short) 10);
        long long23 = inputStream7.skip((long) 4096);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        int int19 = inputStream7.available();
        boolean boolean20 = inputStream7.markSupported();
        boolean boolean21 = inputStream7.markSupported();
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean26 = directoryManager24.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType28 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream29 = directoryManager24.getInputStreamForFile("hi!", compressionType28);
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean34 = directoryManager32.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType36 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream37 = directoryManager32.getInputStreamForFile("hi!", compressionType36);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean45 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray43, (int) (short) 100);
        boolean boolean47 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray43, (int) (short) 100);
        int int48 = inputStream37.read(byteArray43);
        inputStream37.mark((int) (short) 100);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int57 = inputStream37.read(byteArray56);
        int int58 = inputStream29.read(byteArray56);
        boolean boolean60 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray56, (int) (byte) 10);
        int int61 = inputStream7.read(byteArray56);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + compressionType28 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType28.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + compressionType36 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType36.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean14 = directoryManager2.hasFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark(0);
        inputStream18.mark(0);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray28, (int) (short) 100);
        boolean boolean32 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray28, (int) (byte) 10);
        int int33 = inputStream18.read(byteArray28);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        boolean boolean4 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean12 = directoryManager10.hasFile("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager10.getSubdirectories("");
        boolean boolean16 = directoryManager10.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = directoryManager10.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager20 = directoryManager10.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = directoryManager10.getSubdirectoryManager("user.dir");
        boolean boolean24 = directoryManager22.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType26 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream27 = directoryManager22.getInputStreamForFile("user.dir", compressionType26);
        java.io.InputStream inputStream28 = directoryManager2.getInputStreamForFile("hi!", compressionType26);
        boolean boolean30 = directoryManager2.hasFile("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertNotNull(directoryManager20);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + compressionType26 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType26.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        long long28 = inputStream7.skip((long) 1);
        long long30 = inputStream7.skip((long) (short) -1);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        boolean boolean24 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager26 = directoryManager2.getSubdirectoryManager("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(directoryManager26);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager4 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager4.getSubdirectories("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = null; // flaky: directoryManager4.getSubdirectoryManager("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager4);
        org.junit.Assert.assertNotNull(strList6);
// flaky:         org.junit.Assert.assertNotNull(directoryManager8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean10 = directoryManager8.hasSubdirectory("hi!");
        boolean boolean12 = directoryManager8.hasFile("user.dir");
        boolean boolean14 = directoryManager8.hasFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        boolean boolean8 = directoryManager2.hasSubdirectory("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("user.dir", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        int int39 = inputStream7.available();
        boolean boolean40 = inputStream7.markSupported();
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray46, (int) (short) 100);
        int int49 = inputStream7.read(byteArray46);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("user.dir", compressionType6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Is a directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        boolean boolean20 = directoryManager2.hasFile("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: hi!");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        boolean boolean21 = inputStream7.markSupported();
        int int22 = inputStream7.available();
        long long24 = inputStream7.skip((long) (byte) 100);
        inputStream7.mark(0);
        boolean boolean27 = inputStream7.markSupported();
        inputStream7.mark((int) (byte) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        // The following exception was thrown during execution in test generation
        try {
            inputStream22.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager12.getInputStreamForFile("hi!", compressionType32);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean44 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray42, (int) (short) 100);
        int int45 = inputStream36.read(byteArray42);
        boolean boolean47 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray42, (int) '4');
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("user.dir");
        java.util.List<java.lang.String> strList22 = directoryManager18.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = directoryManager18.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream34 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        inputStream34.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager39 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean41 = directoryManager39.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType43 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream44 = directoryManager39.getInputStreamForFile("hi!", compressionType43);
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (short) 100);
        boolean boolean54 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray50, (int) (short) 100);
        int int55 = inputStream44.read(byteArray50);
        inputStream44.mark((int) (short) 100);
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int64 = inputStream44.read(byteArray63);
        boolean boolean66 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray63, (int) (short) 1);
        int int67 = inputStream34.read(byteArray63);
        long long69 = inputStream34.skip((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long70 = directoryManager14.createFileAtomic("", inputStream34);
            org.junit.Assert.fail("Expected exception of type java.nio.file.FileAlreadyExistsException; message: user.dir");
        } catch (java.nio.file.FileAlreadyExistsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(directoryManager39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + compressionType43 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType43.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream44);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("hi!", compressionType10);
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager6.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList15 = directoryManager13.getSubdirectories("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager19 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager23 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean25 = directoryManager23.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType27 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream28 = directoryManager23.getInputStreamForFile("user.dir", compressionType27);
        java.io.InputStream inputStream29 = directoryManager19.getInputStreamForFile("hi!", compressionType27);
        java.io.InputStream inputStream30 = directoryManager13.getInputStreamForFile("", compressionType27);
        java.io.InputStream inputStream31 = directoryManager2.getInputStreamForFile("", compressionType27);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(directoryManager19);
        org.junit.Assert.assertNotNull(directoryManager23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + compressionType27 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType27.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(inputStream31);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int83 = inputStream7.read(byteArray75);
        inputStream7.mark(3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream86 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, 1);
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, 0);
        boolean boolean33 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, 10);
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (int) (byte) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("hi!");
        boolean boolean6 = directoryManager2.hasSubdirectory("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        org.wikidata.wdtk.util.DirectoryManager directoryManager41 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean43 = directoryManager41.hasFile("user.dir");
        java.util.List<java.lang.String> strList45 = directoryManager41.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager47 = directoryManager41.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager51 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean53 = directoryManager51.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType55 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream56 = directoryManager51.getInputStreamForFile("hi!", compressionType55);
        java.io.InputStream inputStream57 = directoryManager41.getInputStreamForFile("hi!", compressionType55);
        inputStream57.mark(0);
        org.wikidata.wdtk.util.DirectoryManager directoryManager62 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean64 = directoryManager62.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType66 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream67 = directoryManager62.getInputStreamForFile("hi!", compressionType66);
        byte[] byteArray73 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean75 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray73, (int) (short) 100);
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray73, (int) (short) 100);
        int int78 = inputStream67.read(byteArray73);
        inputStream67.mark((int) (short) 100);
        byte[] byteArray86 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int87 = inputStream67.read(byteArray86);
        boolean boolean89 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray86, (int) (short) 1);
        int int90 = inputStream57.read(byteArray86);
        int int91 = inputStream7.read(byteArray86);
        boolean boolean93 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray86, (int) (short) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(directoryManager41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(directoryManager47);
        org.junit.Assert.assertNotNull(directoryManager51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + compressionType55 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType55.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertNotNull(directoryManager62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + compressionType66 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType66.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream67);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager6 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean8 = directoryManager6.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType10 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream11 = directoryManager6.getInputStreamForFile("user.dir", compressionType10);
        int int12 = inputStream11.available();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = directoryManager2.createFileAtomic("user.dir", inputStream11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write to \"user.dir/user.dir\" since we are in read-only mode.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertNotNull(directoryManager6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + compressionType10 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType10.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4096 + "'", int12 == 4096);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager12.getInputStreamForFile("hi!", compressionType32);
        boolean boolean38 = directoryManager12.hasFile("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.lang.Class<?> wildcardClass8 = directoryManager2.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList11 = directoryManager9.getSubdirectories("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager19 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean21 = directoryManager19.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType23 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream24 = directoryManager19.getInputStreamForFile("user.dir", compressionType23);
        java.io.InputStream inputStream25 = directoryManager15.getInputStreamForFile("hi!", compressionType23);
        java.io.InputStream inputStream26 = directoryManager9.getInputStreamForFile("", compressionType23);
        inputStream26.mark((int) (byte) 100);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertNotNull(directoryManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + compressionType23 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType23.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(inputStream26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        boolean boolean12 = directoryManager10.hasSubdirectory("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream16 = directoryManager12.getOutputStreamForFile("user.dir");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir/user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        int int46 = inputStream7.read(byteArray45);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean46 = directoryManager44.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType48 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream49 = directoryManager44.getInputStreamForFile("hi!", compressionType48);
        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean57 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        boolean boolean59 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray55, (int) (short) 100);
        int int60 = inputStream49.read(byteArray55);
        inputStream49.mark((int) (short) 100);
        byte[] byteArray68 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int69 = inputStream49.read(byteArray68);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        boolean boolean79 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int80 = inputStream49.read(byteArray75);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 100);
        int int83 = inputStream7.read(byteArray75);
        inputStream7.mark(3);
        java.lang.Class<?> wildcardClass86 = inputStream7.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + compressionType48 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType48.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream49);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        inputStream18.mark((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = inputStream18.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        org.wikidata.wdtk.util.DirectoryManager directoryManager21 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean23 = directoryManager21.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType25 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream26 = directoryManager21.getInputStreamForFile("hi!", compressionType25);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean34 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        boolean boolean36 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray32, (int) (short) 100);
        int int37 = inputStream26.read(byteArray32);
        inputStream26.mark((int) (short) 100);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int46 = inputStream26.read(byteArray45);
        boolean boolean48 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray45, (int) (byte) -1);
        int int49 = inputStream7.read(byteArray45);
        boolean boolean50 = inputStream7.markSupported();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(directoryManager21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + compressionType25 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType25.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        boolean boolean11 = directoryManager9.hasFile("");
        java.util.List<java.lang.String> strList13 = directoryManager9.getSubdirectories("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream15 = directoryManager9.getOutputStreamForFile("user.dir");
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.file.FileSystemException; message: user.dir/user.dir: Is a directory");
        } catch (java.nio.file.FileSystemException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager2.getSubdirectories("");
        boolean boolean16 = directoryManager2.hasSubdirectory("");
        // The following exception was thrown during execution in test generation
        try {
            directoryManager2.createFile("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        boolean boolean29 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (-1));
        boolean boolean31 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray26, (int) (byte) 100);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int36 = inputStream7.read(byteArray33);
        int int37 = inputStream7.available();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        long long22 = inputStream18.skip((long) 10);
        inputStream18.mark(0);
        inputStream18.mark((int) (short) 10);
        long long28 = inputStream18.skip((long) (short) 0);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        boolean boolean19 = inputStream18.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            inputStream18.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager14 = directoryManager12.getSubdirectoryManager("");
        boolean boolean16 = directoryManager12.hasSubdirectory("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = null; // flaky: directoryManager12.getSubdirectoryManager("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(directoryManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertNotNull(directoryManager18);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager13 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = directoryManager13.getSubdirectoryManager("");
        org.wikidata.wdtk.util.CompressionType compressionType17 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream18 = directoryManager15.getInputStreamForFile("user.dir", compressionType17);
        java.lang.Class<?> wildcardClass19 = compressionType17.getClass();
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(directoryManager13);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + compressionType17 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType17.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        boolean boolean24 = directoryManager2.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        inputStream18.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream21 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager9 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList11 = directoryManager9.getSubdirectories("");
        boolean boolean13 = directoryManager9.hasFile("user.dir");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager9);
        org.junit.Assert.assertNotNull(strList11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasSubdirectory("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        org.wikidata.wdtk.util.DirectoryManager directoryManager11 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("user.dir", false);
        org.wikidata.wdtk.util.DirectoryManager directoryManager15 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean17 = directoryManager15.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType19 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream20 = directoryManager15.getInputStreamForFile("user.dir", compressionType19);
        java.io.InputStream inputStream21 = directoryManager11.getInputStreamForFile("hi!", compressionType19);
        java.io.InputStream inputStream22 = directoryManager2.getInputStreamForFile("hi!", compressionType19);
        java.util.List<java.lang.String> strList24 = directoryManager2.getSubdirectories("hi!");
        java.util.List<java.lang.String> strList26 = directoryManager2.getSubdirectories("hi!");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(directoryManager11);
        org.junit.Assert.assertNotNull(directoryManager15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + compressionType19 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType19.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        long long29 = inputStream7.skip(100L);
        long long31 = inputStream7.skip(0L);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("");
        boolean boolean8 = directoryManager2.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager10 = directoryManager2.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = directoryManager2.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList14 = directoryManager12.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager18 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean20 = directoryManager18.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager24 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager28 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean30 = directoryManager28.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType32 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream33 = directoryManager28.getInputStreamForFile("user.dir", compressionType32);
        java.io.InputStream inputStream34 = directoryManager24.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream35 = directoryManager18.getInputStreamForFile("hi!", compressionType32);
        java.io.InputStream inputStream36 = directoryManager12.getInputStreamForFile("hi!", compressionType32);
        // The following exception was thrown during execution in test generation
        try {
            inputStream36.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(directoryManager10);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(directoryManager18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(directoryManager24);
        org.junit.Assert.assertNotNull(directoryManager28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + compressionType32 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType32.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(inputStream36);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        java.io.OutputStream outputStream9 = directoryManager2.getOutputStreamForFile("hi!");
        boolean boolean11 = directoryManager2.hasFile("hi!");
        java.util.List<java.lang.String> strList13 = directoryManager2.getSubdirectories("");
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(outputStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        java.util.List<java.lang.String> strList6 = directoryManager2.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager8 = directoryManager2.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager12 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean14 = directoryManager12.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType16 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream17 = directoryManager12.getInputStreamForFile("hi!", compressionType16);
        java.io.InputStream inputStream18 = directoryManager2.getInputStreamForFile("hi!", compressionType16);
        boolean boolean19 = inputStream18.markSupported();
        org.wikidata.wdtk.util.DirectoryManager directoryManager22 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean24 = directoryManager22.hasFile("user.dir");
        java.util.List<java.lang.String> strList26 = directoryManager22.getSubdirectories("");
        boolean boolean28 = directoryManager22.hasFile("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager30 = directoryManager22.getSubdirectoryManager("");
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = directoryManager22.getSubdirectoryManager("user.dir");
        java.util.List<java.lang.String> strList34 = directoryManager32.getSubdirectories("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager38 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean40 = directoryManager38.hasFile("hi!");
        org.wikidata.wdtk.util.DirectoryManager directoryManager44 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", true);
        org.wikidata.wdtk.util.DirectoryManager directoryManager48 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean50 = directoryManager48.hasFile("hi!");
        org.wikidata.wdtk.util.CompressionType compressionType52 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream53 = directoryManager48.getInputStreamForFile("user.dir", compressionType52);
        java.io.InputStream inputStream54 = directoryManager44.getInputStreamForFile("hi!", compressionType52);
        java.io.InputStream inputStream55 = directoryManager38.getInputStreamForFile("hi!", compressionType52);
        java.io.InputStream inputStream56 = directoryManager32.getInputStreamForFile("hi!", compressionType52);
        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean64 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray62, (int) (short) 100);
        int int65 = inputStream56.read(byteArray62);
        int int66 = inputStream18.read(byteArray62);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(directoryManager8);
        org.junit.Assert.assertNotNull(directoryManager12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + compressionType16 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType16.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(directoryManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(directoryManager30);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(directoryManager38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(directoryManager44);
        org.junit.Assert.assertNotNull(directoryManager48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + compressionType52 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType52.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        long long29 = inputStream7.skip((long) ' ');
        org.wikidata.wdtk.util.DirectoryManager directoryManager32 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean34 = directoryManager32.hasFile("user.dir");
        java.util.List<java.lang.String> strList36 = directoryManager32.getSubdirectories("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager38 = directoryManager32.getSubdirectoryManager("user.dir");
        org.wikidata.wdtk.util.DirectoryManager directoryManager42 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean44 = directoryManager42.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType46 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream47 = directoryManager42.getInputStreamForFile("hi!", compressionType46);
        java.io.InputStream inputStream48 = directoryManager32.getInputStreamForFile("hi!", compressionType46);
        org.wikidata.wdtk.util.DirectoryManager directoryManager51 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean53 = directoryManager51.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType55 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream56 = directoryManager51.getInputStreamForFile("hi!", compressionType55);
        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean64 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray62, (int) (short) 100);
        boolean boolean66 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray62, (int) (short) 100);
        int int67 = inputStream56.read(byteArray62);
        inputStream56.mark((int) (short) 100);
        byte[] byteArray75 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int76 = inputStream56.read(byteArray75);
        boolean boolean78 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray75, (int) (short) 0);
        int int79 = inputStream48.read(byteArray75);
        byte[] byteArray85 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean87 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray85, (int) (short) 100);
        boolean boolean89 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray85, (int) (byte) 10);
        int int90 = inputStream48.read(byteArray85);
        boolean boolean92 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray85, 1);
        int int93 = inputStream7.read(byteArray85);
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(directoryManager32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(directoryManager38);
        org.junit.Assert.assertNotNull(directoryManager42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + compressionType46 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType46.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(directoryManager51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + compressionType55 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType55.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager("", false);
        boolean boolean4 = directoryManager2.hasFile("user.dir");
        org.wikidata.wdtk.util.CompressionType compressionType6 = org.wikidata.wdtk.util.CompressionType.NONE;
        java.io.InputStream inputStream7 = directoryManager2.getInputStreamForFile("hi!", compressionType6);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) (short) 100);
        int int18 = inputStream7.read(byteArray13);
        inputStream7.mark((int) (short) 100);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        int int27 = inputStream7.read(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        boolean boolean37 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray33, (int) (short) 100);
        int int38 = inputStream7.read(byteArray33);
        long long40 = inputStream7.skip((long) ' ');
        int int41 = inputStream7.available();
        inputStream7.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(directoryManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + compressionType6 + "' != '" + org.wikidata.wdtk.util.CompressionType.NONE + "'", compressionType6.equals(org.wikidata.wdtk.util.CompressionType.NONE));
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, -1, 100, 100, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }
}
