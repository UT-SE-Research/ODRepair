package org.wikidata.wdtk.util;

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
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test2");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.wikidata.wdtk.util.DirectoryManager directoryManager2 = org.wikidata.wdtk.util.DirectoryManagerFactory.createDirectoryManager(path0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }
}

