package org.apache.hadoop.registry.client.binding;

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
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule0 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = hadoopLoginModule0.commit();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.util.regex.Pattern pattern3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        configuration1.setPattern("UGI loginUser: {}", pattern3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        int int12 = configuration1.size();
        java.net.InetSocketAddress inetSocketAddress17 = configuration1.getSocketAddr("net.topology.dependency.script.file.name", "Logout successful for user", "io.sort.mb", 20000);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation19 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str20 = userGroupInformation19.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials21 = userGroupInformation19.getCredentials();
        java.lang.String str22 = userGroupInformation19.getUserName();
        java.lang.String[] strArray23 = userGroupInformation19.getGroupNames();
        configuration1.setStrings("callqueue.overflow.trigger.failover", strArray23);
        java.util.regex.Pattern pattern26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        configuration1.setPattern("rpc.metrics.percentiles.intervals", pattern26);
    }
}

