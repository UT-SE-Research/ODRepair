package com.vaadin.flow.component.polymertemplate;

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
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "Template element should have contained a div element with the id 'button'", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "Faulty template getter should not find elements");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "No Template", "Template element should have contained a div element with the id 'test'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.vaadin.flow.component.polymertemplate.TemplateParser templateParser0 = com.vaadin.flow.component.polymertemplate.NpmTemplateParser.getInstance();
        org.junit.Assert.assertNotNull(templateParser0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "Parent element ID not the expected one.", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = com.vaadin.flow.shared.ui.Dependency.KEY_CONTENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contents" + "'", str0, "contents");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<? super java.lang.CharSequence>[] wildcardClassArray3 = (java.lang.Class<? super java.lang.CharSequence>[]) classArray2;
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.flow.di.Lookup lookup4 = com.vaadin.flow.di.Lookup.of(charSequence0, wildcardClassArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.io.IOException iOException0 = null;
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException(iOException0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        boolean boolean1 = com.vaadin.flow.shared.ui.Dependency.Type.contains("my-component");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        boolean boolean1 = com.vaadin.flow.shared.ui.Dependency.Type.contains("contents");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.select.NodeFilter nodeFilter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.filter(nodeFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.select.Evaluator evaluator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = element1.is(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.before((org.jsoup.nodes.Node) element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.lang.Class<?> wildcardClass7 = element6.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "parent-template", "Template element should have contained a div element with the id 'test'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        com.vaadin.flow.shared.ui.Dependency dependency4 = new com.vaadin.flow.shared.ui.Dependency(type0, "Faulty template getter should not find elements");
        java.lang.String str5 = dependency4.toString();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]" + "'", str5, "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Evaluator evaluator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.selectFirst(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.lang.Class<?> wildcardClass7 = element1.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.closest("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "nameField", "Several Dom-Modules");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.DYNAMIC_IMPORT;
        com.vaadin.flow.shared.ui.LoadMode loadMode2 = null;
        com.vaadin.flow.shared.ui.Dependency dependency3 = new com.vaadin.flow.shared.ui.Dependency(type0, "several-dom-modules-template", loadMode2);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.DYNAMIC_IMPORT + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.DYNAMIC_IMPORT));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Node node16 = element15.parentNode();
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element15.getElementsMatchingText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = com.vaadin.flow.shared.ui.Dependency.KEY_LOAD_MODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mode" + "'", str0, "mode");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.select(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element7.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes10 = element9.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.nodes.Element element5 = element4.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element4.select("Template element should have contained a div element with the id 'label'");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query ''label'': unexpected token at ''label''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        java.lang.String[] strArray16 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str25 = element22.data();
        org.jsoup.select.Elements elements27 = element22.getElementsByTag("hash");
        org.jsoup.nodes.Element element29 = element22.toggleClass("");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element33 = element31.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str38 = element35.data();
        org.jsoup.select.Elements elements40 = element35.getElementsByTag("hash");
        org.jsoup.nodes.Element element42 = element35.appendElement("button");
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element47 = element44.firstElementSibling();
        org.jsoup.nodes.Element element48 = element35.appendTo(element47);
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements52 = element50.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element53 = element50.firstElementSibling();
        org.jsoup.nodes.Element element54 = element53.clearAttributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements58 = element56.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str59 = element56.data();
        org.jsoup.nodes.Element element61 = element56.addClass("");
        org.jsoup.nodes.Node[] nodeArray62 = new org.jsoup.nodes.Node[] { element29, element31, element48, element53, element61 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element63 = element5.insertChildren((int) (byte) 10, nodeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(nodeArray62);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        java.lang.String str2 = uncheckedIOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.UncheckedIOException: java.io.IOException: child-template" + "'", str2, "org.jsoup.UncheckedIOException: java.io.IOException: child-template");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = element7.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByClass("no-html-template");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        java.lang.String str15 = element1.text();
        org.jsoup.nodes.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element1.before(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexEquals(100);
        int int8 = element5.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element1.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        java.lang.String str9 = element1.className();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element7 = element1.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Faulty html should not find elements");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        org.jsoup.select.Evaluator evaluator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element15.select(evaluator19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Node node16 = element15.parentNode();
        org.jsoup.select.Elements elements18 = element15.getElementsByClass("Parent element ID not the expected one.");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str12 = element9.data();
        org.jsoup.nodes.Element element14 = element9.addClass("");
        int int15 = element9.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element1.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element14.hasText();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element14.insertChildren((int) '4', elementCollection17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Children collection to be inserted must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Node node6 = element5.nextSibling();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueNot("likeable-element-view", "Template element should have contained a div element with the id 'test'");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.select.Evaluator evaluator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element7.closest(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements18 = element15.getElementsMatchingOwnText("Expected template element to have 2 children");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("Faulty template getter should not find elements");
        org.jsoup.select.Evaluator evaluator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element1.closest(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        int int8 = element6.childNodeSize();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeStarting("my-form");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element6.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "Template element should have contained a div element with the id 'content'", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        int int8 = element6.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "No Template", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("Faulty template getter should not find elements");
        org.jsoup.select.Elements elements11 = element1.getElementsByAttributeValueMatching("Several Dom-Modules", "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = com.vaadin.flow.shared.ui.Dependency.KEY_URL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "url" + "'", str0, "url");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = com.vaadin.flow.shared.ui.Dependency.KEY_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        element20.setBaseUri("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.nodes.Element element24 = element20.closest("Expected template element to have 2 children");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        boolean boolean9 = element8.hasParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element8.is("Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file': unexpected token at ''t find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) '#');
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueNot("paper-input", "Template should have a button");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        org.jsoup.select.Elements elements20 = element18.getElementsByAttribute("Template should have a button");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.nodes.Element element5 = element4.clearAttributes();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.select.Elements elements14 = element7.select("test");
        java.lang.String str15 = element7.ownText();
        org.jsoup.select.Elements elements17 = element7.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str22 = element19.data();
        org.jsoup.nodes.Element element24 = element19.addClass("");
        int int25 = element19.childNodeSize();
        org.jsoup.nodes.Element element28 = element19.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements33 = element31.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element35 = element31.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element38 = element28.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Element element39 = element7.appendTo(element38);
        org.jsoup.select.Elements elements42 = element39.getElementsByAttributeValueContaining("hi!", "Expected template element to have 3 children");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element5.after((org.jsoup.nodes.Node) element39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "url", "Found sources from the tag '{}' in the template '{}'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.selectFirst("Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file': unexpected token at ''t find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.jsoup.nodes.Element element1 = null;
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData templateData2 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData("Coudln't get resource for the template '{}'", element1);
        org.jsoup.nodes.Element element3 = templateData2.getTemplateElement();
        java.lang.String str4 = templateData2.getModulePath();
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str4, "Coudln't get resource for the template '{}'");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.JAVASCRIPT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.JAVASCRIPT + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.JAVASCRIPT));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element12 = element1.removeClass("button");
        int int13 = element12.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        java.lang.String str8 = element1.wholeText();
        org.jsoup.nodes.Element element9 = element1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element9.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element18.getElementsMatchingText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element1.siblingNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.selectFirst("Template should have 2 divs");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.getElementById("my-form");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) '4');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.select.Evaluator evaluator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.closest(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Evaluator evaluator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element10.closest(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException3 = new org.jsoup.UncheckedIOException("vaadin-text-field");
        uncheckedIOException1.addSuppressed((java.lang.Throwable) uncheckedIOException3);
        java.lang.String str5 = uncheckedIOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field" + "'", str5, "org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean11 = element1.isBlock();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element6 = element1.nextElementSibling();
        java.lang.String str7 = element1.normalName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "found sources from the tag '{}' in the template '{}'" + "'", str7, "found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str26 = element23.data();
        org.jsoup.select.Elements elements28 = element23.getElementsByTag("hash");
        element23.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements31 = element23.children();
        org.jsoup.select.Elements elements32 = element23.previousElementSiblings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element10.insertChildren((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements9 = element8.previousElementSiblings();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str13 = element10.data();
        org.jsoup.nodes.Element element15 = element10.addClass("");
        int int16 = element10.childNodeSize();
        org.jsoup.nodes.Element element19 = element10.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element29 = element19.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements28);
        org.jsoup.nodes.Element element30 = element1.appendChildren((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        java.util.Set<java.lang.String> strSet31 = element30.classNames();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        com.vaadin.flow.shared.ui.Dependency dependency4 = new com.vaadin.flow.shared.ui.Dependency(type0, "Faulty template getter should not find elements");
        elemental.json.JsonObject jsonObject5 = dependency4.toJson();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        boolean boolean11 = dependency4.equals((java.lang.Object) element7);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertNotNull(jsonObject5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        element20.setBaseUri("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.nodes.Document document23 = element20.ownerDocument();
        org.jsoup.nodes.Element element24 = element20.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        boolean boolean21 = element10.isBlock();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.nodes.Element element10 = element1.html("likeable-element-view");
        org.jsoup.nodes.Element element12 = element1.addClass("Template element should have contained a div element with the id 'button'");
        org.jsoup.select.Evaluator evaluator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = element1.is(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        java.lang.String[] strArray16 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str24 = element21.data();
        org.jsoup.select.Elements elements26 = element21.getElementsByTag("hash");
        org.jsoup.nodes.Element element28 = element21.appendElement("button");
        org.jsoup.select.Elements elements30 = element28.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element31 = element28.root();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element19.before((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        java.lang.String str8 = element1.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Template element should have contained a div element with the id 'label'" + "'", str8, "Template element should have contained a div element with the id 'label'");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        java.lang.Class<?> wildcardClass18 = element15.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        org.jsoup.nodes.Element element9 = element5.prepend("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        java.lang.String str10 = element5.wholeText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.UncheckedIOException: java.io.IOException: child-template" + "'", str10, "org.jsoup.UncheckedIOException: java.io.IOException: child-template");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements32 = element31.parents();
        org.jsoup.nodes.Element element34 = element31.prependElement("Template element should have contained a div element with the id 'test'");
        org.jsoup.select.Evaluator evaluator35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = element31.selectFirst(evaluator35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = element5.wrap("Expected template element to have 2 children");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element14.hasText();
        org.jsoup.select.Elements elements17 = element14.getElementsContainingText("Template should have a paper-input");
        org.jsoup.select.Elements elements18 = element14.siblingElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element1.hasSameValue((java.lang.Object) element5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element1.after("Template should have a paper-input");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException3 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException5 = new org.jsoup.UncheckedIOException("vaadin-text-field");
        uncheckedIOException3.addSuppressed((java.lang.Throwable) uncheckedIOException5);
        uncheckedIOException1.addSuppressed((java.lang.Throwable) uncheckedIOException5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException3 = new org.jsoup.UncheckedIOException("vaadin-text-field");
        uncheckedIOException1.addSuppressed((java.lang.Throwable) uncheckedIOException3);
        java.lang.String str5 = uncheckedIOException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.UncheckedIOException: java.io.IOException: child-template" + "'", str5, "org.jsoup.UncheckedIOException: java.io.IOException: child-template");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element5 = element3.getElementById("likeable-element-view");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements4 = element2.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str5 = element2.data();
        org.jsoup.select.Elements elements7 = element2.getElementsByTag("hash");
        org.jsoup.select.Elements elements9 = element2.select("test");
        java.lang.String str10 = element2.ownText();
        boolean boolean12 = element2.hasClass("content");
        org.jsoup.nodes.Node node13 = element2.parentNode();
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData templateData14 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData("hi!", element2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        java.lang.String[] strArray16 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        java.lang.String str20 = element19.baseUri();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element4 = element3.previousElementSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element1.hasSameValue((java.lang.Object) element5);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element20 = element16.toggleClass("Expected template element to have 2 children");
        boolean boolean21 = element12.hasSameValue((java.lang.Object) element16);
        org.jsoup.nodes.Element element22 = element12.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element1.after((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.jsoup.nodes.Element element1 = null;
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData templateData2 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData("Coudln't get resource for the template '{}'", element1);
        java.lang.String str3 = templateData2.getModulePath();
        java.lang.String str4 = templateData2.getModulePath();
        java.lang.String str5 = templateData2.getModulePath();
        java.lang.String str6 = templateData2.getModulePath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str3, "Coudln't get resource for the template '{}'");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str4, "Coudln't get resource for the template '{}'");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str5, "Coudln't get resource for the template '{}'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str6, "Coudln't get resource for the template '{}'");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element1.after("contents");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element5 = element1.getElementById("Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element1.hasSameValue((java.lang.Object) element5);
        org.jsoup.nodes.Element element11 = element1.lastElementSibling();
        org.jsoup.select.Elements elements12 = element11.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.nodes.Element element10 = element1.html("likeable-element-view");
        org.jsoup.nodes.Element element12 = element1.addClass("Template element should have contained a div element with the id 'button'");
        org.jsoup.nodes.Element element13 = element12.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        java.lang.String[] strArray68 = new java.lang.String[] { "Template element should have contained a div element with the id 'content'", "Found sources from the tag '{}' in the template '{}'", "contents", "Template should have a paper-input", "Faulty template getter should not find elements", "type", "", "Several Dom-Modules", "Faulty html should not find elements", "Template should have a paper-input", "Template should contain one child", "likeable-element-view", "", "Template should have a paper-input", "nameField", "vaadin-text-field", "content", "contents", "paper-input", "Template should have a button", "", "child-template", "Coudln't get resource for the template '{}'", "test", "Found sources from the tag '{}' in the template '{}'", "Coudln't get resource for the template '{}'", "hash", "hash", "test", "Several Dom-Modules", "my-form", "Found sources from the tag '{}' in the template '{}'", "Template element should have contained a div element with the id 'test'", "test", "hash", "Template should contain one child", "likeable-element-view", "div", "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]", "Template should have a button", "content", "Found sources from the tag '{}' in the template '{}'", "", "vaadin-text-field", "Faulty html should not find elements", "Template element should have contained a div element with the id 'button'", "Expected template element to have 2 children" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        org.jsoup.nodes.Element element71 = element20.classNames((java.util.Set<java.lang.String>) strSet69);
        org.jsoup.nodes.Document document72 = element20.ownerDocument();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNull(document72);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str12 = element9.data();
        org.jsoup.select.Elements elements14 = element9.getElementsByTag("hash");
        org.jsoup.nodes.Element element16 = element9.appendElement("button");
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element21 = element18.firstElementSibling();
        org.jsoup.nodes.Element element22 = element9.appendTo(element21);
        boolean boolean23 = element22.hasText();
        org.jsoup.nodes.Element element26 = element22.attr("several-dom-modules-template", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element7.after((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Node node16 = element15.parentNode();
        org.jsoup.select.Evaluator evaluator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element15.selectFirst(evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        org.jsoup.nodes.Node node15 = element14.previousSibling();
        org.jsoup.select.Evaluator evaluator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = element14.is(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.childNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.JS_MODULE;
        com.vaadin.flow.shared.ui.LoadMode loadMode2 = null;
        com.vaadin.flow.shared.ui.Dependency dependency3 = new com.vaadin.flow.shared.ui.Dependency(type0, "content", loadMode2);
        com.vaadin.flow.shared.ui.Dependency dependency5 = new com.vaadin.flow.shared.ui.Dependency(type0, "my-form");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.JS_MODULE + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.JS_MODULE));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Element element9 = element5.prepend("Template should have a button");
        java.lang.String str11 = element9.attr("Several Dom-Modules");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.jsoup.nodes.Element element1 = null;
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData templateData2 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData("Coudln't get resource for the template '{}'", element1);
        java.lang.String str3 = templateData2.getModulePath();
        java.lang.String str4 = templateData2.getModulePath();
        org.jsoup.nodes.Element element5 = templateData2.getTemplateElement();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str3, "Coudln't get resource for the template '{}'");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str4, "Coudln't get resource for the template '{}'");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        java.lang.String[] strArray16 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean21 = element5.hasClass("no-html-template");
        org.jsoup.nodes.Element element23 = element5.removeAttr("several-dom-modules-template");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element5 = element3.tagName("url");
        org.jsoup.nodes.Node node6 = element5.previousSibling();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.nodes.Element element6 = element1.toggleClass("Faulty html should not find elements");
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeValueEnding("likeable-element", "content");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = element5.wrap("Expected template element to have 2 children");
        org.jsoup.nodes.Element element10 = element5.prependElement("Faulty template getter should not find elements");
        java.lang.String str11 = element5.nodeName();
        org.jsoup.select.Elements elements14 = element5.getElementsByAttributeValueMatching("url", "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str11, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        boolean boolean10 = element1.hasClass("Found sources from the tag '{}' in the template '{}'");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element1.select("Template element should have contained a div element with the id 'test'");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query ''test'': unexpected token at ''test''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.nodes.Element element13 = element5.attr("mode", "button");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.nodes.Element element5 = element4.clearAttributes();
        org.jsoup.select.Evaluator evaluator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = element4.is(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element1.selectFirst("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) 'a');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Template should have a paper-input");
        elemental.json.JsonObject jsonObject3 = dependency2.toJson();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertNotNull(jsonObject3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = element5.wrap("Expected template element to have 2 children");
        int int9 = element5.childNodeSize();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        boolean boolean27 = element26.hasText();
        java.lang.String str28 = element26.wholeText();
        java.lang.String[] strArray37 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = element20.hasSameValue((java.lang.Object) strSet38);
        boolean boolean43 = element20.hasAttr("Coudln't get resource for the template '{}'");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        java.util.Set<java.lang.String> strSet8 = element1.classNames();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("several-dom-modules-template");
        boolean boolean12 = element8.hasClass("hash");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element14.hasText();
        org.jsoup.select.Elements elements17 = element14.getElementsContainingText("Template should have a paper-input");
        org.jsoup.nodes.Node node18 = element14.unwrap();
        org.jsoup.nodes.Element element19 = element14.lastElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        java.lang.String str7 = element1.data();
        org.jsoup.select.Elements elements9 = element1.getElementsByClass("Expected template element to have 3 children");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes8 = element5.attributes();
        org.jsoup.select.Elements elements10 = element5.getElementsByTag("Template should have 2 divs");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        java.lang.Class<?> wildcardClass10 = nodeList9.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        org.jsoup.nodes.Element element35 = element1.toggleClass("Several Dom-Modules");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element1.childNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueMatching("Parent element ID not the expected one.", "Parent element ID not the expected one.");
        org.jsoup.nodes.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element7.before(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Document document6 = element1.ownerDocument();
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
        boolean boolean8 = element1.hasText();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element14 = element10.toggleClass("Expected template element to have 2 children");
        boolean boolean15 = element14.hasText();
        java.lang.String str16 = element14.wholeText();
        java.lang.String[] strArray25 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = element14.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = element1.classNames((java.util.Set<java.lang.String>) strSet26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str14 = element11.data();
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("hash");
        org.jsoup.select.Elements elements18 = element11.select("test");
        java.lang.String str19 = element11.ownText();
        org.jsoup.select.Elements elements21 = element11.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str26 = element23.data();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        int int29 = element23.childNodeSize();
        org.jsoup.nodes.Element element32 = element23.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element39 = element35.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element42 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = element11.appendTo(element42);
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueContaining("hi!", "Expected template element to have 3 children");
        org.jsoup.nodes.Element element47 = element8.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.jsoup.select.Elements elements50 = element8.getElementsByAttributeValueStarting("No Template", "org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.lang.String str7 = element1.nodeName();
        org.jsoup.nodes.Element element9 = element1.tagName("Template should contain one child");
        java.lang.String str10 = element9.cssSelector();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str7, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "template should contain one child" + "'", str10, "template should contain one child");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.lang.String[] strArray43 = new java.lang.String[] { "likeable-element", "div", "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]", "likeable-element-view", "Template should have 2 divs", "test", "parent-template", "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>", "id", "child-template", "parent-template", "hi!", "no-html-template", "Expected template element to have 2 children", "Parent element ID not the expected one.", "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]", "several-dom-modules-template", "my-form", "id", "Template should have 2 divs", "likeable-element", "child-template", "id", "Template element should have contained a div element with the id 'label'", "found sources from the tag '{}' in the template '{}'", "div", "contents", "test", "Template element should have contained a div element with the id 'button'", "Template should have 2 divs", "Several Dom-Modules", "Expected template element to have 3 children", "org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field", "child-template", "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>", "id" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = element6.classNames((java.util.Set<java.lang.String>) strSet44);
        boolean boolean47 = element46.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException3 = new org.jsoup.UncheckedIOException("vaadin-text-field");
        uncheckedIOException1.addSuppressed((java.lang.Throwable) uncheckedIOException3);
        java.lang.Throwable[] throwableArray5 = uncheckedIOException1.getSuppressed();
        java.lang.Throwable[] throwableArray6 = uncheckedIOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element element21 = element20.nextElementSibling();
        org.jsoup.select.NodeFilter nodeFilter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = element20.filter(nodeFilter22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.lang.String str7 = element1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element1.is("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str7, "Found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.select.Elements elements10 = element1.previousElementSiblings();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.nodes.Element element19 = element12.appendElement("button");
        org.jsoup.select.Elements elements21 = element19.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element22 = element19.root();
        boolean boolean23 = element22.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element1.before((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        int int8 = element6.childNodeSize();
        boolean boolean10 = element6.hasClass("Template should have 2 divs");
        java.lang.String str11 = element6.wholeText();
        org.jsoup.select.Elements elements12 = element6.previousElementSiblings();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        org.jsoup.nodes.Element element9 = element5.prepend("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        boolean boolean10 = element5.hasParent();
        org.jsoup.select.Evaluator evaluator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element5.closest(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        java.lang.String str3 = dependency2.getUrl();
        com.vaadin.flow.shared.ui.Dependency.Type type4 = dependency2.getType();
        com.vaadin.flow.shared.ui.Dependency dependency6 = new com.vaadin.flow.shared.ui.Dependency(type4, "vaadin-text-field");
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag name doesn't match the JS module name" + "'", str3, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type4.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        java.lang.String str8 = element7.className();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("contents", "id");
        org.jsoup.select.Evaluator evaluator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element7.closest(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element1.getElementsByAttribute("paper-input");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        java.lang.String str3 = dependency2.getUrl();
        com.vaadin.flow.shared.ui.Dependency.Type type4 = dependency2.getType();
        com.vaadin.flow.shared.ui.Dependency.Type type6 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency8 = new com.vaadin.flow.shared.ui.Dependency(type6, "Template should have a paper-input");
        com.vaadin.flow.shared.ui.Dependency.Type type10 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency12 = new com.vaadin.flow.shared.ui.Dependency(type10, "Tag name doesn't match the JS module name");
        java.lang.String str13 = dependency12.getUrl();
        com.vaadin.flow.shared.ui.Dependency.Type type14 = dependency12.getType();
        com.vaadin.flow.shared.ui.LoadMode loadMode15 = dependency12.getLoadMode();
        com.vaadin.flow.shared.ui.Dependency dependency16 = new com.vaadin.flow.shared.ui.Dependency(type6, "nameField", loadMode15);
        com.vaadin.flow.shared.ui.Dependency dependency17 = new com.vaadin.flow.shared.ui.Dependency(type4, "child-template", loadMode15);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag name doesn't match the JS module name" + "'", str3, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type4.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type6.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type10.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Tag name doesn't match the JS module name" + "'", str13, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type14.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + loadMode15 + "' != '" + com.vaadin.flow.shared.ui.LoadMode.LAZY + "'", loadMode15.equals(com.vaadin.flow.shared.ui.LoadMode.LAZY));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        org.jsoup.nodes.Element element18 = element15.root();
        org.jsoup.nodes.Element element19 = element15.shallowClone();
        org.jsoup.nodes.Element element20 = element19.root();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        java.lang.String str32 = element8.normalName();
        org.jsoup.nodes.Node node33 = element8.unwrap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node33.attr("<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "button" + "'", str32, "button");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        java.lang.String[] strArray16 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = element19.removeAttr("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        java.lang.String str15 = element1.text();
        org.jsoup.select.Elements elements16 = element1.previousElementSiblings();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element20 = element15.empty();
        org.jsoup.nodes.Element element21 = element20.shallowClone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.nodes.Element element6 = element1.toggleClass("Faulty html should not find elements");
        int int7 = element6.attributesSize();
        int int8 = element6.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element21 = element18.appendElement("paper-input");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Expected template element to have 2 children" + "'", str19, "Expected template element to have 2 children");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element11 = element8.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element8.textNodes();
        int int13 = element8.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("Template element should have contained a div element with the id 'button'");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        java.lang.String str15 = element1.text();
        java.lang.String str16 = element1.data();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean16 = element14.hasAttr("likeable-element");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        com.vaadin.flow.shared.ui.Dependency dependency4 = new com.vaadin.flow.shared.ui.Dependency(type0, "Faulty template getter should not find elements");
        com.vaadin.flow.shared.ui.LoadMode loadMode5 = dependency4.getLoadMode();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + loadMode5 + "' != '" + com.vaadin.flow.shared.ui.LoadMode.LAZY + "'", loadMode5.equals(com.vaadin.flow.shared.ui.LoadMode.LAZY));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element20 = element15.empty();
        org.jsoup.parser.Tag tag21 = element15.tag();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element11 = element8.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element8.textNodes();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str17 = element14.data();
        org.jsoup.nodes.Element element19 = element14.addClass("");
        int int20 = element14.childNodeSize();
        org.jsoup.nodes.Element element23 = element14.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element30 = element26.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element33 = element23.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Element element34 = element8.after((org.jsoup.nodes.Node) element23);
        org.jsoup.select.Elements elements35 = element8.previousElementSiblings();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.select.Elements elements10 = element1.previousElementSiblings();
        org.jsoup.nodes.Document document11 = element1.ownerDocument();
        org.jsoup.parser.Tag tag12 = element1.tag();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.select.Elements elements8 = element1.getElementsContainingOwnText("Faulty template getter should not find elements");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str13 = element10.data();
        org.jsoup.select.Elements elements15 = element10.getElementsByTag("hash");
        org.jsoup.select.Elements elements17 = element10.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements19 = element10.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str24 = element21.data();
        org.jsoup.select.Elements elements26 = element21.getElementsByTag("hash");
        org.jsoup.nodes.Element element28 = element21.toggleClass("");
        org.jsoup.nodes.Element element29 = element10.appendTo(element21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = element1.after((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        java.lang.String str32 = element8.normalName();
        org.jsoup.select.Evaluator evaluator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements34 = element8.select(evaluator33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "button" + "'", str32, "button");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Node node6 = element5.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element5.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        org.jsoup.nodes.Element element34 = element33.firstElementSibling();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.nodes.Element element38 = element34.attr("hi!", false);
        org.jsoup.nodes.Element element41 = element38.attr("Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file", "likeable-element");
        java.util.regex.Pattern pattern43 = null;
        org.jsoup.select.Elements elements44 = element41.getElementsByAttributeValueMatching("Template element should have contained a div element with the id 'button'", pattern43);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>" + "'", str35, "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements12 = element10.previousElementSiblings();
        org.jsoup.parser.Tag tag13 = element10.tag();
        org.jsoup.select.Elements elements14 = element10.siblingElements();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeValueNot("my-form", "Template should have a button");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements12 = element10.previousElementSiblings();
        org.jsoup.parser.Tag tag13 = element10.tag();
        boolean boolean15 = element10.hasAttr("Couldn't find the definition of the element with tag '%s' in any template file declared using '@%s' annotations. Check the availability of the template files in your WAR file or provide alternative implementation of the method getTemplateContent() which should return an element representing the content of the template file");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        int int8 = element6.childNodeSize();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeStarting("my-form");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Document document6 = element1.ownerDocument();
        org.jsoup.nodes.Element element7 = element1.lastElementSibling();
        boolean boolean8 = element1.hasText();
        com.vaadin.flow.shared.ui.Dependency.Type type9 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency11 = new com.vaadin.flow.shared.ui.Dependency(type9, "Tag name doesn't match the JS module name");
        java.lang.String str12 = dependency11.getUrl();
        boolean boolean13 = element1.hasSameValue((java.lang.Object) dependency11);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type9.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Tag name doesn't match the JS module name" + "'", str12, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = element1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        boolean boolean19 = element15.equals((java.lang.Object) "Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element22 = element15.attr("mode", false);
        org.jsoup.select.Elements elements23 = element22.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        org.jsoup.nodes.Element element8 = element6.appendElement("foo-view");
        java.lang.String str9 = element6.normalName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "found sources from the tag '{}' in the template '{}'" + "'", str9, "found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("foo-view");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element5 = element3.tagName("url");
        org.jsoup.select.Evaluator evaluator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.selectFirst(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.nodes.Element element10 = element7.id("Template should have a button");
        java.lang.String str11 = element10.toString();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttribute("my-component");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\" id=\"Template should have a button\">\n Tag name doesn't match the JS module name\n</Found sources from the tag '{}' in the template '{}'>" + "'", str11, "<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\" id=\"Template should have a button\">\n Tag name doesn't match the JS module name\n</Found sources from the tag '{}' in the template '{}'>");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes8 = element5.attributes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element5.textNodes();
        java.lang.String str10 = element5.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str10, "Found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element9.hasText();
        java.lang.String str11 = element9.wholeText();
        org.jsoup.nodes.Element element13 = element9.prepend("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        boolean boolean14 = element9.hasParent();
        int int15 = element9.attributesSize();
        // The following exception was thrown during execution in test generation
        try {
            element1.replaceWith((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        boolean boolean9 = element8.hasParent();
        boolean boolean10 = element8.hasParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements12 = element10.previousElementSiblings();
        org.jsoup.parser.Tag tag13 = element10.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element20 = element16.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes23 = element20.attributes();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag13, "found sources from the tag '{}' in the template '{}'", attributes23);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        java.lang.String str34 = element32.wholeText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        boolean boolean9 = element5.hasParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        boolean boolean9 = element8.hasParent();
        org.jsoup.select.Elements elements11 = element8.select("Faulty html should not find elements");
        org.jsoup.nodes.Element element14 = element8.attr("content", "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        java.lang.String[] strArray38 = new java.lang.String[] { "vaadin-text-field", "paper-input", "Expected template element to have 2 children", "likeable-element-view", "div", "Template element should have contained a div element with the id 'button'" };
        java.util.HashSet<java.lang.String> strSet39 = new java.util.HashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.vaadin.flow.shared.ui.Dependency.Type type41 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency43 = new com.vaadin.flow.shared.ui.Dependency(type41, "Tag name doesn't match the JS module name");
        elemental.json.JsonObject jsonObject44 = dependency43.toJson();
        com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency> strSetPair45 = new com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency>(strSet39, dependency43);
        com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency> strSetPair46 = new com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency>((java.util.HashSet<java.lang.String>) strSet28, dependency43);
        com.vaadin.flow.shared.ui.Dependency.Type type47 = dependency43.getType();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type41.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertNotNull(jsonObject44);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type47.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        boolean boolean19 = element15.equals((java.lang.Object) "Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element22 = element15.attr("mode", false);
        org.jsoup.nodes.Element element25 = element22.attr("<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\" id=\"Template should have a button\">\n Tag name doesn't match the JS module name\n</Found sources from the tag '{}' in the template '{}'>", "url");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("foo-view");
        org.jsoup.nodes.Element element2 = element1.firstElementSibling();
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element11 = element8.root();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = element8.textNodes();
        org.jsoup.nodes.Element element14 = element8.before("id");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        java.lang.String str15 = element1.ownText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        org.jsoup.nodes.Element element8 = element6.appendElement("foo-view");
        org.jsoup.select.Elements elements10 = element8.getElementsContainingText("type");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str14 = element11.data();
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("hash");
        org.jsoup.select.Elements elements18 = element11.select("test");
        java.lang.String str19 = element11.ownText();
        org.jsoup.select.Elements elements21 = element11.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str26 = element23.data();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        int int29 = element23.childNodeSize();
        org.jsoup.nodes.Element element32 = element23.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element39 = element35.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element42 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = element11.appendTo(element42);
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueContaining("hi!", "Expected template element to have 3 children");
        org.jsoup.nodes.Element element47 = element8.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.jsoup.nodes.Element element48 = element47.previousElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNull(element48);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("child-template");
        org.jsoup.UncheckedIOException uncheckedIOException3 = new org.jsoup.UncheckedIOException("vaadin-text-field");
        uncheckedIOException1.addSuppressed((java.lang.Throwable) uncheckedIOException3);
        java.lang.Throwable[] throwableArray5 = uncheckedIOException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = uncheckedIOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.vaadin.flow.di.Lookup lookup0 = null;
        com.vaadin.flow.di.Lookup lookup1 = null;
        com.vaadin.flow.di.Lookup lookup2 = com.vaadin.flow.di.Lookup.compose(lookup0, lookup1);
        com.vaadin.flow.di.Lookup lookup3 = null;
        com.vaadin.flow.di.Lookup lookup4 = null;
        com.vaadin.flow.di.Lookup lookup5 = com.vaadin.flow.di.Lookup.compose(lookup3, lookup4);
        com.vaadin.flow.di.Lookup lookup6 = com.vaadin.flow.di.Lookup.compose(lookup0, lookup5);
        com.vaadin.flow.di.Lookup lookup7 = null;
        com.vaadin.flow.di.Lookup lookup8 = null;
        com.vaadin.flow.di.Lookup lookup9 = com.vaadin.flow.di.Lookup.compose(lookup7, lookup8);
        com.vaadin.flow.di.Lookup lookup10 = null;
        com.vaadin.flow.di.Lookup lookup11 = null;
        com.vaadin.flow.di.Lookup lookup12 = com.vaadin.flow.di.Lookup.compose(lookup10, lookup11);
        com.vaadin.flow.di.Lookup lookup13 = com.vaadin.flow.di.Lookup.compose(lookup7, lookup12);
        com.vaadin.flow.di.Lookup lookup14 = com.vaadin.flow.di.Lookup.compose(lookup6, lookup13);
        com.vaadin.flow.di.Lookup lookup15 = null;
        com.vaadin.flow.di.Lookup lookup16 = null;
        com.vaadin.flow.di.Lookup lookup17 = com.vaadin.flow.di.Lookup.compose(lookup15, lookup16);
        com.vaadin.flow.di.Lookup lookup18 = null;
        com.vaadin.flow.di.Lookup lookup19 = null;
        com.vaadin.flow.di.Lookup lookup20 = com.vaadin.flow.di.Lookup.compose(lookup18, lookup19);
        com.vaadin.flow.di.Lookup lookup21 = com.vaadin.flow.di.Lookup.compose(lookup15, lookup20);
        com.vaadin.flow.di.Lookup lookup22 = null;
        com.vaadin.flow.di.Lookup lookup23 = null;
        com.vaadin.flow.di.Lookup lookup24 = com.vaadin.flow.di.Lookup.compose(lookup22, lookup23);
        com.vaadin.flow.di.Lookup lookup25 = null;
        com.vaadin.flow.di.Lookup lookup26 = null;
        com.vaadin.flow.di.Lookup lookup27 = com.vaadin.flow.di.Lookup.compose(lookup25, lookup26);
        com.vaadin.flow.di.Lookup lookup28 = com.vaadin.flow.di.Lookup.compose(lookup22, lookup27);
        com.vaadin.flow.di.Lookup lookup29 = com.vaadin.flow.di.Lookup.compose(lookup21, lookup28);
        com.vaadin.flow.di.Lookup lookup30 = com.vaadin.flow.di.Lookup.compose(lookup13, lookup28);
        org.junit.Assert.assertNotNull(lookup2);
        org.junit.Assert.assertNotNull(lookup5);
        org.junit.Assert.assertNotNull(lookup6);
        org.junit.Assert.assertNotNull(lookup9);
        org.junit.Assert.assertNotNull(lookup12);
        org.junit.Assert.assertNotNull(lookup13);
        org.junit.Assert.assertNotNull(lookup14);
        org.junit.Assert.assertNotNull(lookup17);
        org.junit.Assert.assertNotNull(lookup20);
        org.junit.Assert.assertNotNull(lookup21);
        org.junit.Assert.assertNotNull(lookup24);
        org.junit.Assert.assertNotNull(lookup27);
        org.junit.Assert.assertNotNull(lookup28);
        org.junit.Assert.assertNotNull(lookup29);
        org.junit.Assert.assertNotNull(lookup30);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str14 = element11.data();
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("hash");
        org.jsoup.nodes.Element element18 = element11.appendElement("button");
        boolean boolean20 = element18.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        boolean boolean27 = element26.hasText();
        java.lang.String str28 = element26.wholeText();
        java.lang.String[] strArray37 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element41 = element18.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element42 = element1.classNames((java.util.Set<java.lang.String>) strSet38);
        java.util.List<org.jsoup.nodes.Node> nodeList43 = element42.childNodes();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element20 = element15.clone();
        boolean boolean21 = element20.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements32 = element31.parents();
        org.jsoup.nodes.Element element34 = element31.prependElement("Template element should have contained a div element with the id 'test'");
        org.jsoup.nodes.Element element35 = element31.lastElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        boolean boolean27 = element26.hasText();
        java.lang.String str28 = element26.wholeText();
        java.lang.String[] strArray37 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = element20.hasSameValue((java.lang.Object) strSet38);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements45 = element43.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element46 = element43.firstElementSibling();
        element43.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.select.Elements elements50 = element43.getElementsContainingOwnText("Faulty template getter should not find elements");
        boolean boolean51 = element20.hasSameValue((java.lang.Object) elements50);
        int int52 = element20.elementSiblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.lang.String str7 = element1.nodeName();
        org.jsoup.select.Elements elements9 = element1.getElementsByAttributeStarting("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.select.Elements elements11 = element1.getElementsMatchingText("contents");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str7, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("Expected template element to have 3 children", pattern10);
        org.jsoup.nodes.Element element13 = element5.append("org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Element element8 = element6.previousElementSibling();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str13 = element10.data();
        org.jsoup.select.Elements elements15 = element10.getElementsByTag("hash");
        org.jsoup.nodes.Element element17 = element10.toggleClass("");
        boolean boolean18 = element17.hasParent();
        org.jsoup.select.Elements elements20 = element17.select("Faulty html should not find elements");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element8.prependChildren((java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueContaining("parent-template", "Expected template element to have 2 children");
        org.jsoup.nodes.Element element19 = element14.toggleClass("nameField");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Tag name doesn't match the JS module name");
        java.lang.String str3 = dependency2.getUrl();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element11 = element9.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element12 = element9.firstElementSibling();
        org.jsoup.nodes.Element element14 = element9.prependElement("content");
        boolean boolean15 = dependency2.equals((java.lang.Object) element14);
        java.lang.String str16 = element14.baseUri();
        java.lang.String str17 = element14.val();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element14.childNodesCopy();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tag name doesn't match the JS module name" + "'", str3, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.nodes.Element element19 = element12.toggleClass("");
        org.jsoup.nodes.Element element20 = element1.appendTo(element12);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element24 = element22.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element27 = element22.attr("Template should contain one child", "");
        org.jsoup.nodes.Element element29 = element27.wrap("id");
        boolean boolean30 = element20.equals((java.lang.Object) element29);
        org.jsoup.nodes.Element element32 = element29.wrap("Expected template element to have 3 children");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str14 = element11.data();
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("hash");
        org.jsoup.select.Elements elements18 = element11.select("test");
        java.lang.String str19 = element11.ownText();
        org.jsoup.select.Elements elements21 = element11.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str26 = element23.data();
        org.jsoup.nodes.Element element28 = element23.addClass("");
        int int29 = element23.childNodeSize();
        org.jsoup.nodes.Element element32 = element23.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements37 = element35.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element39 = element35.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element42 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = element11.appendTo(element42);
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueContaining("hi!", "Expected template element to have 3 children");
        org.jsoup.nodes.Element element47 = element8.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.jsoup.nodes.Element element48 = element47.clone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = npmTemplateParser0.getSourcesFromTemplate(vaadinService1, "", "Faulty template getter should not find elements");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element6 = element1.attr("Template should contain one child", "");
        org.jsoup.nodes.Element element8 = element6.wrap("id");
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueStarting("type", "no-html-template");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        java.lang.String str9 = element5.nodeName();
        java.lang.String str10 = element5.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str9, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str10, "Found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements32 = element31.parents();
        org.jsoup.nodes.Element element34 = element31.prependElement("Template element should have contained a div element with the id 'test'");
        java.util.regex.Pattern pattern36 = null;
        org.jsoup.select.Elements elements37 = element31.getElementsByAttributeValueMatching("button", pattern36);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        org.jsoup.nodes.Element element14 = element1.appendTo(element13);
        boolean boolean15 = element14.hasText();
        org.jsoup.select.Elements elements17 = element14.getElementsContainingText("Template should have a paper-input");
        org.jsoup.nodes.Node node18 = element14.unwrap();
        org.jsoup.select.Elements elements20 = element14.getElementsByClass("content");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes8 = element5.attributes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = element5.textNodes();
        int int10 = element5.attributesSize();
        org.jsoup.select.Elements elements12 = element5.getElementsByAttribute("nameField");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValueEnding("", "no-html-template");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        org.jsoup.select.Elements elements6 = element1.getElementsByClass("type");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.nodes.Element element19 = element12.toggleClass("");
        org.jsoup.nodes.Element element20 = element1.appendTo(element12);
        org.jsoup.nodes.Element element23 = element1.attr("<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>", false);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element6 = element1.attr("Template should contain one child", "");
        org.jsoup.nodes.Element element7 = element6.lastElementSibling();
        java.lang.String str8 = element6.html();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.nodes.Element element10 = element1.html("likeable-element-view");
        org.jsoup.select.Elements elements11 = element1.getAllElements();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.jsoup.UncheckedIOException uncheckedIOException1 = new org.jsoup.UncheckedIOException("Expected template element to have 2 children");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.String[] strArray6 = new java.lang.String[] { "vaadin-text-field", "paper-input", "Expected template element to have 2 children", "likeable-element-view", "div", "Template element should have contained a div element with the id 'button'" };
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        com.vaadin.flow.shared.ui.Dependency.Type type9 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency11 = new com.vaadin.flow.shared.ui.Dependency(type9, "Tag name doesn't match the JS module name");
        elemental.json.JsonObject jsonObject12 = dependency11.toJson();
        com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency> strSetPair13 = new com.vaadin.flow.internal.Pair<java.util.HashSet<java.lang.String>, com.vaadin.flow.shared.ui.Dependency>(strSet7, dependency11);
        java.util.HashSet<java.lang.String> strSet14 = strSetPair13.getFirst();
        com.vaadin.flow.shared.ui.Dependency dependency15 = strSetPair13.getSecond();
        com.vaadin.flow.shared.ui.Dependency dependency16 = strSetPair13.getSecond();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type9.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertNotNull(jsonObject12);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(dependency15);
        org.junit.Assert.assertNotNull(dependency16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        java.lang.String str12 = element1.absUrl("Faulty html should not find elements");
        org.jsoup.nodes.Element element15 = element1.attr("several-dom-modules-template", true);
        org.jsoup.nodes.Element element17 = element15.id("<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\" id=\"Template should have a button\">\n Tag name doesn't match the JS module name\n</Found sources from the tag '{}' in the template '{}'>");
        java.lang.String str18 = element15.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements22 = element10.getElementsByAttribute("several-dom-modules-template");
        org.jsoup.nodes.Element element25 = element10.attr("likeable-element", false);
        boolean boolean26 = element10.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        boolean boolean11 = element1.hasClass("content");
        org.jsoup.nodes.Node node12 = element1.parentNode();
        org.jsoup.nodes.Element element13 = element1.shallowClone();
        org.jsoup.nodes.Element element14 = element13.root();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        java.lang.String[] strArray43 = new java.lang.String[] { "likeable-element", "div", "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]", "likeable-element-view", "Template should have 2 divs", "test", "parent-template", "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>", "id", "child-template", "parent-template", "hi!", "no-html-template", "Expected template element to have 2 children", "Parent element ID not the expected one.", "Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]", "several-dom-modules-template", "my-form", "id", "Template should have 2 divs", "likeable-element", "child-template", "id", "Template element should have contained a div element with the id 'label'", "found sources from the tag '{}' in the template '{}'", "div", "contents", "test", "Template element should have contained a div element with the id 'button'", "Template should have 2 divs", "Several Dom-Modules", "Expected template element to have 3 children", "org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field", "child-template", "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>", "id" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.jsoup.nodes.Element element46 = element6.classNames((java.util.Set<java.lang.String>) strSet44);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = element46.dataset();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Element element9 = element5.prependText("div");
        org.jsoup.nodes.Element element11 = element9.selectFirst("Several Dom-Modules");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.vaadin.flow.shared.ui.Dependency.Type type0 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency2 = new com.vaadin.flow.shared.ui.Dependency(type0, "Template should have a paper-input");
        com.vaadin.flow.shared.ui.Dependency.Type type4 = com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET;
        com.vaadin.flow.shared.ui.Dependency dependency6 = new com.vaadin.flow.shared.ui.Dependency(type4, "Tag name doesn't match the JS module name");
        java.lang.String str7 = dependency6.getUrl();
        com.vaadin.flow.shared.ui.Dependency.Type type8 = dependency6.getType();
        com.vaadin.flow.shared.ui.LoadMode loadMode9 = dependency6.getLoadMode();
        com.vaadin.flow.shared.ui.Dependency dependency10 = new com.vaadin.flow.shared.ui.Dependency(type0, "nameField", loadMode9);
        elemental.json.JsonObject jsonObject11 = dependency10.toJson();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type0.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type4.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tag name doesn't match the JS module name" + "'", str7, "Tag name doesn't match the JS module name");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET + "'", type8.equals(com.vaadin.flow.shared.ui.Dependency.Type.STYLESHEET));
        org.junit.Assert.assertTrue("'" + loadMode9 + "' != '" + com.vaadin.flow.shared.ui.LoadMode.LAZY + "'", loadMode9.equals(com.vaadin.flow.shared.ui.LoadMode.LAZY));
        org.junit.Assert.assertNotNull(jsonObject11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements12 = element10.previousElementSiblings();
        org.jsoup.parser.Tag tag13 = element10.tag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag13, "org.jsoup.UncheckedIOException: java.io.IOException: child-template", attributes15);
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element23 = element19.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements25 = element23.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes26 = element23.attributes();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag13, "Template element should have contained a div element with the id 'button'", attributes26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.select.Elements elements10 = element1.previousElementSiblings();
        org.jsoup.nodes.Document document11 = element1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = document11.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        int int8 = element7.elementSiblingIndex();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueMatching("Parent element ID not the expected one.", "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = element7.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements7 = element1.getElementsByAttributeValueNot("Template element should have contained a div element with the id 'label'", "type");
        org.jsoup.nodes.Element element10 = element1.attr("found sources from the tag '{}' in the template '{}'", true);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements22 = element10.getElementsByAttribute("several-dom-modules-template");
        org.jsoup.nodes.Element element25 = element10.attr("likeable-element", false);
        element25.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element8 = element1.appendElement("Template element should have contained a div element with the id 'button'");
        boolean boolean9 = element1.hasText();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements22 = element10.getElementsByAttribute("several-dom-modules-template");
        org.jsoup.nodes.Element element23 = element10.clone();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element11 = element8.root();
        boolean boolean12 = element11.isBlock();
        java.lang.String str13 = element11.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str13, "Found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.vaadin.flow.di.Lookup lookup0 = null;
        com.vaadin.flow.di.Lookup lookup1 = null;
        com.vaadin.flow.di.Lookup lookup2 = com.vaadin.flow.di.Lookup.compose(lookup0, lookup1);
        com.vaadin.flow.di.Lookup lookup3 = null;
        com.vaadin.flow.di.Lookup lookup4 = null;
        com.vaadin.flow.di.Lookup lookup5 = com.vaadin.flow.di.Lookup.compose(lookup3, lookup4);
        com.vaadin.flow.di.Lookup lookup6 = com.vaadin.flow.di.Lookup.compose(lookup0, lookup5);
        com.vaadin.flow.di.Lookup lookup7 = null;
        com.vaadin.flow.di.Lookup lookup8 = null;
        com.vaadin.flow.di.Lookup lookup9 = com.vaadin.flow.di.Lookup.compose(lookup7, lookup8);
        com.vaadin.flow.di.Lookup lookup10 = null;
        com.vaadin.flow.di.Lookup lookup11 = null;
        com.vaadin.flow.di.Lookup lookup12 = com.vaadin.flow.di.Lookup.compose(lookup10, lookup11);
        com.vaadin.flow.di.Lookup lookup13 = com.vaadin.flow.di.Lookup.compose(lookup7, lookup12);
        com.vaadin.flow.di.Lookup lookup14 = com.vaadin.flow.di.Lookup.compose(lookup6, lookup13);
        com.vaadin.flow.di.Lookup lookup15 = null;
        com.vaadin.flow.di.Lookup lookup16 = null;
        com.vaadin.flow.di.Lookup lookup17 = com.vaadin.flow.di.Lookup.compose(lookup15, lookup16);
        com.vaadin.flow.di.Lookup lookup18 = null;
        com.vaadin.flow.di.Lookup lookup19 = null;
        com.vaadin.flow.di.Lookup lookup20 = com.vaadin.flow.di.Lookup.compose(lookup18, lookup19);
        com.vaadin.flow.di.Lookup lookup21 = com.vaadin.flow.di.Lookup.compose(lookup15, lookup20);
        com.vaadin.flow.di.Lookup lookup22 = com.vaadin.flow.di.Lookup.compose(lookup6, lookup15);
        org.junit.Assert.assertNotNull(lookup2);
        org.junit.Assert.assertNotNull(lookup5);
        org.junit.Assert.assertNotNull(lookup6);
        org.junit.Assert.assertNotNull(lookup9);
        org.junit.Assert.assertNotNull(lookup12);
        org.junit.Assert.assertNotNull(lookup13);
        org.junit.Assert.assertNotNull(lookup14);
        org.junit.Assert.assertNotNull(lookup17);
        org.junit.Assert.assertNotNull(lookup20);
        org.junit.Assert.assertNotNull(lookup21);
        org.junit.Assert.assertNotNull(lookup22);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements33 = element31.select("Template should have 2 divs");
        org.jsoup.select.Elements elements35 = element31.select("test");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element1.hasSameValue((java.lang.Object) element5);
        org.jsoup.select.Elements elements11 = element5.previousElementSiblings();
        org.jsoup.nodes.Element element13 = element5.val("Template element should have contained a div element with the id 'content'");
        org.jsoup.select.Elements elements15 = element5.getElementsByIndexGreaterThan((int) '4');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        java.lang.String str7 = element1.data();
        org.jsoup.select.Elements elements9 = element1.getElementsMatchingOwnText("");
        boolean boolean11 = element1.hasClass("Faulty template getter should not find elements");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        org.jsoup.select.NodeFilter nodeFilter34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = element1.filter(nodeFilter34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element9 = element5.toggleClass("Expected template element to have 2 children");
        boolean boolean10 = element1.hasSameValue((java.lang.Object) element5);
        org.jsoup.select.Elements elements11 = element5.previousElementSiblings();
        org.jsoup.nodes.Element element13 = element5.val("Template element should have contained a div element with the id 'content'");
        org.jsoup.nodes.Element element14 = element5.root();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        element1.setBaseUri("Template should have a paper-input");
        org.jsoup.select.Elements elements9 = element1.children();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str14 = element11.data();
        org.jsoup.select.Elements elements16 = element11.getElementsByTag("hash");
        org.jsoup.nodes.Element element18 = element11.appendElement("button");
        boolean boolean20 = element18.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        boolean boolean27 = element26.hasText();
        java.lang.String str28 = element26.wholeText();
        java.lang.String[] strArray37 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.jsoup.nodes.Element element40 = element26.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element41 = element18.classNames((java.util.Set<java.lang.String>) strSet38);
        org.jsoup.nodes.Element element42 = element1.classNames((java.util.Set<java.lang.String>) strSet38);
        boolean boolean43 = element42.hasParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        java.lang.String str7 = element1.nodeName();
        org.jsoup.nodes.Element element9 = element1.tagName("Template should contain one child");
        org.jsoup.select.Evaluator evaluator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = element1.is(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str7, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        org.jsoup.nodes.Element element18 = element15.root();
        int int19 = element15.attributesSize();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str24 = element21.data();
        org.jsoup.nodes.Element element26 = element21.addClass("");
        java.util.Set<java.lang.String> strSet27 = element26.classNames();
        int int28 = element26.childNodeSize();
        boolean boolean30 = element26.hasClass("Template should have 2 divs");
        // The following exception was thrown during execution in test generation
        try {
            element15.replaceWith((org.jsoup.nodes.Node) element26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element3 = element1.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element5 = element3.tagName("url");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList6 = element5.textNodes();
        org.jsoup.nodes.Element element8 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element11 = element8.firstElementSibling();
        element8.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element14 = element8.root();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str19 = element16.data();
        org.jsoup.select.Elements elements21 = element16.getElementsByTag("hash");
        org.jsoup.nodes.Element element23 = element16.appendElement("button");
        org.jsoup.select.Elements elements25 = element23.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element26 = element23.root();
        org.jsoup.select.Elements elements28 = element23.getElementsByTag("Expected template element to have 2 children");
        org.jsoup.nodes.Element element29 = element14.appendChildren((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        org.jsoup.nodes.Element element30 = element29.nextElementSibling();
        org.jsoup.nodes.Element element31 = element5.appendTo(element29);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(textNodeList6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        org.jsoup.select.Elements elements35 = element1.getElementsByAttribute("type");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements12 = element10.previousElementSiblings();
        org.jsoup.parser.Tag tag13 = element10.tag();
        org.jsoup.nodes.Element element15 = element10.prepend("likeable-element-view");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.nodes.Attributes attributes8 = element5.attributes();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        org.jsoup.nodes.Node node10 = element5.previousSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        java.lang.String str8 = element7.className();
        java.lang.String str9 = element7.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>" + "'", str9, "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.nodes.Element element6 = element1.addClass("");
        int int7 = element1.childNodeSize();
        org.jsoup.nodes.Element element10 = element1.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element13.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element20 = element10.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements19);
        element20.setBaseUri("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.nodes.Document document23 = element20.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document23.wrap("mode");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(document23);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateParserFactory templateParserFactory0 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateParserFactory();
        com.vaadin.flow.component.polymertemplate.TemplateParser templateParser1 = templateParserFactory0.createParser();
        com.vaadin.flow.component.polymertemplate.TemplateParser templateParser2 = templateParserFactory0.createParser();
        com.vaadin.flow.component.polymertemplate.TemplateParser templateParser3 = templateParserFactory0.createParser();
        org.junit.Assert.assertNotNull(templateParser1);
        org.junit.Assert.assertNotNull(templateParser2);
        org.junit.Assert.assertNotNull(templateParser3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.nodes.Element element19 = element12.toggleClass("");
        org.jsoup.nodes.Element element20 = element1.appendTo(element12);
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element24 = element22.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element27 = element22.attr("Template should contain one child", "");
        org.jsoup.nodes.Element element29 = element27.wrap("id");
        boolean boolean30 = element20.equals((java.lang.Object) element29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element29.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = element29.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = element5.wrap("Expected template element to have 2 children");
        org.jsoup.nodes.Element element10 = element5.prependElement("Faulty template getter should not find elements");
        java.lang.String str11 = element5.nodeName();
        java.lang.String str12 = element5.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Found sources from the tag '{}' in the template '{}'" + "'", str11, "Found sources from the tag '{}' in the template '{}'");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\">\n <faulty template getter should not find elements></faulty template getter should not find elements>\n</Found sources from the tag '{}' in the template '{}'>" + "'", str12, "<Found sources from the tag '{}' in the template '{}' class=\"Expected template element to have 2 children\">\n <faulty template getter should not find elements></faulty template getter should not find elements>\n</Found sources from the tag '{}' in the template '{}'>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements12 = element5.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element17 = element14.firstElementSibling();
        element14.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element20 = element14.root();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str25 = element22.data();
        org.jsoup.select.Elements elements27 = element22.getElementsByTag("hash");
        org.jsoup.nodes.Element element29 = element22.appendElement("button");
        org.jsoup.select.Elements elements31 = element29.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element32 = element29.root();
        org.jsoup.select.Elements elements34 = element29.getElementsByTag("Expected template element to have 2 children");
        org.jsoup.nodes.Element element35 = element20.appendChildren((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Element element36 = element5.appendChildren((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.nodes.Element element8 = element5.wrap("Expected template element to have 2 children");
        org.jsoup.nodes.Element element10 = element5.prependElement("Faulty template getter should not find elements");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("Parent element ID not the expected one.", "Template element should have contained a div element with the id 'content'");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.nodes.Element element4 = element2.removeClass("Several Dom-Modules");
        org.jsoup.nodes.Element element7 = element2.attr("Template should contain one child", "");
        com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData templateData8 = new com.vaadin.flow.component.polymertemplate.TemplateParser.TemplateData("Coudln't get resource for the template '{}'", element2);
        org.jsoup.nodes.Element element9 = templateData8.getTemplateElement();
        java.lang.String str10 = templateData8.getModulePath();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coudln't get resource for the template '{}'" + "'", str10, "Coudln't get resource for the template '{}'");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.select("test");
        java.lang.String str9 = element1.ownText();
        org.jsoup.select.Elements elements11 = element1.getElementsContainingOwnText("likeable-element-view");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str16 = element13.data();
        org.jsoup.nodes.Element element18 = element13.addClass("");
        int int19 = element13.childNodeSize();
        org.jsoup.nodes.Element element22 = element13.attr("No Template", "Faulty template getter should not find elements");
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements27 = element25.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element29 = element25.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element32 = element22.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Element element33 = element1.appendTo(element32);
        org.jsoup.nodes.Element element34 = element33.firstElementSibling();
        java.lang.String str35 = element34.outerHtml();
        org.jsoup.select.Elements elements37 = element34.getElementsContainingOwnText("my-component");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>" + "'", str35, "<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>");
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        org.jsoup.nodes.Element element10 = element5.prependElement("content");
        org.jsoup.select.Elements elements11 = element10.parents();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttribute("org.jsoup.UncheckedIOException: java.io.IOException: vaadin-text-field");
        org.jsoup.nodes.Element element15 = element10.prependElement("content");
        int int16 = element10.siblingIndex();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.select.Elements elements7 = element5.getElementsContainingText("Dependency [type=STYLESHEET, url=Faulty template getter should not find elements, loadMode=LAZY]");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.select.Elements elements19 = element12.select("test");
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element25 = element21.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements29 = element27.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str30 = element27.data();
        org.jsoup.select.Elements elements32 = element27.getElementsByTag("hash");
        org.jsoup.nodes.Element element34 = element27.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element35 = element21.prependChild((org.jsoup.nodes.Node) element27);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList36 = element35.dataNodes();
        org.jsoup.select.Elements elements37 = element35.nextElementSiblings();
        boolean boolean39 = element35.equals((java.lang.Object) "Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element42 = element35.attr("mode", false);
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str47 = element44.data();
        org.jsoup.select.Elements elements49 = element44.getElementsByTag("hash");
        org.jsoup.nodes.Element element51 = element44.appendElement("button");
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements55 = element53.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element56 = element53.firstElementSibling();
        org.jsoup.nodes.Element element57 = element44.appendTo(element56);
        boolean boolean58 = element57.hasText();
        org.jsoup.select.Elements elements60 = element57.getElementsContainingText("Template should have a paper-input");
        org.jsoup.nodes.Node node61 = element57.unwrap();
        org.jsoup.nodes.Element element62 = element57.lastElementSibling();
        org.jsoup.nodes.Node[] nodeArray63 = new org.jsoup.nodes.Node[] { element12, element42, element57 };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element64 = element5.insertChildren(2, nodeArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(dataNodeList36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(nodeArray63);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.select.Elements elements8 = element1.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.select.Elements elements10 = element1.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str15 = element12.data();
        org.jsoup.select.Elements elements17 = element12.getElementsByTag("hash");
        org.jsoup.nodes.Element element19 = element12.toggleClass("");
        org.jsoup.nodes.Element element20 = element1.appendTo(element12);
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValue("div", "content");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element20.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList19 = element15.dataNodes();
        org.jsoup.nodes.Element element20 = element15.empty();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element26 = element22.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element28 = element26.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element29 = element26.firstElementSibling();
        org.jsoup.nodes.Element element30 = element20.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.nodes.Element element32 = element30.wrap("likeable-element");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(dataNodeList19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Node node6 = element5.nextSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("Template element should have contained a div element with the id 'content'");
        org.jsoup.nodes.Element element10 = element5.wrap("Template element should have contained a div element with the id 'test'");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Element element18 = element15.attr("Template should have 2 divs", true);
        java.lang.String str19 = element18.className();
        org.jsoup.nodes.Element element21 = element18.tagName("Several Dom-Modules");
        java.lang.String str23 = element18.absUrl("Template element should have contained a div element with the id 'test'");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Expected template element to have 2 children" + "'", str19, "Expected template element to have 2 children");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str10 = element7.data();
        org.jsoup.select.Elements elements12 = element7.getElementsByTag("hash");
        org.jsoup.nodes.Element element14 = element7.selectFirst("Template should have 2 divs");
        org.jsoup.nodes.Element element15 = element1.prependChild((org.jsoup.nodes.Node) element7);
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList16 = element15.dataNodes();
        org.jsoup.select.Elements elements17 = element15.nextElementSiblings();
        org.jsoup.nodes.Element element18 = element15.root();
        java.lang.String str20 = element15.attr("");
        org.jsoup.nodes.Element element22 = element15.val("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        java.lang.String str23 = element22.className();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(dataNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Expected template element to have 2 children" + "'", str23, "Expected template element to have 2 children");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.toggleClass("");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueMatching("Several Dom-Modules", pattern10);
        org.jsoup.nodes.Element element13 = element8.text("<Found sources from the tag '{}' in the template '{}'></Found sources from the tag '{}' in the template '{}'>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element4 = element1.firstElementSibling();
        element1.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element7 = element1.root();
        java.lang.String str8 = element7.className();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValue("contents", "id");
        boolean boolean12 = element7.hasParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Node node6 = element5.nextSibling();
        org.jsoup.select.Elements elements8 = element5.getElementsMatchingOwnText("Template element should have contained a div element with the id 'content'");
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element13 = element10.firstElementSibling();
        element10.setBaseUri("Template element should have contained a div element with the id 'label'");
        org.jsoup.nodes.Element element16 = element10.root();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements20 = element18.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str21 = element18.data();
        org.jsoup.select.Elements elements23 = element18.getElementsByTag("hash");
        org.jsoup.nodes.Element element25 = element18.appendElement("button");
        org.jsoup.select.Elements elements27 = element25.getElementsByAttributeStarting("several-dom-modules-template");
        org.jsoup.nodes.Element element28 = element25.root();
        org.jsoup.select.Elements elements30 = element25.getElementsByTag("Expected template element to have 2 children");
        org.jsoup.nodes.Element element31 = element16.appendChildren((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = element5.after((org.jsoup.nodes.Node) element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = element5.childNodesCopy();
        org.jsoup.select.Evaluator evaluator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.selectFirst(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        org.jsoup.select.Elements elements8 = element5.getElementsContainingOwnText("several-dom-modules-template");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        org.jsoup.select.Elements elements10 = element1.nextElementSiblings();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = element1.childNodes();
        java.lang.String str10 = element1.toString();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Found sources from the tag '{}' in the template '{}'>\n <button></button>\n</Found sources from the tag '{}' in the template '{}'>" + "'", str10, "<Found sources from the tag '{}' in the template '{}'>\n <button></button>\n</Found sources from the tag '{}' in the template '{}'>");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        org.jsoup.nodes.Element element7 = element5.html("Tag name doesn't match the JS module name");
        org.jsoup.nodes.Element element8 = element5.firstElementSibling();
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueMatching("Expected template element to have 3 children", pattern10);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        java.lang.String str14 = element13.baseUri();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements18 = element16.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements22 = element20.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element24 = element20.toggleClass("Expected template element to have 2 children");
        boolean boolean25 = element16.hasSameValue((java.lang.Object) element20);
        org.jsoup.select.Elements elements26 = element20.previousElementSiblings();
        org.jsoup.nodes.Element element27 = element13.appendTo(element20);
        java.lang.String str28 = element20.normalName();
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "found sources from the tag '{}' in the template '{}'" + "'", str28, "found sources from the tag '{}' in the template '{}'");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element5 = element1.toggleClass("Expected template element to have 2 children");
        boolean boolean6 = element5.hasText();
        java.lang.String str7 = element5.wholeText();
        org.jsoup.nodes.Element element9 = element5.prepend("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.select.Elements elements12 = element5.getElementsByAttributeValueContaining("found sources from the tag '{}' in the template '{}'", "several-dom-modules-template");
        org.jsoup.nodes.Element element14 = element5.text("Template should contain one child");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements3 = element1.getElementsByIndexGreaterThan((int) (short) -1);
        java.lang.String str4 = element1.data();
        org.jsoup.select.Elements elements6 = element1.getElementsByTag("hash");
        org.jsoup.nodes.Element element8 = element1.appendElement("button");
        boolean boolean10 = element8.hasSameValue((java.lang.Object) "Parent element ID not the expected one.");
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element("Found sources from the tag '{}' in the template '{}'");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (short) -1);
        org.jsoup.nodes.Element element16 = element12.toggleClass("Expected template element to have 2 children");
        boolean boolean17 = element16.hasText();
        java.lang.String str18 = element16.wholeText();
        java.lang.String[] strArray27 = new java.lang.String[] { "Faulty template getter should not find elements", "Template element should have contained a div element with the id 'label'", "Tag name doesn't match the JS module name", "Found sources from the tag '{}' in the template '{}'", "foo-view", "Found sources from the tag '{}' in the template '{}'", "Template should have 2 divs", "Template element should have contained a div element with the id 'button'" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = element16.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element8.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element33 = element8.appendElement("org.jsoup.UncheckedIOException: java.io.IOException: child-template");
        org.jsoup.select.Elements elements35 = element33.getElementsMatchingOwnText("type");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
    }
}

