package net.sf.marineapi.ais.event;

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
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("VLW");
        boolean boolean12 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        boolean boolean5 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("MTA");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("ROT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("RTE");
        boolean boolean13 = sentenceFactory0.hasParser("Unable to access parser");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("XDR");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("!AIVDM,2,2,3,B,1@0000000000000,2*55");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        boolean boolean8 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("DBT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        boolean boolean14 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("BOD");
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("ALK");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Unable to register parser due security violation");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("VLW");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        boolean boolean10 = sentenceFactory0.hasParser("GST");
        boolean boolean12 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("CUR");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VHW");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("HDM");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        boolean boolean12 = sentenceFactory0.hasParser("VDO");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("ALK");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        boolean boolean10 = sentenceFactory0.hasParser("MHU");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        boolean boolean13 = sentenceFactory0.hasParser("MMB");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("XTE");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("MTA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("VWT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        boolean boolean8 = sentenceFactory0.hasParser("VDR");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("HDG");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("ROT");
        boolean boolean9 = sentenceFactory0.hasParser("MTA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("RTE");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("HDM");
        boolean boolean17 = sentenceFactory0.hasParser("VBW");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("ROT");
        boolean boolean8 = sentenceFactory0.hasParser("GST");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("DTM");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        boolean boolean8 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        boolean boolean3 = sentenceFactory0.hasParser("GLL");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        boolean boolean12 = sentenceFactory0.hasParser("GST");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("BOD");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList16 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        boolean boolean9 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("HDT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        boolean boolean8 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("Unable to instantiate parser");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("XDR");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        boolean boolean12 = sentenceFactory0.hasParser("GNS");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        boolean boolean8 = sentenceFactory0.hasParser("ZDA");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        boolean boolean10 = sentenceFactory0.hasParser("MWV");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        boolean boolean11 = sentenceFactory0.hasParser("GST");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("HDM");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("Unable to instantiate parser");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        boolean boolean8 = sentenceFactory0.hasParser("MTW");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        boolean boolean14 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("GST");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("GST");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("BOD");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("TXT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        boolean boolean11 = sentenceFactory0.hasParser("TXT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        boolean boolean9 = sentenceFactory0.hasParser("GNS");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        boolean boolean4 = sentenceFactory0.hasParser("Unable to instantiate parser");
        boolean boolean6 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MMB");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("RMB");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        boolean boolean13 = sentenceFactory0.hasParser("MTW");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean17 = sentenceFactory0.hasParser("unexpected exception thrown:");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        boolean boolean3 = sentenceFactory0.hasParser("VTG");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("HTC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        boolean boolean9 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("RMB");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("DTM");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("BOD");
        boolean boolean11 = sentenceFactory0.hasParser("MHU");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        boolean boolean4 = sentenceFactory0.hasParser("APB");
        boolean boolean6 = sentenceFactory0.hasParser("VDR");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        boolean boolean8 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("");
        boolean boolean13 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        boolean boolean8 = sentenceFactory0.hasParser("ZDA");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("GST");
        boolean boolean13 = sentenceFactory0.hasParser("hi!");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("DBT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("VLW");
        boolean boolean12 = sentenceFactory0.hasParser("HTC");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList15 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("HTC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        boolean boolean8 = sentenceFactory0.hasParser("TXT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        boolean boolean8 = sentenceFactory0.hasParser("MTW");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("ALK");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("VTG");
        sentenceFactory0.reset();
        boolean boolean13 = sentenceFactory0.hasParser("Unable to register parser due security violation");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("VLW");
        boolean boolean12 = sentenceFactory0.hasParser("WPL");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("XDR");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("RTE");
        boolean boolean11 = sentenceFactory0.hasParser("HTC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("1");
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        boolean boolean8 = sentenceFactory0.hasParser("XTE");
        boolean boolean10 = sentenceFactory0.hasParser("RTE");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean10 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean13 = sentenceFactory0.hasParser("MTA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("RPM");
        boolean boolean8 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        boolean boolean13 = sentenceFactory0.hasParser("HDG");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        boolean boolean8 = sentenceFactory0.hasParser("ZDA");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("GST");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList17 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        boolean boolean10 = sentenceFactory0.hasParser("GST");
        boolean boolean12 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("!AIVDM,2,2,3,B,1@0000000000000,2*55");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean15 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("!AIVDM,2,2,3,B,1@0000000000000,2*55");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("1");
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("GGA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("HDM");
        boolean boolean17 = sentenceFactory0.hasParser("APB");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        boolean boolean13 = sentenceFactory0.hasParser("exception not thrown, resolved to");
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList17 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList18 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("XDR");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        boolean boolean4 = sentenceFactory0.hasParser("Unable to instantiate parser");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        boolean boolean8 = sentenceFactory0.hasParser("XTE");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        boolean boolean4 = sentenceFactory0.hasParser("APB");
        boolean boolean6 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("TalkerId cannot be null");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("ROT");
        boolean boolean8 = sentenceFactory0.hasParser("GST");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("ROT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("VDO");
        boolean boolean10 = sentenceFactory0.hasParser("GST");
        boolean boolean12 = sentenceFactory0.hasParser("GBS");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("ROT");
        boolean boolean9 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("unexpected exception thrown:");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("RTE");
        boolean boolean13 = sentenceFactory0.hasParser("HTC");
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        boolean boolean16 = sentenceFactory0.hasParser("RMC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("BOD");
        boolean boolean7 = sentenceFactory0.hasParser("XDR");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        boolean boolean8 = sentenceFactory0.hasParser("MTW");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("HDT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        boolean boolean11 = sentenceFactory0.hasParser("DBT");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("VDR");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        boolean boolean8 = sentenceFactory0.hasParser("TTM");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("1");
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        boolean boolean9 = sentenceFactory0.hasParser("HTC");
        boolean boolean11 = sentenceFactory0.hasParser("VDO");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("unexpected exception thrown:");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("RTE");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("TalkerId cannot be null");
        boolean boolean13 = sentenceFactory0.hasParser("DBT");
        boolean boolean15 = sentenceFactory0.hasParser("GST");
        sentenceFactory0.reset();
        boolean boolean18 = sentenceFactory0.hasParser("VWR");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("MTW");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        boolean boolean6 = sentenceFactory0.hasParser("Constructor with %s parameter not found");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("VDR");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        boolean boolean8 = sentenceFactory0.hasParser("MTW");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("APB");
        boolean boolean14 = sentenceFactory0.hasParser("CUR");
        java.util.List<java.lang.String> strList15 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("ROT");
        boolean boolean8 = sentenceFactory0.hasParser("GST");
        boolean boolean10 = sentenceFactory0.hasParser("CUR");
        boolean boolean12 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("VWR");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        boolean boolean9 = sentenceFactory0.hasParser("Cannot resolve generic type <T>, use constructor with Class<T> param.");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("VDM");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("HTC");
        boolean boolean8 = sentenceFactory0.hasParser("MTW");
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        boolean boolean14 = sentenceFactory0.hasParser("GST");
        boolean boolean16 = sentenceFactory0.hasParser("Required constructors not found; SentenceParser(String), SentenceParser(TalkerId)");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VDO");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("DTM");
        boolean boolean11 = sentenceFactory0.hasParser("GNS");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("hi!");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList9 = sentenceFactory0.listParsers();
        boolean boolean11 = sentenceFactory0.hasParser("GNS");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("ROT");
        boolean boolean8 = sentenceFactory0.hasParser("HTC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("TalkerId cannot be null");
        boolean boolean13 = sentenceFactory0.hasParser("DBT");
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList14 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList15 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        java.util.List<java.lang.String> strList4 = sentenceFactory0.listParsers();
        boolean boolean6 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        boolean boolean5 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("TalkerId cannot be null");
        sentenceFactory0.reset();
        boolean boolean10 = sentenceFactory0.hasParser("VWT");
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        boolean boolean6 = sentenceFactory0.hasParser("MWD");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("GSV");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("MWD");
        boolean boolean9 = sentenceFactory0.hasParser("MMB");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("VTG");
        boolean boolean14 = sentenceFactory0.hasParser("hi!");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("RTE");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList13 = sentenceFactory0.listParsers();
        boolean boolean15 = sentenceFactory0.hasParser("BOD");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList11 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MWV");
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        boolean boolean7 = sentenceFactory0.hasParser("XTE");
        boolean boolean9 = sentenceFactory0.hasParser("!AIVDM,2,1,3,B,55P5TL01VIaAL@7WKO@mBplU@<PDhh000000001S;AJ::4A80?4i@E53,0*3E");
        sentenceFactory0.reset();
        boolean boolean12 = sentenceFactory0.hasParser("XTE");
        boolean boolean14 = sentenceFactory0.hasParser("GSA");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("DTM");
        sentenceFactory0.reset();
        boolean boolean9 = sentenceFactory0.hasParser("RMC");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("DPT");
        java.util.List<java.lang.String> strList7 = sentenceFactory0.listParsers();
        boolean boolean9 = sentenceFactory0.hasParser("hi!");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        boolean boolean3 = sentenceFactory0.hasParser("VDM");
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("GSV");
        boolean boolean8 = sentenceFactory0.hasParser("ZDA");
        sentenceFactory0.reset();
        boolean boolean11 = sentenceFactory0.hasParser("GST");
        java.util.List<java.lang.String> strList12 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList8 = sentenceFactory0.listParsers();
        boolean boolean10 = sentenceFactory0.hasParser("!AIVDM,2,2,3,B,1@0000000000000,2*55");
        boolean boolean12 = sentenceFactory0.hasParser("RMB");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean6 = sentenceFactory0.hasParser("VHW");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("VLW");
        boolean boolean11 = sentenceFactory0.hasParser("RTE");
        boolean boolean13 = sentenceFactory0.hasParser("");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList5 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        boolean boolean8 = sentenceFactory0.hasParser("Unable to invoke parser constructor");
        sentenceFactory0.reset();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        java.util.List<java.lang.String> strList6 = sentenceFactory0.listParsers();
        boolean boolean8 = sentenceFactory0.hasParser("TalkerId cannot be null");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        java.util.List<java.lang.String> strList1 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList2 = sentenceFactory0.listParsers();
        java.util.List<java.lang.String> strList3 = sentenceFactory0.listParsers();
        sentenceFactory0.reset();
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("Unable to instantiate parser");
        boolean boolean9 = sentenceFactory0.hasParser("HDG");
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.sf.marineapi.nmea.parser.SentenceFactory sentenceFactory0 = net.sf.marineapi.nmea.parser.SentenceFactory.getInstance();
        boolean boolean2 = sentenceFactory0.hasParser("");
        boolean boolean4 = sentenceFactory0.hasParser("MDA");
        sentenceFactory0.reset();
        boolean boolean7 = sentenceFactory0.hasParser("");
        boolean boolean9 = sentenceFactory0.hasParser("Parser for type '%s' not found");
        java.util.List<java.lang.String> strList10 = sentenceFactory0.listParsers();
        org.junit.Assert.assertNotNull(sentenceFactory0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
    }
}

