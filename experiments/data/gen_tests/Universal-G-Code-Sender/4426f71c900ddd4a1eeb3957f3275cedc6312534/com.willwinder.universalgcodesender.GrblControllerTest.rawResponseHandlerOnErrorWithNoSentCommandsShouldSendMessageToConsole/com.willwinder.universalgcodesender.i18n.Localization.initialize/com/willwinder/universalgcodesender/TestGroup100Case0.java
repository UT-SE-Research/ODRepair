package com.willwinder.universalgcodesender;

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
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:18", "Couldn't find translations for the locale");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Running,MPos:1.0,2.0,3.0>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Running,MPos:1.0,2.0,3.0>>" + "'", str1, "<<Running,MPos:1.0,2.0,3.0>>");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = com.willwinder.universalgcodesender.i18n.Localization.getStrings();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "G0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("$G");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<$G>" + "'", str1, "<$G>");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Not connected>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Not connected>>" + "'", str1, "<<Not connected>>");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("ISO-8859-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<ISO-8859-1>" + "'", str1, "<ISO-8859-1>");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("unitTestMode", "Unexpected exception while testing rawResponseListener:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "rawResponseListener");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("blah", "Error while processing response <error:1>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Couldn't find translations for the locale", "G28 X0 Y0 Z0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("beginStreaming", "<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0", "<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.", "REAL_TIME");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("issueSoftReset");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<issueSoftReset>" + "'", str1, "<issueSoftReset>");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G0X1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G0X1>" + "'", str1, "<G0X1>");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl has not finished booting.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl has not finished booting.>" + "'", str1, "<Grbl has not finished booting.>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("cancelSend", "beginStreaming");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<$G>", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Unexpected exception from command sent:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Unexpected exception from command sent:>" + "'", str1, "<Unexpected exception from command sent:>");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 1.1f");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 1.1f>" + "'", str1, "<Grbl 1.1f>");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<>" + "'", str1, "<>");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("rawResponseListener", "G90 G0 X0 Y0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<$G>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<$G>>" + "'", str1, "<<$G>>");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("beginStreaming");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<beginStreaming>" + "'", str1, "<beginStreaming>");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "blah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en_US", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("cancelSend", "jogMachineTo");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("There are no commands queued for streaming.", "An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Idle,WPos:1,2,3,MPos:1,2,3>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Idle,WPos:1,2,3,MPos:1,2,3>>" + "'", str1, "<<Idle,WPos:1,2,3,MPos:1,2,3>>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<beginStreaming>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<beginStreaming>>" + "'", str1, "<<beginStreaming>>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en", "An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("commandComplete");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<commandComplete>" + "'", str1, "<commandComplete>");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("We should be in sending mode", "G90 G21");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<$$>" + "'", str1, "<$$>");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("resumeStreaming");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<resumeStreaming>" + "'", str1, "<resumeStreaming>");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("gcodeFile");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<gcodeFile>" + "'", str1, "<gcodeFile>");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<", "G21G90 G0Z10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("The machine is in the material, go to zero with the Z axis first");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<The machine is in the material, go to zero with the Z axis first>" + "'", str1, "<The machine is in the material, go to zero with the Z axis first>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize(">", ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>" + "'", str1, "<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.8>" + "'", str1, "<Grbl 0.8>");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Cannot stream while there are active commands:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Cannot stream while there are active commands:>" + "'", str1, "<Cannot stream while there are active commands:>");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<$$>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<$$>>" + "'", str1, "<<$$>>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en_US", "<<Idle,WPos:1,2,3,MPos:1,2,3>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("foo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<foo>" + "'", str1, "<foo>");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("jogMachine", "Grbl 0.5b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$J=G21G91Y10F11", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString(">");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<>>" + "'", str1, "<>>");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<gcodeFile>", "The machine is in the material, go to zero with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("issueSoftReset", "<issueSoftReset>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("cancelSend");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<cancelSend>" + "'", str1, "<cancelSend>");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("test message");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<test message>" + "'", str1, "<test message>");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Not connected>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Not connected>>>" + "'", str1, "<<<Not connected>>>");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("View all grbl settings", "$H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("resources.MessagesBundle", ">");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.9>" + "'", str1, "<Grbl 0.9>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Running,MPos:1.0,2.0,3.0>>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.57", "G21G91G1Y10F11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>" + "'", str1, "<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("beginStreaming", "<Grbl 1.1f>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("error:1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<error:1>" + "'", str1, "<error:1>");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from command sent:>", "No supported homing method for this version.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>" + "'", str1, "<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("pauseStreaming");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<pauseStreaming>" + "'", str1, "<pauseStreaming>");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Grbl has not finished booting.>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Grbl has not finished booting.>>" + "'", str1, "<<Grbl has not finished booting.>>");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0X0", "<Cannot stream while there are active commands:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("rawResponseListener");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<rawResponseListener>" + "'", str1, "<rawResponseListener>");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("blah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<blah>" + "'", str1, "<blah>");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Comm port is already open.", "G90");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "View gcode parser state");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<>" + "'", str1, "<<>");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<Grbl has not finished booting.>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,-1.0>", "<blah blah blah>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>" + "'", str1, "<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0X0", "<<Running,MPos:1.0,2.0,3.0>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G0X1>", "<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,-1.0>", "An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("serialPort", "<pauseStreaming>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>", "$J=G21G91Y10F11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<en>" + "'", str1, "<en>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.8c");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.8c>" + "'", str1, "<Grbl 0.8c>");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0 X10", "<G0X1>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1.235Y2F200", "<issueSoftReset>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Cannot stream while there are active commands (controller).", "resumeStreaming");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("$J=G20G91X-10Z10F11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<$J=G20G91X-10Z10F11>" + "'", str1, "<$J=G20G91X-10Z10F11>");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$G", "Go to XY-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Pause + cancelSend", "<<Running,MPos:1.0,2.0,3.0>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Unexpected exception while testing rawResponseListener:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Unexpected exception while testing rawResponseListener:>" + "'", str1, "<Unexpected exception while testing rawResponseListener:>");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Hold,MPos:1.0,2.0,3.0>", "<resumeStreaming>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<$$>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<$$>>>" + "'", str1, "<<<$$>>>");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G0 X1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G0 X1>" + "'", str1, "<G0 X1>");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G91G1X-10Z10F11", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.57", "Unexpected exception from command sent:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1.235Y2F200", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Not connected>>>", "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception while testing rawResponseListener:>", "Grbl 0.8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Grbl 1.1f>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Grbl 1.1f>>" + "'", str1, "<<Grbl 1.1f>>");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<$G>>", "<foo>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "No supported homing method for this version.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("unitTestMode");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unitTestMode>" + "'", str1, "<unitTestMode>");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("resources.MessagesBundle", "G0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<blah>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<blah>>" + "'", str1, "<<blah>>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "testPolling (via rawResponseListener)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("View all grbl settings");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<View all grbl settings>" + "'", str1, "<View all grbl settings>");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("performHomingCycle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<performHomingCycle>" + "'", str1, "<performHomingCycle>");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl has not finished booting.", "G0X1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("We should be in sending mode");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<We should be in sending mode>" + "'", str1, "<We should be in sending mode>");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<>", "Go to XY-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0X0", "We should be in sending mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8c", "<Running,MPos:1.0,2.0,3.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Unexpected exception testing cancelSend:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Unexpected exception testing cancelSend:>" + "'", str1, "<Unexpected exception testing cancelSend:>");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("ISO-8859-1", "issueSoftReset");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("REAL_TIME");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<REAL_TIME>" + "'", str1, "<REAL_TIME>");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<REAL_TIME>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<REAL_TIME>>" + "'", str1, "<<REAL_TIME>>");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8>", "ISO-8859-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("The machine is in the material, go to safety height in inches with the Z axis first", "G0X");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<$$>", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G20G90G1X1Y2F200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G20G90G1X1Y2F200>" + "'", str1, "<G20G90G1X1Y2F200>");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8c", "<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.>" + "'", str1, "<An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.>");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.", "G0 X0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en", "Cannot stream while there are active commands:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>" + "'", str1, "<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G20G90G1X1Y2F200>", "<commandComplete>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G0X1>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G0X1>>" + "'", str1, "<<G0X1>>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Grbl has not finished booting.>>", "<beginStreaming>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<View all grbl settings>", "testPolling (via rawResponseListener)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G21>" + "'", str1, "<G21>");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Comm port is already open.", "Grbl 0.8c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<REAL_TIME>>", "<Grbl has not finished booting.>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<issueSoftReset>", "G20G90 G0Z0.394");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Hold,MPos:1.0,2.0,3.0>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Hold,MPos:1.0,2.0,3.0>>" + "'", str1, "<<Hold,MPos:1.0,2.0,3.0>>");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<foo>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<foo>>" + "'", str1, "<<foo>>");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("The machine is in the material, go to zero with the Z axis first", "serialPort");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:18", "An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<", "rawResponseListener");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<REAL_TIME>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("jogMachine");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<jogMachine>" + "'", str1, "<jogMachine>");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,WPos:1,2,3,MPos:1,2,3>", "pauseStreaming");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.8a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.8a>" + "'", str1, "<Grbl 0.8a>");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:1", "test message");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Pause + cancelSend", "<test message>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8c>", "queueStringForComm");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("resources.MessagesBundle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<resources.MessagesBundle>" + "'", str1, "<resources.MessagesBundle>");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>" + "'", str1, "<<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.", "error:1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("$H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<$H>" + "'", str1, "<$H>");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 1.1a", "<<$G>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("No supported homing method for");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<No supported homing method for>" + "'", str1, "<No supported homing method for>");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1Y2F200", "<<Grbl 1.1f>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8>", "Cannot stream while there are active commands (controller).");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Grbl 1.1f>>", "unitTestMode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<hi!>" + "'", str1, "<hi!>");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<test message>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<test message>>" + "'", str1, "<<test message>>");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<The machine is in the material, go to zero with the Z axis first>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize(">", "performHomingCycle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("View gcode parser state", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("serialPort");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<serialPort>" + "'", str1, "<serialPort>");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G90G1X1Y2F200", "<cancelSend>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<>", "test message");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0X", "<<Grbl 1.1f>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>>" + "'", str1, "<<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>>");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<cancelSend>", "<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<The machine is in the material, go to zero with the Z axis first>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<The machine is in the material, go to zero with the Z axis first>>" + "'", str1, "<<The machine is in the material, go to zero with the Z axis first>>");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl has not finished booting.", "<jogMachine>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<commandComplete>", "<resources.MessagesBundle>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("getSendDuration", "<Grbl 1.1f>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("The machine is in the material, go to safety height in mm with the Z axis first");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<The machine is in the material, go to safety height in mm with the Z axis first>" + "'", str1, "<The machine is in the material, go to safety height in mm with the Z axis first>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<rawResponseListener>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<rawResponseListener>>" + "'", str1, "<<rawResponseListener>>");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.>", "<Unexpected exception from command sent:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en_US", "<The machine is in the material, go to zero with the Z axis first>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G0 X1>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G0 X1>>" + "'", str1, "<<G0 X1>>");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8a", "The machine is in the material, go to zero with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<hi!>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<hi!>>" + "'", str1, "<<hi!>>");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G90 G0 Z0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G90 G0 Z0>" + "'", str1, "<G90 G0 Z0>");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$J=G21G91Y10F11", "G90 G21");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<resumeStreaming>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<resumeStreaming>>" + "'", str1, "<<resumeStreaming>>");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<en_US>" + "'", str1, "<en_US>");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Unexpected exception from command complete:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Unexpected exception from command complete:>" + "'", str1, "<Unexpected exception from command complete:>");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G0 X1>>", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("gcodeFile", "<serialPort>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,WPos:1,2,3,MPos:1,2,3>", "jogMachineTo");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception while testing rawResponseListener:>", "G21G90 G0Z10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from command complete:>", "pauseStreaming");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,-1.0>", "error:18");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("serialPort", "<Grbl 0.8>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G21G90 G0Z10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G21G90 G0Z10>" + "'", str1, "<G21G90 G0Z10>");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Go to Z-zero", "An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<The machine is in the material, go to zero with the Z axis first>", "$G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<REAL_TIME>>", "Go to Z-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<foo>>", "<blah>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<performHomingCycle>", "<Grbl has not finished booting.>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G0 X1>>", "<<test message>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<error:1>", "The machine is in the material, go to safety height in inches with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Unexpected exception while testing rawResponseListener:>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Unexpected exception while testing rawResponseListener:>>" + "'", str1, "<<Unexpected exception while testing rawResponseListener:>>");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Running,MPos:1.0,2.0,3.0>>", "Grbl 0.57");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Go to XY-zero");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Go to XY-zero>" + "'", str1, "<Go to XY-zero>");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<beginStreaming>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<beginStreaming>>>" + "'", str1, "<<<beginStreaming>>>");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.9>", "Unexpected exception from command complete:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<>>" + "'", str1, "<<>>");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G0 X0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G0 X0>" + "'", str1, "<G0 X0>");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Grbl 1.1f>>", "queueStringForComm");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("ok");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<ok>" + "'", str1, "<ok>");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<pauseStreaming>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<pauseStreaming>>" + "'", str1, "<<pauseStreaming>>");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G20G90G1X1Y2F200>", "G21G90G1X1Y2Z3F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("UTF-8", "<$H>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.9", "Couldn't find translations for the locale");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G20G90G1X1Y2F200>", "Cannot stream while there are active commands:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<foo>>", "G21G90G1X1Y2F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Hold,MPos:1.0,2.0,3.0>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Hold,MPos:1.0,2.0,3.0>>>" + "'", str1, "<<<Hold,MPos:1.0,2.0,3.0>>>");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<$H>", "G0 X10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G91G1X-10Z10F11", "Cannot stream while there are active commands:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>", "<REAL_TIME>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("blah", "isReadyToStreamFile");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<jogMachine>", "<<>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<en>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<en>>" + "'", str1, "<<en>>");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90 G0Z10", "G90 G0 X0 Y0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<performHomingCycle>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<performHomingCycle>>" + "'", str1, "<<performHomingCycle>>");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1Y2F200", "<<G0 X1>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G90 G0 Z0>", "error:1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<en>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<en>>>" + "'", str1, "<<<en>>>");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<ISO-8859-1>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<ISO-8859-1>>" + "'", str1, "<<ISO-8859-1>>");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Not connected>>>", "<>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G90 G0 Z0", "<issueSoftReset>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8a", "Unexpected exception from command sent:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.5b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.5b>" + "'", str1, "<Grbl 0.5b>");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8a>", "<$H>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception testing cancelSend:>", "<Check,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>", "G20G90 G0Z0.394");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize(">", "issueSoftReset");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<test message>>", "<<<beginStreaming>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.57", "<G20G90G1X1Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<>>", "Grbl 0.9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("testPolling (via rawResponseListener)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Unexpected exception while testing rawResponseListener:>>", "<<Not connected>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("View gcode parser state", "<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("ISO-8859-1", "G20G90 G0Z0.394");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("ok", "<We should be in sending mode>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Not connected>>>", "<Idle,WPos:1,2,3,MPos:1,2,3>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<pauseStreaming>", "<We should be in sending mode>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>>" + "'", str1, "<<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>>");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<foo>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<foo>>>" + "'", str1, "<<<foo>>>");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Error while processing response <error:1>", "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8a", "No supported homing method for this version.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>", "G90");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:1", "testPolling (via rawResponseListener)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$$", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 1.1f>", "<>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString(". Reverts to en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<. Reverts to en_US>" + "'", str1, "<. Reverts to en_US>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception while testing rawResponseListener:>", "Grbl 0.57");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>", "<An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>", "<resources.MessagesBundle>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<$$>>>", "<$G>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Not connected>>>", "<rawResponseListener>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<. Reverts to en_US>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<. Reverts to en_US>>" + "'", str1, "<<. Reverts to en_US>>");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<error:1>", "<G21G90 G0Z10>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<beginStreaming>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<beginStreaming>>>>" + "'", str1, "<<<<beginStreaming>>>>");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G21G90 G0Z10>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G21G90 G0Z10>>" + "'", str1, "<<G21G90 G0Z10>>");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.", "No supported homing method for");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("View gcode parser state");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<View gcode parser state>" + "'", str1, "<View gcode parser state>");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>", "<performHomingCycle>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<beginStreaming>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<beginStreaming>>>>>" + "'", str1, "<<<<<beginStreaming>>>>>");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<serialPort>", "<<foo>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<The machine is in the material, go to zero with the Z axis first>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<The machine is in the material, go to zero with the Z axis first>>>" + "'", str1, "<<<The machine is in the material, go to zero with the Z axis first>>>");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Not connected>>", "<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("queueStringForComm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<queueStringForComm>" + "'", str1, "<queueStringForComm>");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("The machine is in the material, go to safety height in mm with the Z axis first", "Go to XY-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<hi!>>", "Grbl 0.57");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<REAL_TIME>", "gcodeFile");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<REAL_TIME>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<REAL_TIME>>>" + "'", str1, "<<<REAL_TIME>>>");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<blah>>", "G90");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<>>" + "'", str1, "<<<>>");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("There are no commands queued for streaming.", "gcodeFile");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<<beginStreaming>>>>", "<<Not connected>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<>>>" + "'", str1, "<<<>>>");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("hi!", "<error:1>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "The machine is in the material, go to safety height in inches with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<The machine is in the material, go to safety height in mm with the Z axis first>", "Grbl 0.8c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>>", "G20G91G1X-10Z10F11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G20G90G1X1Y2F200>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G20G90G1X1Y2F200>>" + "'", str1, "<<G20G90G1X1Y2F200>>");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>", "<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("error:18");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<error:18>" + "'", str1, "<error:18>");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>" + "'", str1, "<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.7");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.7>" + "'", str1, "<Grbl 0.7>");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<error:18>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<error:18>>" + "'", str1, "<<error:18>>");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("resources.MessagesBundle", "ok");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("en", "getGrblVersion");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<Hold,MPos:1.0,2.0,3.0>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<Hold,MPos:1.0,2.0,3.0>>>>" + "'", str1, "<<<<Hold,MPos:1.0,2.0,3.0>>>>");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<<<beginStreaming>>>>>", "error:18");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0", "rawResponseListener");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>", "<");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<serialPort>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<serialPort>>" + "'", str1, "<<serialPort>>");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.", "<Grbl 0.7>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<cancelSend>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<cancelSend>>" + "'", str1, "<<cancelSend>>");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<resumeStreaming>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<resumeStreaming>>>" + "'", str1, "<<<resumeStreaming>>>");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl has not finished booting.", "Grbl 0.5b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Grbl has not finished booting.>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Grbl has not finished booting.>>>" + "'", str1, "<<<Grbl has not finished booting.>>>");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Not connected>>>", "<<REAL_TIME>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("isReadyToStreamFile", "Go to Z-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("We should start with a non idle state", "<<<en>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Cannot stream while there are active commands:>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Cannot stream while there are active commands:>>" + "'", str1, "<<Cannot stream while there are active commands:>>");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<The machine is in the material, go to zero with the Z axis first>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<The machine is in the material, go to zero with the Z axis first>>>>" + "'", str1, "<<<<The machine is in the material, go to zero with the Z axis first>>>>");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<>>>" + "'", str1, "<<<<>>>");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("resumeStreaming", "<<performHomingCycle>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8a>", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("$J=G21G91Y10F11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<$J=G21G91Y10F11>" + "'", str1, "<$J=G21G91Y10F11>");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Grbl 0.8>", "serialPort");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<rawResponseListener>", "Grbl 0.5b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G21>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G21>>" + "'", str1, "<<G21>>");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 0.57");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 0.57>" + "'", str1, "<Grbl 0.57>");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Unexpected exception from Thread.sleep:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Unexpected exception from Thread.sleep:>" + "'", str1, "<Unexpected exception from Thread.sleep:>");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<$J=G21G91Y10F11>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<$J=G21G91Y10F11>>" + "'", str1, "<<$J=G21G91Y10F11>>");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Grbl has not finished booting.>>", "<<<<>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.>", "<G0X1>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Grbl 0.7>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Grbl 0.7>>" + "'", str1, "<<Grbl 0.7>>");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G0 X1>>", "G28 X0 Y0 Z0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("serialPort", "Unexpected exception from GrblController:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G90 G0Z0.394", "<<error:18>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<<Grbl 1.1f>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Cannot stream while there are active commands:>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Cannot stream while there are active commands:>>>" + "'", str1, "<<<Cannot stream while there are active commands:>>>");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<$$>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<ok>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<ok>>" + "'", str1, "<<ok>>");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<en>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<en>>>>" + "'", str1, "<<<<en>>>>");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G21G90G1X1Y2F200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G21G90G1X1Y2F200>" + "'", str1, "<G21G90G1X1Y2F200>");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("isReadyToStreamFile");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<isReadyToStreamFile>" + "'", str1, "<isReadyToStreamFile>");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8c", "$H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G91G1X-10Z10F11", "<<G21G90 G0Z10>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Hold,MPos:1.0,2.0,3.0>", "<$J=G20G91X-10Z10F11>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Unexpected exception testing cancelSend:>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Unexpected exception testing cancelSend:>>" + "'", str1, "<<Unexpected exception testing cancelSend:>>");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Run|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>", "<No supported homing method for>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.57", ". Reverts to en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("queueStringForComm", "<<<foo>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G21G90G1X1.235Y2F200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G21G90G1X1.235Y2F200>" + "'", str1, "<G21G90G1X1.235Y2F200>");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<G21>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<G21>>>" + "'", str1, "<<<G21>>>");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Idle,WPos:1,2,3,MPos:1,2,3>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Idle,WPos:1,2,3,MPos:1,2,3>>>" + "'", str1, "<<<Idle,WPos:1,2,3,MPos:1,2,3>>>");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G28 X0 Y0 Z0", "<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>>" + "'", str1, "<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>>");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<REAL_TIME>", "cancelSend");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Grbl has not finished booting.>>>", "<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,11.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from command sent:>", "queueStringForComm");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<. Reverts to en_US>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Comm port is already open.", "<<G0X1>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$J=G21G91Y10F11", "<<>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "An error was detected while sending 'G0': (error:1) G-code words consist of a letter and a value. Letter was not found. Streaming has been paused.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Not connected>>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1Y2F200", "<G21G90G1X1.235Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<pauseStreaming>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<gcodeFile>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<gcodeFile>>" + "'", str1, "<<gcodeFile>>");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G0X1>>", "performHomingCycle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<ISO-8859-1>", "G20G90G1X1Y2F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("test message", "resources.MessagesBundle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.8a", "REAL_TIME");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<$G>>", "<G21>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<blah>", "<G21G90G1X1.235Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Grbl 1.1a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Grbl 1.1a>" + "'", str1, "<Grbl 1.1a>");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<No supported homing method for>", "<<error:18>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<>>", "G21G90G1X1Y2F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<test message>>", "We should start with a non idle state");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("We should start with a non idle state");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<We should start with a non idle state>" + "'", str1, "<We should start with a non idle state>");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.>" + "'", str1, "<An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.>");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Unexpected exception testing cancelSend:", "Cannot stream while there are active commands (controller).");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "$G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<foo>", "View all grbl settings");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<jogMachine>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<jogMachine>>" + "'", str1, "<<jogMachine>>");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("G90 G0 X0 Y0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<G90 G0 X0 Y0>" + "'", str1, "<G90 G0 X0 Y0>");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Unexpected exception while testing rawResponseListener:", "jogMachine");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<$$>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<$$>>>>" + "'", str1, "<<<<$$>>>>");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<isReadyToStreamFile>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<isReadyToStreamFile>>" + "'", str1, "<<isReadyToStreamFile>>");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Unexpected exception testing cancelSend:>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Unexpected exception testing cancelSend:>>>" + "'", str1, "<<<Unexpected exception testing cancelSend:>>>");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:1", "<<performHomingCycle>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<beginStreaming>>>", "<error:1>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception testing cancelSend:>", "Unexpected exception from command complete:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>" + "'", str1, "<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<$G>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<$G>>>" + "'", str1, "<<<$G>>>");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<ISO-8859-1>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<ISO-8859-1>>>" + "'", str1, "<<<ISO-8859-1>>>");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<Grbl has not finished booting.>>>", "<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<blah blah blah>", "Go to Z-zero");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,-1.0>", "Grbl 1.1f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<. Reverts to en_US>", "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from Thread.sleep:>", "jogMachine");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<G21G90 G0Z10>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<G21G90 G0Z10>>>" + "'", str1, "<<<G21G90 G0Z10>>>");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<$J=G20G91X-10Z10F11>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<$J=G20G91X-10Z10F11>>" + "'", str1, "<<$J=G20G91X-10Z10F11>>");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>", "<$$>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1Y2F200", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<gcodeFile>>", "<<Hold,MPos:1.0,2.0,3.0>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<unitTestMode>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<unitTestMode>>" + "'", str1, "<<unitTestMode>>");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<G0 X0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<G21>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<G21>>>>" + "'", str1, "<<<<G21>>>>");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G21G90 G0Z10>", "Pause + cancelSend");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "<G21G90G1X1Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21", "<serialPort>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from command sent:>", "<<G0 X1>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>>", "rawResponseListener");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G0X0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<cancelSend>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<cancelSend>>>" + "'", str1, "<<<cancelSend>>>");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<serialPort>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<serialPort>>>" + "'", str1, "<<<serialPort>>>");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Unexpected exception from Thread.sleep:>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Unexpected exception from Thread.sleep:>>" + "'", str1, "<<Unexpected exception from Thread.sleep:>>");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Hold,MPos:1.0,2.0,3.0>>", "<test message>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<>>", "<Grbl 0.57>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<beginStreaming>>", "isReadyToStreamFile");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<beginStreaming>", ". Reverts to en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("jogMachineTo", "<<<<The machine is in the material, go to zero with the Z axis first>>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>>" + "'", str1, "<<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>>");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("View all grbl settings", "<$J=G20G91X-10Z10F11>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception while testing rawResponseListener:>", "jogMachineTo");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>" + "'", str1, "<<<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Grbl 0.8>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Grbl 0.8>>" + "'", str1, "<<Grbl 0.8>>");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<$H>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<$H>>" + "'", str1, "<<$H>>");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Idle,WPos:1,2,3,MPos:1,2,3>>", "<<<$G>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G0 X0>", "<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Cannot stream while there are active commands:>>", "Unexpected exception while testing rawResponseListener:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>" + "'", str1, "<<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<foo>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<foo>>>>" + "'", str1, "<<<<foo>>>>");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<resumeStreaming>>", "$G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An error was detected while sending 'G21': (error:18) An unknown error has occurred. Streaming has been paused.", "<<$G>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G21>>", "<Running,MPos:1.0,2.0,3.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("test message", "G21G90G1X1.235Y2F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>>>" + "'", str1, "<<<<Idle,MPos:1.000,1.000,1.000,WPos:0.0,0.0,0.0>>>>");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 0.5b", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("jogMachine", "<<<Hold,MPos:1.0,2.0,3.0>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Unexpected exception from command complete:>", "<Unexpected exception from command complete:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test427");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<en>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<en>>>>>" + "'", str1, "<<<<<en>>>>>");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test428");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "ok");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test429");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("error:18", "Grbl 0.8a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test430");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("We should be in sending mode", "<View gcode parser state>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test431");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Running,MPos:1.0,2.0,3.0>", "<<<>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test432");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<rawResponseListener>", "The machine is in the material, go to safety height in mm with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test433");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("We should be in check mode");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<We should be in check mode>" + "'", str1, "<We should be in check mode>");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test434");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G21G90 G0Z10>", "G0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test435");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<Grbl 0.8>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<Grbl 0.8>>>" + "'", str1, "<<<Grbl 0.8>>>");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test436");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<rawResponseListener>>", "<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test437");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<resources.MessagesBundle>", "The machine is in the material, go to safety height in mm with the Z axis first");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test438");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<Hold,MPos:1.0,2.0,3.0>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<Hold,MPos:1.0,2.0,3.0>>>>>" + "'", str1, "<<<<<Hold,MPos:1.0,2.0,3.0>>>>>");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test439");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Couldn't find translations for the locale");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Couldn't find translations for the locale>" + "'", str1, "<Couldn't find translations for the locale>");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test440");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<performHomingCycle>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<performHomingCycle>>>" + "'", str1, "<<<performHomingCycle>>>");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test441");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G90G1X1Y2F200", "<Running,MPos:1.0,2.0,3.0>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test442");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<ISO-8859-1>>>", "<<gcodeFile>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test443");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Not connected>>", "G21G91G1Y10F11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test444");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<beginStreaming>>", "resources.MessagesBundle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test445");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<$G>", "Grbl 0.57");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test446");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<blah>>", "View gcode parser state");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test447");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Unexpected exception from command complete:", "queueStringForComm");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test448");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<<<Hold,MPos:1.0,2.0,3.0>>>>>", "<<>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test449");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("serialPort", "Grbl 0.7");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test450");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("We should be in check mode", "<<Hold|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test451");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Unexpected exception from command sent:>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Unexpected exception from command sent:>>" + "'", str1, "<<Unexpected exception from command sent:>>");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test452");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("performHomingCycle", "<<Hold,MPos:1.0,2.0,3.0>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test453");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<gcodeFile>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<gcodeFile>>>" + "'", str1, "<<<gcodeFile>>>");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test454");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<performHomingCycle>>>", "View gcode parser state");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test455");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<$$>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<$$>>>>>" + "'", str1, "<<<<<$$>>>>>");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test456");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<cancelSend>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<cancelSend>>>>" + "'", str1, "<<<<cancelSend>>>>");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test457");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("Error while processing response <error:1>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<Error while processing response <error:1>>" + "'", str1, "<Error while processing response <error:1>>");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test458");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("We should start with a non idle state", "<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test459");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("rawResponseListener", "<<<>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test460");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<G90 G0 X0 Y0>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<G90 G0 X0 Y0>>" + "'", str1, "<<G90 G0 X0 Y0>>");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test461");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<Hold,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>", "<<<<$$>>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test462");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<<<Hold,MPos:1.0,2.0,3.0>>>>", "Unexpected exception from command sent:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test463");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("", "Unexpected exception while testing rawResponseListener:");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test464");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<<$$>>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<<$$>>>>>>" + "'", str1, "<<<<<<$$>>>>>>");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test465");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<Idle,WPos:1,2,3,MPos:1,2,3>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<Idle,WPos:1,2,3,MPos:1,2,3>>>>" + "'", str1, "<<<<Idle,WPos:1,2,3,MPos:1,2,3>>>>");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test466");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<G21G90 G0Z10>>", "resources.MessagesBundle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test467");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<error:1>", "<<>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test468");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21", "<Grbl 0.7>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test469");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("US", "We should start with a non idle state");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test470");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<issueSoftReset>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<issueSoftReset>>" + "'", str1, "<<issueSoftReset>>");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test471");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<gcodeFile>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<gcodeFile>>>>" + "'", str1, "<<<<gcodeFile>>>>");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test472");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("US", "<performHomingCycle>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test473");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("UTF-8", "G90 G0 Z0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test474");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<Check,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<Check,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>" + "'", str1, "<<Check,MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test475");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<G90 G0 X0 Y0>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<G90 G0 X0 Y0>>>" + "'", str1, "<<<G90 G0 X0 Y0>>>");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test476");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$J=G20G91X-10Z10F11", "<performHomingCycle>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test477");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("jogMachine", "<Grbl 0.9>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test478");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("$J=G21G91Y10F11", "<<foo>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test479");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<cancelSend>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<cancelSend>>>>>" + "'", str1, "<<<<<cancelSend>>>>>");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test480");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G91G1X-10Z10F11", "getSendDuration");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test481");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("unitTestMode", "<<<resumeStreaming>>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test482");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<No supported homing method for>", "We should be in sending mode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test483");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<$J=G20G91X-10Z10F11>>", "<View all grbl settings>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test484");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<test message>>", "<Unexpected exception from Thread.sleep:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test485");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G21G90G1X1Y2Z3F200", "<Unexpected exception from Thread.sleep:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test486");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("An unexpected error was detected: (error:1) G-code words consist of a letter and a value. Letter was not found.", "G20G90G1X1Y2F200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test487");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<. Reverts to en_US>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<. Reverts to en_US>>>" + "'", str1, "<<<. Reverts to en_US>>>");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test488");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("UTF-8", "<G21G90G1X1.235Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test489");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("isReadyToStreamFile", "<G21G90G1X1Y2F200>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test490");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<blah>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<blah>>>" + "'", str1, "<<<blah>>>");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test491");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>>" + "'", str1, "<<<<Check|MPos:0.000,0.000,0.000|FS:0,0|Pn:XYZ>>>>");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test492");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<Grbl 1.1f>>", "resources.MessagesBundle");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test493");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("addListener");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<addListener>" + "'", str1, "<addListener>");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test494");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<$H>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<$H>>>" + "'", str1, "<<<$H>>>");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test495");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("G20G90 G0Z0.394", "<Unexpected exception from command sent:>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test496");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<<$G>>", "<<test message>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test497");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<View gcode parser state>", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test498");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("Grbl 1.1a", "$J=G21G91Y10F11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test499");
        boolean boolean2 = com.willwinder.universalgcodesender.i18n.Localization.initialize("<G20G90G1X1Y2F200>", "<addListener>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test500");
        java.lang.String str1 = com.willwinder.universalgcodesender.i18n.Localization.getString("<<<<gcodeFile>>>>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<<<<<gcodeFile>>>>>" + "'", str1, "<<<<<gcodeFile>>>>>");
    }
}

