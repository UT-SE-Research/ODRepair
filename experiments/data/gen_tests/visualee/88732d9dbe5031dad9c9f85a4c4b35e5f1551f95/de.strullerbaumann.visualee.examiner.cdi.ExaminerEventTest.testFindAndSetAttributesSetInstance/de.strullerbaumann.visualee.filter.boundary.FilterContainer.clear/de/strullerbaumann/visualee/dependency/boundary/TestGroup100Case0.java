package de.strullerbaumann.visualee.dependency.boundary;

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
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        org.junit.Assert.assertNotNull(filterContainer0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        de.strullerbaumann.visualee.filter.entity.Filter filter17 = null;
        filterContainer0.add(filter17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource18 = null;
        boolean boolean19 = filterContainer0.isOk(javaSource18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource14 = null;
        boolean boolean15 = filterContainer0.isOk(javaSource14);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.filter.entity.Filter filter17 = null;
        filterContainer0.add(filter17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource18 = null;
        boolean boolean19 = filterContainer0.isOk(javaSource18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource14 = null;
        boolean boolean15 = filterContainer0.isOk(javaSource14);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(filterList17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList15);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList18 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(filterList18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        de.strullerbaumann.visualee.filter.entity.Filter filter18 = null;
        filterContainer0.add(filter18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.filter.entity.Filter filter16 = null;
        filterContainer0.add(filter16);
        de.strullerbaumann.visualee.filter.entity.Filter filter18 = null;
        filterContainer0.add(filter18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter18 = null;
        filterContainer0.add(filter18);
        de.strullerbaumann.visualee.filter.entity.Filter filter20 = null;
        filterContainer0.add(filter20);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter18 = null;
        filterContainer0.add(filter18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertNotNull(filterList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter16 = null;
        filterContainer0.add(filter16);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.filter.entity.Filter filter16 = null;
        filterContainer0.add(filter16);
        de.strullerbaumann.visualee.filter.entity.Filter filter18 = null;
        filterContainer0.add(filter18);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        org.junit.Assert.assertNotNull(filterContainer0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource14 = null;
        boolean boolean15 = filterContainer0.isOk(javaSource14);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource16 = null;
        boolean boolean17 = filterContainer0.isOk(javaSource16);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        de.strullerbaumann.visualee.filter.entity.Filter filter16 = null;
        filterContainer0.add(filter16);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource18 = null;
        boolean boolean19 = filterContainer0.isOk(javaSource18);
        de.strullerbaumann.visualee.filter.entity.Filter filter20 = null;
        filterContainer0.add(filter20);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(filterList15);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.filter.entity.Filter filter17 = null;
        filterContainer0.add(filter17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource17 = null;
        boolean boolean18 = filterContainer0.isOk(javaSource17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter2 = null;
        filterContainer0.add(filter2);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.filter.entity.Filter filter17 = null;
        filterContainer0.add(filter17);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource19 = null;
        boolean boolean20 = filterContainer0.isOk(javaSource19);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource22 = null;
        boolean boolean23 = filterContainer0.isOk(javaSource22);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList16 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertNotNull(filterList11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList3 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource12 = null;
        boolean boolean13 = filterContainer0.isOk(javaSource12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource10 = null;
        boolean boolean11 = filterContainer0.isOk(javaSource10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource15 = null;
        boolean boolean16 = filterContainer0.isOk(javaSource15);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList18 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter19 = null;
        filterContainer0.add(filter19);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(filterList18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.filter.entity.Filter filter13 = null;
        filterContainer0.add(filter13);
        de.strullerbaumann.visualee.filter.entity.Filter filter15 = null;
        filterContainer0.add(filter15);
        de.strullerbaumann.visualee.filter.entity.Filter filter17 = null;
        filterContainer0.add(filter17);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(filterList6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList4 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList4);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList9 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource5 = null;
        boolean boolean6 = filterContainer0.isOk(javaSource5);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList7 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource8 = null;
        boolean boolean9 = filterContainer0.isOk(javaSource8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(filterList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList8 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource11 = null;
        boolean boolean12 = filterContainer0.isOk(javaSource11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filterList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource6 = null;
        boolean boolean7 = filterContainer0.isOk(javaSource6);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource9 = null;
        boolean boolean10 = filterContainer0.isOk(javaSource9);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource3 = null;
        boolean boolean4 = filterContainer0.isOk(javaSource3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        de.strullerbaumann.visualee.filter.entity.Filter filter7 = null;
        filterContainer0.add(filter7);
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList12 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList13 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter14 = null;
        filterContainer0.add(filter14);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList12);
        org.junit.Assert.assertNotNull(filterList13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        de.strullerbaumann.visualee.filter.entity.Filter filter5 = null;
        filterContainer0.add(filter5);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource14 = null;
        boolean boolean15 = filterContainer0.isOk(javaSource14);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList17 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource18 = null;
        boolean boolean19 = filterContainer0.isOk(javaSource18);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList20 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(filterList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(filterList20);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        filterContainer0.clear();
        filterContainer0.clear();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        de.strullerbaumann.visualee.filter.entity.Filter filter9 = null;
        filterContainer0.add(filter9);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList14 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertNotNull(filterList14);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource4 = null;
        boolean boolean5 = filterContainer0.isOk(javaSource4);
        filterContainer0.clear();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        de.strullerbaumann.visualee.filter.entity.Filter filter10 = null;
        filterContainer0.add(filter10);
        de.strullerbaumann.visualee.filter.entity.Filter filter12 = null;
        filterContainer0.add(filter12);
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList1 = filterContainer0.getFilters();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList2 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.filter.entity.Filter filter4 = null;
        filterContainer0.add(filter4);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList6 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource7 = null;
        boolean boolean8 = filterContainer0.isOk(javaSource7);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList10 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter11 = null;
        filterContainer0.add(filter11);
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertNotNull(filterList1);
        org.junit.Assert.assertNotNull(filterList2);
        org.junit.Assert.assertNotNull(filterList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(filterList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        de.strullerbaumann.visualee.filter.boundary.FilterContainer filterContainer0 = de.strullerbaumann.visualee.filter.boundary.FilterContainer.getInstance();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource1 = null;
        boolean boolean2 = filterContainer0.isOk(javaSource1);
        de.strullerbaumann.visualee.filter.entity.Filter filter3 = null;
        filterContainer0.add(filter3);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList5 = filterContainer0.getFilters();
        de.strullerbaumann.visualee.filter.entity.Filter filter6 = null;
        filterContainer0.add(filter6);
        de.strullerbaumann.visualee.filter.entity.Filter filter8 = null;
        filterContainer0.add(filter8);
        filterContainer0.clear();
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList11 = filterContainer0.getFilters();
        filterContainer0.clear();
        de.strullerbaumann.visualee.source.entity.JavaSource javaSource13 = null;
        boolean boolean14 = filterContainer0.isOk(javaSource13);
        java.util.List<de.strullerbaumann.visualee.filter.entity.Filter> filterList15 = filterContainer0.getFilters();
        org.junit.Assert.assertNotNull(filterContainer0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(filterList5);
        org.junit.Assert.assertNotNull(filterList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(filterList15);
    }
}

