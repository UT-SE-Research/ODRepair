package com.vaadin.flow.component.polymertemplate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.vaadin.flow.component.polymertemplate.NpmTemplateParser npmTemplateParser0 = new com.vaadin.flow.component.polymertemplate.NpmTemplateParser();
        com.vaadin.flow.server.VaadinService vaadinService1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean2 = npmTemplateParser0.isStatsFileReadNeeded(vaadinService1);
    }
}

