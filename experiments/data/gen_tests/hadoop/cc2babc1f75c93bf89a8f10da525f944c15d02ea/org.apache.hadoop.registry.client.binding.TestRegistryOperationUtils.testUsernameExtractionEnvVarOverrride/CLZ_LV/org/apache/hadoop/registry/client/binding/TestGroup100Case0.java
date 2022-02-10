package org.apache.hadoop.registry.client.binding;

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
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_METRICS_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.http.metrics.enabled" + "'", str0, "hadoop.http.metrics.enabled");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.DEFAULT_HADOOP_JETTY_LOGS_SERVE_ALIASES;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5000 + "'", int0 == 5000);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CLIENT_RESOLVE_REMOTE_SYMLINKS_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_LOW_LATENCY_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_MAPFILE_BLOOM_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.mapfile.bloom.size" + "'", str0, "io.mapfile.bloom.size");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_ZSTD_BUFFER_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_TAGS_SYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.tags.system" + "'", str0, "hadoop.tags.system");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTHORIZATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.authorization" + "'", str0, "hadoop.security.authorization");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_DNS_LOG_SLOW_LOOKUPS_THRESHOLD_MS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_ON_SOCKET_TIMEOUTS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connect.max.retries.on.timeouts" + "'", str0, "ipc.client.connect.max.retries.on.timeouts");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CLIENT_RESOLVE_REMOTE_SYMLINKS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.client.resolve.remote.symlinks" + "'", str0, "fs.client.resolve.remote.symlinks");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_RETRY_INTERVAL_MS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUP_SHELL_COMMAND_TIMEOUT_SECS_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        javax.security.auth.Subject subject0 = null;
        org.apache.hadoop.security.UserGroupInformation.loginUserFromSubject(subject0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_FILE_IMPL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.file.impl" + "'", str0, "fs.file.impl");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_TCPNODELAY_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.tcpnodelay" + "'", str0, "ipc.server.tcpnodelay");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CREATION_PARALLEL_COUNT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_CONNECT_MAX_RETRIES_ON_SASL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connect.max.retries.on.sasl" + "'", str0, "ipc.client.connect.max.retries.on.sasl");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.RPC_METRICS_TIME_UNIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rpc.metrics.timeunit" + "'", str0, "rpc.metrics.timeunit");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_JAVA_SECURE_RANDOM_ALGORITHM_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.java.secure.random.algorithm" + "'", str0, "hadoop.security.java.secure.random.algorithm");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.NET_TOPOLOGY_TABLE_MAPPING_FILE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "net.topology.table.file.name" + "'", str0, "net.topology.table.file.name");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_HANDLER_QUEUE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CLIENT_TOPOLOGY_RESOLUTION_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.client.resolve.topology.enabled" + "'", str0, "fs.client.resolve.topology.enabled");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_PING_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.ping.interval" + "'", str0, "ipc.ping.interval");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        boolean boolean0 = org.apache.hadoop.security.UserGroupInformation.isLoginTicketBased();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_RPC_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.rpc-timeout.ms" + "'", str0, "ipc.client.rpc-timeout.ms");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SORT_FACTOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.sort.factor" + "'", str0, "io.sort.factor");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_CLIENT_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.client.protocol.acl" + "'", str0, "security.client.protocol.acl");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_JETTY_LOGS_SERVE_ALIASES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.jetty.logs.serve.aliases" + "'", str0, "hadoop.jetty.logs.serve.aliases");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_IO_CHUNK_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1048576 + "'", int0 == 1048576);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration(configuration0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_SEPARATOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.caller.context.separator" + "'", str0, "hadoop.caller.context.separator");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUP_SHELL_COMMAND_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTH_TO_LOCAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.auth_to_local" + "'", str0, "hadoop.security.auth_to_local");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_FS_INPUT_BUFFER_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tfile.fs.input.buffer.size" + "'", str0, "tfile.fs.input.buffer.size");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SCHEDULER_PRIORITY_LEVELS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "scheduler.priority.levels" + "'", str0, "scheduler.priority.levels");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DEFAULT_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.defaultFS" + "'", str0, "fs.defaultFS");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SEQFILE_COMPRESS_BLOCKSIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.seqfile.compress.blocksize" + "'", str0, "io.seqfile.compress.blocksize");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_METRICS_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DU_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.du.interval" + "'", str0, "fs.du.interval");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_TRASH_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.trash.interval" + "'", str0, "fs.trash.interval");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        javax.security.auth.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getUGIFromSubject(subject0);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.security.KerberosAuthException; message:  Subject must not be null");
        } catch (org.apache.hadoop.security.KerberosAuthException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SORT_MB_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_TCPNODELAY_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_QJOURNAL_SERVICE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.qjournal.service.protocol.acl" + "'", str0, "security.qjournal.service.protocol.acl");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_REUSEADDR_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_CONNECTION_RETRIES_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connect.max.retries" + "'", str0, "ipc.client.connect.max.retries");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CREDENTIAL_CLEAR_TEXT_FALLBACK_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_AUTOMATIC_CLOSE_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_COST_PROVIDER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cost-provider.impl" + "'", str0, "cost-provider.impl");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CALLQUEUE_IMPL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "callqueue.impl" + "'", str0, "callqueue.impl");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_RPC_SOCKET_FACTORY_CLASS_DEFAULT_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.hadoop.net.StandardSocketFactory" + "'", str0, "org.apache.hadoop.net.StandardSocketFactory");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CALLQUEUE_SERVER_FAILOVER_ENABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "callqueue.overflow.trigger.failover" + "'", str0, "callqueue.overflow.trigger.failover");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUP_MAPPING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.group.mapping" + "'", str0, "hadoop.security.group.mapping");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        boolean boolean1 = org.apache.hadoop.conf.Configuration.isDeprecated("Group Ids:");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_CLI_CHECK_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.failover-controller.cli-check.rpc-timeout.ms" + "'", str0, "ha.failover-controller.cli-check.rpc-timeout.ms");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_KERBEROS_MIN_SECONDS_BEFORE_RELOGIN_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60 + "'", int0 == 60);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.slf4j.Logger logger0 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str2 = userGroupInformation1.getPrimaryGroupName();
        java.util.List<java.lang.String> strList3 = userGroupInformation1.getGroups();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(logger0, userGroupInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anonymous" + "'", str2, "anonymous");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.RPC_METRICS_QUANTILE_ENABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rpc.metrics.quantile.enable" + "'", str0, "rpc.metrics.quantile.enable");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_SNAPPY_BUFFERSIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 262144 + "'", int0 == 262144);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.apache.hadoop.conf.Configuration.dumpDeprecatedKeys();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_RETRY_INTERVAL_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk.retry-interval-ms" + "'", str0, "hadoop.zk.retry-interval-ms");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_FS_OUTPUT_BUFFER_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tfile.fs.output.buffer.size" + "'", str0, "tfile.fs.output.buffer.size");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_MAXIMUM_RESPONSE_LENGTH_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 134217728 + "'", int0 == 134217728);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_KERBEROS_MIN_SECONDS_BEFORE_RELOGIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.kerberos.min.seconds.before.relogin" + "'", str0, "hadoop.kerberos.min.seconds.before.relogin");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CODEC_CLASSES_AES_CTR_NOPADDING_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.crypto.codec.classes.aes.ctr.nopadding" + "'", str0, "hadoop.security.crypto.codec.classes.aes.ctr.nopadding");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_INTERQJOURNAL_SERVICE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.interqjournal.service.protocol.acl" + "'", str0, "security.interqjournal.service.protocol.acl");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CLIENT_TOPOLOGY_RESOLUTION_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_NEGATIVE_CACHE_SECS_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30L + "'", long0 == 30L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_RPC_READ_CONNECTION_QUEUE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_CONNECTION_IDLESCANINTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connection.idle-scan-interval.ms" + "'", str0, "ipc.client.connection.idle-scan-interval.ms");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_COMPRESSION_CODEC_LZO_CLASS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.lzo.class" + "'", str0, "io.compression.codec.lzo.class");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_KERBEROS_KEYTAB_LOGIN_AUTORENEWAL_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_IDENTITY_PROVIDER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "identity-provider.impl" + "'", str0, "identity-provider.impl");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.apache.hadoop.metrics2.util.Quantile[] quantileArray0 = org.apache.hadoop.metrics2.lib.MutableQuantiles.quantiles;
        org.junit.Assert.assertNotNull(quantileArray0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.apache.hadoop.conf.Configuration.reloadExistingConfigurations();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.SEQ_IO_SORT_MB_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "seq.io.sort.mb" + "'", str0, "seq.io.sort.mb");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_REUSEADDR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.reuseaddr" + "'", str0, "ipc.server.reuseaddr");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_FAILOVER_SLEEP_MAX_MILLIS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.kms.client.failover.sleep.max.millis" + "'", str0, "hadoop.security.kms.client.failover.sleep.max.millis");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_PROVIDER_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.key.provider.path" + "'", str0, "hadoop.security.key.provider.path");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_PROTECTED_DIRECTORIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.protected.directories" + "'", str0, "fs.protected.directories");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation.setConfiguration(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_BACKGROUND_RELOAD_THREADS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.groups.cache.background.reload.threads" + "'", str0, "hadoop.security.groups.cache.background.reload.threads");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_DNS_NAMESERVER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.dns.nameserver" + "'", str0, "hadoop.security.dns.nameserver");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_USER_GROUP_STATIC_OVERRIDES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.user.group.static.mapping.overrides" + "'", str0, "hadoop.user.group.static.mapping.overrides");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_NEGATIVE_CACHE_SECS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.groups.negative-cache.secs" + "'", str0, "hadoop.security.groups.negative-cache.secs");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_BACKGROUND_RELOAD_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_CLI_CHECK_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20000 + "'", int0 == 20000);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_DNS_INTERFACE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.dns.interface" + "'", str0, "hadoop.security.dns.interface");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        boolean boolean0 = org.apache.hadoop.security.UserGroupInformation.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CREDENTIAL_CLEAR_TEXT_FALLBACK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.credential.clear-text-fallback" + "'", str0, "hadoop.security.credential.clear-text-fallback");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_LOG_SLOW_RPC_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk.auth" + "'", str0, "hadoop.zk.auth");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_BIND_WILDCARD_ADDR_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_ADDRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk.address" + "'", str0, "hadoop.zk.address");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk." + "'", str0, "hadoop.zk.");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_MAX_CONNECTIONS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.max.connections" + "'", str0, "ipc.server.max.connections");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SEQFILE_COMPRESS_BLOCKSIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000000 + "'", int0 == 1000000);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_TRASH_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_MAX_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.caller.context.max.size" + "'", str0, "hadoop.caller.context.max.size");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_NAMENODE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.namenode.protocol.acl" + "'", str0, "security.namenode.protocol.acl");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_SECS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.groups.cache.secs" + "'", str0, "hadoop.security.groups.cache.secs");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CREDENTIAL_PASSWORD_FILE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.credstore.java-keystore-provider.password-file" + "'", str0, "hadoop.security.credstore.java-keystore-provider.password-file");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CODEC_CLASSES_AES_CTR_NOPADDING_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.hadoop.crypto.OpensslAesCtrCryptoCodec,org.apache.hadoop.crypto.JceAesCtrCryptoCodec" + "'", str0, "org.apache.hadoop.crypto.OpensslAesCtrCryptoCodec,org.apache.hadoop.crypto.JceAesCtrCryptoCodec");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL_ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error" + "'", str0, "error");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_PROMETHEUS_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.prometheus.endpoint.enabled" + "'", str0, "hadoop.prometheus.endpoint.enabled");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation0);
        org.apache.hadoop.security.Credentials credentials4 = userGroupInformation0.getCredentials();
        java.util.Set<java.lang.String> strSet5 = userGroupInformation0.getGroupsSet();
        java.lang.String str6 = userGroupInformation0.getPrimaryGroupName();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.FS_PERMISSIONS_UMASK_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18 + "'", int0 == 18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_KILL_MAX_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.kill.max" + "'", str0, "ipc.client.kill.max");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_PING_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_LISTEN_QUEUE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_ELECTOR_ZK_OP_RETRIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.failover-controller.active-standby-elector.zk.op.retries" + "'", str0, "ha.failover-controller.active-standby-elector.zk.op.retries");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.NFS_EXPORTS_ALLOWED_HOSTS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nfs.exports.allowed.hosts" + "'", str0, "nfs.exports.allowed.hosts");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_CONNECT_MAX_RETRIES_ON_SASL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.FS_HOME_DIR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.homeDir" + "'", str0, "fs.homeDir");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_LZO_BUFFERSIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.lzo.buffersize" + "'", str0, "io.compression.codec.lzo.buffersize");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SORT_FACTOR_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.NET_TOPOLOGY_SCRIPT_FILE_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "net.topology.script.file.name" + "'", str0, "net.topology.script.file.name");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_CHECK_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_AUTHENTICATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.authentication" + "'", str0, "hadoop.security.authentication");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_MAXIMUM_RESPONSE_LENGTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.maximum.response.length" + "'", str0, "ipc.maximum.response.length");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_ENABLED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.caller.context.enabled" + "'", str0, "hadoop.caller.context.enabled");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DATANODE_LIFELINE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.datanode.lifeline.protocol.acl" + "'", str0, "security.datanode.lifeline.protocol.acl");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "debug" + "'", str0, "debug");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_RPC_MAX_RESPONSE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1048576 + "'", int0 == 1048576);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_IO_CHUNK_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tfile.io.chunk.size" + "'", str0, "tfile.io.chunk.size");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_ZKFC_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.zkfc.protocol.acl" + "'", str0, "security.zkfc.protocol.acl");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SKIP_CHECKSUM_ERRORS_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_CONNECT_RETRY_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.health-monitor.connect-retry-interval.ms" + "'", str0, "ha.health-monitor.connect-retry-interval.ms");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_ASYNC_CALLS_MAX_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.apache.hadoop.fs.CommonConfigurationKeys commonConfigurationKeys0 = new org.apache.hadoop.fs.CommonConfigurationKeys();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CALLQUEUE_CAPACITY_WEIGHTS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "callqueue.capacity.weights" + "'", str0, "callqueue.capacity.weights");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.NFS_EXPORTS_ALLOWED_HOSTS_KEY_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "* rw" + "'", str0, "* rw");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.KERBEROS_TICKET_CACHE_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.kerberos.ticket.cache.path" + "'", str0, "hadoop.security.kerberos.ticket.cache.path");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.apache.hadoop.security.UserGroupInformation.setShouldRenewImmediatelyForTests(false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_GET_USER_MAPPINGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.get.user.mappings.protocol.acl" + "'", str0, "security.get.user.mappings.protocol.acl");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_RPC_CONNECT_MAX_RETRIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.health-monitor.rpc.connect.max.retries" + "'", str0, "ha.health-monitor.rpc.connect.max.retries");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_ZSTD_LEVEL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("latency", "com.sun.security.auth.UnixPrincipal");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SORT_MB_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.sort.mb" + "'", str0, "io.sort.mb");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_FAILOVER_MAX_RETRIES_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.kms.client.failover.max.retries" + "'", str0, "hadoop.security.kms.client.failover.max.retries");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_DEFAULT_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.service.authorization.default.acl" + "'", str0, "security.service.authorization.default.acl");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CODEC_CLASSES_SM4_CTR_NOPADDING_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.crypto.codec.classes.sm4.ctr.nopadding" + "'", str0, "hadoop.security.crypto.codec.classes.sm4.ctr.nopadding");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_DATANODE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.datanode.protocol.acl" + "'", str0, "security.datanode.protocol.acl");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_PING_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.apache.hadoop.security.UserGroupInformation.reattachMetrics();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_FAILOVER_SLEEP_BASE_MILLIS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_HANDLER_QUEUE_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.handler.queue.size" + "'", str0, "ipc.server.handler.queue.size");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_BACKOFF_ENABLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "backoff.enable" + "'", str0, "backoff.enable");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SCHEDULER_IMPL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "scheduler.impl" + "'", str0, "scheduler.impl");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SERVICE_USER_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.service.user.name.key" + "'", str0, "hadoop.security.service.user.name.key");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_ROUTER_ADMIN_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.router.admin.protocol.acl" + "'", str0, "security.router.admin.protocol.acl");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_CHECK_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.health-monitor.check-interval.ms" + "'", str0, "ha.health-monitor.check-interval.ms");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod0 = org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.KERBEROS_SSL;
        org.junit.Assert.assertTrue("'" + authenticationMethod0 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.KERBEROS_SSL + "'", authenticationMethod0.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.KERBEROS_SSL));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges1 = new org.apache.hadoop.conf.Configuration.IntegerRanges("Logout successful for user");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Logout successful for user\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_UTIL_HASH_TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.util.hash.type" + "'", str0, "hadoop.util.hash.type");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_JAVA_SECURE_RANDOM_ALGORITHM_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA1PRNG" + "'", str0, "SHA1PRNG");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        boolean boolean3 = userGroupInformation0.hasKerberosCredentials();
        org.apache.hadoop.security.UserGroupInformation.setLoginUser(userGroupInformation0);
        java.lang.String str5 = userGroupInformation0.getShortUserName();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = userGroupInformation0.getRealUser();
        userGroupInformation0.reloginFromKeytab();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anonymous" + "'", str5, "anonymous");
        org.junit.Assert.assertNull(userGroupInformation6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_CREATION_PARALLEL_COUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.creation.parallel.count" + "'", str0, "fs.creation.parallel.count");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.slf4j.Logger logger0 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str3 = userGroupInformation2.getPrimaryGroupName();
        userGroupInformation2.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation6 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str7 = userGroupInformation6.getPrimaryGroupName();
        userGroupInformation6.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation6);
        java.lang.String[] strArray13 = new java.lang.String[] { "fs.file.impl", "Warning, no kerberos ticket found while attempting to renew ticket", "security.client.protocol.acl" };
        org.apache.hadoop.security.UserGroupInformation userGroupInformation14 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation6, strArray13);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation15 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("UGI:", userGroupInformation2, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(logger0, userGroupInformation15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anonymous" + "'", str3, "anonymous");
        org.junit.Assert.assertNotNull(userGroupInformation6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anonymous" + "'", str7, "anonymous");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(userGroupInformation14);
        org.junit.Assert.assertNotNull(userGroupInformation15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_METRICS_JVM_USE_THREAD_MXBEAN_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_INSTRUMENTATION_REQUIRES_ADMIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.instrumentation.requires.admin" + "'", str0, "hadoop.security.instrumentation.requires.admin");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DF_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.df.interval" + "'", str0, "fs.df.interval");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_TCPNODELAY_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.tcpnodelay" + "'", str0, "ipc.client.tcpnodelay");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CODEC_CLASSES_SM4_CTR_NOPADDING_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.hadoop.crypto.OpensslSm4CtrCryptoCodec,org.apache.hadoop.crypto.JceSm4CtrCryptoCodec" + "'", str0, "org.apache.hadoop.crypto.OpensslSm4CtrCryptoCodec,org.apache.hadoop.crypto.JceSm4CtrCryptoCodec");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.security.dns.interface");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_IDLETHRESHOLD_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4000 + "'", int0 == 4000);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CALLQUEUE_SERVER_FAILOVER_ENABLE_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_WARN_AFTER_MS_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 5000L + "'", long0 == 5000L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.file.buffer.size" + "'", str0, "io.file.buffer.size");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL_INFO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "info" + "'", str0, "info");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_UTIL_HASH_TYPE_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "murmur" + "'", str0, "murmur");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_SEPARATOR_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60 + "'", int0 == 60);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_TRASH_CHECKPOINT_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.trash.checkpoint.interval" + "'", str0, "fs.trash.checkpoint.interval");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.NET_TOPOLOGY_CONFIGURED_NODE_MAPPING_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "net.topology.configured.node.mapping" + "'", str0, "net.topology.configured.node.mapping");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_IDLE_TIMEOUT_MS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_RETRY_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connect.retry.interval" + "'", str0, "ipc.client.connect.retry.interval");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_AUTOMATIC_CLOSE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.automatic.close" + "'", str0, "fs.automatic.close");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        java.lang.String[] strArray3 = userGroupInformation0.getGroupNames();
        userGroupInformation0.forceReloginFromKeytab();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation0.getCredentials();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(credentials5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "ipc.client.connect.max.retries", "os.name", "hbase@HADOOP.APACHE.ORG", 134217728);
        org.apache.hadoop.metrics2.util.QuantileEstimator quantileEstimator6 = null;
        mutableQuantiles5.setEstimator(quantileEstimator6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_CLIENT_DATANODE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.client.datanode.protocol.acl" + "'", str0, "security.client.datanode.protocol.acl");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation0);
        org.apache.hadoop.security.Credentials credentials4 = userGroupInformation0.getCredentials();
        java.util.Set<java.lang.String> strSet5 = userGroupInformation0.getGroupsSet();
        java.lang.Class<?> wildcardClass6 = userGroupInformation0.getClass();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(credentials4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_NEW_ACTIVE_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.SEQ_IO_SORT_FACTOR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "seq.io.sort.factor" + "'", str0, "seq.io.sort.factor");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_LZ4_USELZ4HC_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_LOGS_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod0 = org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY;
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod1 = authenticationMethod0.getAuthMethod();
        org.junit.Assert.assertTrue("'" + authenticationMethod0 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY + "'", authenticationMethod0.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY));
        org.junit.Assert.assertNull(authMethod1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.NET_TOPOLOGY_IMPL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "net.topology.impl" + "'", str0, "net.topology.impl");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_FALLBACK_TO_SIMPLE_AUTH_ALLOWED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc" + "'", str0, "ipc");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_OPENSSL_ENGINE_ID_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.openssl.engine.id" + "'", str0, "hadoop.security.openssl.engine.id");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_LOG_SLOW_RPC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.log.slow.rpc" + "'", str0, "ipc.server.log.slow.rpc");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CIPHER_SUITE_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AES/CTR/NoPadding" + "'", str0, "AES/CTR/NoPadding");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("fs.protected.directories");
        org.junit.Assert.assertNotNull(userGroupInformation1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod1 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.security.authorization", authMethod1);
        userGroupInformation2.logoutUserFromKeytab();
        boolean boolean4 = userGroupInformation2.shouldRelogin();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_RETRY_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_LZO_BUFFERSIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65536 + "'", int0 == 65536);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.addDeprecation("fs.trash.checkpoint.interval", strArray1, "ipc.ping.interval");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_RPC_PROTECTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.rpc.protection" + "'", str0, "hadoop.rpc.protection");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECTION_MAXIDLETIME_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000 + "'", int0 == 10000);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_LOGS_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.http.logs.enabled" + "'", str0, "hadoop.http.logs.enabled");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_DNS_LOG_SLOW_LOOKUPS_ENABLED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.dns.log-slow-lookups.enabled" + "'", str0, "hadoop.security.dns.log-slow-lookups.enabled");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.iostatistics.logging.level" + "'", str0, "fs.iostatistics.logging.level");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.apache.hadoop.conf.Configuration.addDeprecation("security.qjournal.service.protocol.acl", "os.name");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.apache.hadoop.security.UserGroupInformation.reset();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SENSITIVE_CONFIG_KEYS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.sensitive-config-keys" + "'", str0, "hadoop.security.sensitive-config-keys");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SERIALIZATIONS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.serializations" + "'", str0, "io.serializations");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_MAX_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_RPC_MAX_RESPONSE_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.max.response.size" + "'", str0, "ipc.server.max.response.size");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_GENERIC_REFRESH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.refresh.generic.protocol.acl" + "'", str0, "security.refresh.generic.protocol.acl");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_NUM_RETRIES_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod1 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.security.authorization", authMethod1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = userGroupInformation2.getPrimaryGroupName();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: There is no primary group for UGI hadoop.security.authorization (auth:CERTIFICATE)");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DEFAULT_NAME_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file:///" + "'", str0, "file:///");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_BACKOFF_ENABLE_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_JCEKS_KEY_SERIALFILTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.crypto.jceks.key.serialfilter" + "'", str0, "hadoop.security.crypto.jceks.key.serialfilter");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECTION_MAXIDLETIME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connection.maxidletime" + "'", str0, "ipc.client.connection.maxidletime");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.apache.hadoop.conf.Configuration.addDeprecation("hadoop.prometheus.endpoint.enabled", "ipc.server.handler.queue.size", "fs.file.impl");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str2 = userGroupInformation1.getPrimaryGroupName();
        userGroupInformation1.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation1);
        java.lang.String[] strArray8 = new java.lang.String[] { "fs.file.impl", "Warning, no kerberos ticket found while attempting to renew ticket", "security.client.protocol.acl" };
        org.apache.hadoop.security.UserGroupInformation userGroupInformation9 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation1, strArray8);
        userGroupInformation9.reloginFromKeytab();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anonymous" + "'", str2, "anonymous");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(userGroupInformation9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.connect.timeout" + "'", str0, "ipc.client.connect.timeout");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str2 = userGroupInformation1.getPrimaryGroupName();
        java.util.List<java.lang.String> strList3 = userGroupInformation1.getGroups();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str6 = userGroupInformation5.getPrimaryGroupName();
        userGroupInformation5.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation5);
        java.lang.String[] strArray12 = new java.lang.String[] { "fs.file.impl", "Warning, no kerberos ticket found while attempting to renew ticket", "security.client.protocol.acl" };
        org.apache.hadoop.security.UserGroupInformation userGroupInformation13 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation5, strArray12);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation14 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("hadoop.security.dns.interface", userGroupInformation1, strArray12);
        userGroupInformation14.logoutUserFromKeytab();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anonymous" + "'", str2, "anonymous");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(userGroupInformation13);
        org.junit.Assert.assertNotNull(userGroupInformation14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_MAPFILE_BLOOM_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1048576 + "'", int0 == 1048576);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.apache.hadoop.conf.Configuration.addDefaultResource("hadoop.security.key.provider.path");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_RPC_SOCKET_FACTORY_CLASS_DEFAULT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.rpc.socket.factory.class.default" + "'", str0, "hadoop.rpc.socket.factory.class.default");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_MAX_CONNECTIONS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SCHEDULER_PRIORITY_LEVELS_DEFAULT_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_BIND_WILDCARD_ADDR_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.bind.wildcard.addr" + "'", str0, "ipc.client.bind.wildcard.addr");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL_WARN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "warn" + "'", str0, "warn");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_TIMEOUT_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk.timeout-ms" + "'", str0, "hadoop.zk.timeout-ms");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_SECS_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 300L + "'", long0 == 300L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_KERBEROS_KEYTAB_LOGIN_AUTORENEWAL_ENABLED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.kerberos.keytab.login.autorenewal.enabled" + "'", str0, "hadoop.kerberos.keytab.login.autorenewal.enabled");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_DEFAULT_BITLENGTH_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.key.default.bitlength" + "'", str0, "hadoop.security.key.default.bitlength");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_RPC_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.health-monitor.rpc-timeout.ms" + "'", str0, "ha.health-monitor.rpc-timeout.ms");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "ipc.client.connect.max.retries", "os.name", "hbase@HADOOP.APACHE.ORG", 134217728);
        boolean boolean6 = mutableQuantiles5.changed();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.jetty.logs.serve.aliases", "hbase@HADOOP.APACHE.ORG");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.FS_HOME_DIR_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/user" + "'", str0, "/user");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        boolean boolean1 = integerRanges0.isEmpty();
        int int2 = integerRanges0.getRangeStart();
        java.util.Iterator<java.lang.Integer> intItor3 = integerRanges0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intItor3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_GETSPACEUSED_JITTER_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_TCPNODELAY_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.SERVICE_SHUTDOWN_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30L + "'", long0 == 30L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SHELL_SAFELY_DELETE_LIMIT_NUM_FILES_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 100L + "'", long0 == 100L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.RPC_METRICS_PERCENTILES_INTERVALS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rpc.metrics.percentiles.intervals" + "'", str0, "rpc.metrics.percentiles.intervals");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_WARN_AFTER_MS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.groups.cache.warn.after.ms" + "'", str0, "hadoop.security.groups.cache.warn.after.ms");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.NET_DEPENDENCY_SCRIPT_FILE_NAME_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "net.topology.dependency.script.file.name" + "'", str0, "net.topology.dependency.script.file.name");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_IDLETHRESHOLD_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.idlethreshold" + "'", str0, "ipc.client.idlethreshold");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_DEFAULT_BITLENGTH_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SENSITIVE_CONFIG_KEYS_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secret$,password$,ssl.keystore.pass$,fs.s3.*[Ss]ecret.?[Kk]ey,fs.s3a.*.server-side-encryption.key,fs.azure\\.account.key.*,credential$,oauth.*secret,oauth.*password,oauth.*token,hadoop.security.sensitive-config-keys" + "'", str0, "secret$,password$,ssl.keystore.pass$,fs.s3.*[Ss]ecret.?[Kk]ey,fs.s3a.*.server-side-encryption.key,fs.azure\\.account.key.*,credential$,oauth.*secret,oauth.*password,oauth.*token,hadoop.security.sensitive-config-keys");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SHELL_SAFELY_DELETE_LIMIT_NUM_FILES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.shell.safely.delete.limit.num.files" + "'", str0, "hadoop.shell.safely.delete.limit.num.files");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SHELL_MISSING_DEFAULT_FS_WARNING_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.shell.missing.defaultFs.warning" + "'", str0, "hadoop.shell.missing.defaultFs.warning");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_ON_SOCKET_TIMEOUTS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 45 + "'", int0 == 45);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_MAXIMUM_DATA_LENGTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.maximum.data.length" + "'", str0, "ipc.maximum.data.length");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_TOKEN_SERVICE_USE_IP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.token.service.use_ip" + "'", str0, "hadoop.security.token.service.use_ip");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta3 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("UGI loginUser: {}", "ipc.server.log.slow.rpc", "callqueue.overflow.trigger.failover");
        java.lang.String str4 = deprecationDelta3.getCustomMessage();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "callqueue.overflow.trigger.failover" + "'", str4, "callqueue.overflow.trigger.failover");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_USER_GROUP_METRICS_PERCENTILES_INTERVALS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.user.group.metrics.percentiles.intervals" + "'", str0, "hadoop.user.group.metrics.percentiles.intervals");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.SEQ_IO_SORT_MB_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta2 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("fs.df.interval", "Invalid attribute value for hadoop.kerberos.min.seconds.before.relogin of");
        java.lang.String str3 = deprecationDelta2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fs.df.interval" + "'", str3, "fs.df.interval");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        boolean boolean0 = org.apache.hadoop.security.UserGroupInformation.isSecurityEnabled();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration(configuration0, "Unable to find JAAS classes:", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytab("identity-provider.impl", "loginUserFromKeyTab must be done first");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta3 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("There is no primary group for UGI", "Getting UGI from keytab....", "hadoop.shell.missing.defaultFs.warning");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_TRACING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.trace.protocol.acl" + "'", str0, "security.trace.protocol.acl");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_SIGNATURE_MAX_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_LZ4_BUFFERSIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.lz4.buffersize" + "'", str0, "io.compression.codec.lz4.buffersize");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_TIMEOUT_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20000 + "'", int0 == 20000);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_CONNECT_RETRY_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1000L + "'", long0 == 1000L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "hadoop.security.group.mapping", "Null real user", "fs.iostatistics.logging.level", 3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IOSTATISTICS_LOGGING_LEVEL_DEBUG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "debug" + "'", str0, "debug");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod3 = userGroupInformation2.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod4 = userGroupInformation2.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation2.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertTrue("'" + authenticationMethod3 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod3.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authenticationMethod4 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod4.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertNull(userGroupInformation5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_CONNECTION_IDLESCANINTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000 + "'", int0 == 10000);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_LOW_WATERMARK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.kms.client.encrypted.key.cache.low-watermark" + "'", str0, "hadoop.security.kms.client.encrypted.key.cache.low-watermark");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.SECURITY_INTER_DATANODE_PROTOCOL_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.inter.datanode.protocol.acl" + "'", str0, "security.inter.datanode.protocol.acl");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.addResource(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        java.util.List<java.lang.String> strList3 = userGroupInformation0.getGroups();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_RPC_CONNECT_MAX_RETRIES_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta2 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("seconds before. Last Login=", "ipc.client.connection.maxidletime");
        java.lang.String str3 = deprecationDelta2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "seconds before. Last Login=" + "'", str3, "seconds before. Last Login=");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_HTTP_AUTHENTICATION_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.http.authentication.type" + "'", str0, "hadoop.http.authentication.type");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials2 = userGroupInformation0.getCredentials();
        java.lang.String str3 = userGroupInformation0.getUserName();
        java.lang.String[] strArray4 = userGroupInformation0.getGroupNames();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation0.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(credentials2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anonymous" + "'", str3, "anonymous");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(userGroupInformation5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SHELL_MISSING_DEFAULT_FS_WARNING_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_ZSTD_BUFFER_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.zstd.buffersize" + "'", str0, "io.compression.codec.zstd.buffersize");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.apache.hadoop.fs.CommonConfigurationKeysPublic commonConfigurationKeysPublic0 = new org.apache.hadoop.fs.CommonConfigurationKeysPublic();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        int int1 = integerRanges0.getRangeStart();
        boolean boolean3 = integerRanges0.isIncluded(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_IMPERSONATION_PROVIDER_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.impersonation.provider.class" + "'", str0, "hadoop.security.impersonation.provider.class");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_CLIENT_FALLBACK_TO_SIMPLE_AUTH_ALLOWED_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.fallback-to-simple-auth-allowed" + "'", str0, "ipc.client.fallback-to-simple-auth-allowed");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_MAP_INDEX_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_DEFAULT_CIPHER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.key.default.cipher" + "'", str0, "hadoop.security.key.default.cipher");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
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
        configuration1.setLong("io.serializations", (long) 1);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(userGroupInformation19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anonymous" + "'", str20, "anonymous");
        org.junit.Assert.assertNotNull(credentials21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anonymous" + "'", str22, "anonymous");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_TOKENS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.tokens" + "'", str0, "hadoop.tokens");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_FS_OUTPUT_BUFFER_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 262144 + "'", int0 == 262144);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.apache.hadoop.security.UserGroupInformation.setShouldRenewImmediatelyForTests(true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("ipc.client.connect.max.retries");
        org.apache.hadoop.security.token.TokenIdentifier tokenIdentifier2 = null;
        boolean boolean3 = userGroupInformation1.addTokenIdentifier(tokenIdentifier2);
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        org.apache.hadoop.fs.Path path7 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.addResource(path7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str2 = userGroupInformation1.getPrimaryGroupName();
        java.util.List<java.lang.String> strList3 = userGroupInformation1.getGroups();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str6 = userGroupInformation5.getPrimaryGroupName();
        userGroupInformation5.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation5);
        java.lang.String[] strArray12 = new java.lang.String[] { "fs.file.impl", "Warning, no kerberos ticket found while attempting to renew ticket", "security.client.protocol.acl" };
        org.apache.hadoop.security.UserGroupInformation userGroupInformation13 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("com.ibm.security.auth.module.JAASLoginModule", userGroupInformation5, strArray12);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation14 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("hadoop.security.dns.interface", userGroupInformation1, strArray12);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation15 = userGroupInformation14.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anonymous" + "'", str2, "anonymous");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(userGroupInformation13);
        org.junit.Assert.assertNotNull(userGroupInformation14);
        org.junit.Assert.assertNotNull(userGroupInformation15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryItor2 = configuration1.iterator();
        org.junit.Assert.assertNotNull(strEntryItor2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation0);
        userGroupInformation0.forceReloginFromKeytab();
        java.util.Set<java.lang.String> strSet5 = userGroupInformation0.getGroupsSet();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        float float0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_LOW_WATERMARK_DEFAULT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.3f + "'", float0 == 0.3f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_FTP_HOST_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.ftp.host" + "'", str0, "fs.ftp.host");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.util.Set<java.lang.String> strSet2 = configuration1.getFinalParameters();
        org.apache.hadoop.conf.StorageUnit storageUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = configuration1.getStorageSize("security.qjournal.service.protocol.acl", (double) 3, storageUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Conversion unit cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_HM_SLEEP_AFTER_DISCONNECT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.health-monitor.sleep-after-disconnect.ms" + "'", str0, "ha.health-monitor.sleep-after-disconnect.ms");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.RPC_METRICS_QUANTILE_ENABLE_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        java.lang.Class<? extends org.apache.hadoop.net.DomainNameResolver> wildcardClass0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_DOMAINNAME_RESOLVER_IMPL_DEFAULT;
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytab("hadoop.security.dns.log-slow-lookups.enabled", "fs.client.resolve.remote.symlinks");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_NEW_ACTIVE_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.failover-controller.new-active.rpc-timeout.ms" + "'", str0, "ha.failover-controller.new-active.rpc-timeout.ms");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule0 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        boolean boolean1 = hadoopLoginModule0.logout();
        boolean boolean2 = hadoopLoginModule0.login();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        java.io.DataInput dataInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.readFields(dataInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
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
        java.io.InputStream inputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.addResource(inputStream25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(userGroupInformation19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anonymous" + "'", str20, "anonymous");
        org.junit.Assert.assertNotNull(credentials21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anonymous" + "'", str22, "anonymous");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SECURE_RANDOM_DEVICE_FILE_PATH_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/dev/urandom" + "'", str0, "/dev/urandom");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta3 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("net.topology.configured.node.mapping", "Null user", "SHA1PRNG");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.apache.hadoop.conf.Configuration.addDeprecation("ha.health-monitor.sleep-after-disconnect.ms", "scheduler.impl", "ipc.client.rpc-timeout.ms");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_LZ4_USELZ4HC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.lz4.use.lz4hc" + "'", str0, "io.compression.codec.lz4.use.lz4hc");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_UID_NAME_CACHE_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.uid.cache.secs" + "'", str0, "hadoop.security.uid.cache.secs");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.util.Set<java.lang.String> strSet2 = configuration1.getFinalParameters();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.conf.Configuration.dumpConfiguration(configuration1, ")", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property ) not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.lang.String str0 = org.apache.hadoop.security.UserGroupInformation.HADOOP_TOKEN_FILE_LOCATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HADOOP_TOKEN_FILE_LOCATION" + "'", str0, "HADOOP_TOKEN_FILE_LOCATION");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.setTimeDuration("security.interqjournal.service.protocol.acl", 0L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.slf4j.Logger logger0 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str3 = userGroupInformation2.getPrimaryGroupName();
        userGroupInformation2.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation2);
        org.apache.hadoop.security.Credentials credentials6 = userGroupInformation2.getCredentials();
        java.util.Set<java.lang.String> strSet7 = userGroupInformation2.getGroupsSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation.logUserInfo(logger0, "AES/CTR/NoPadding", userGroupInformation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anonymous" + "'", str3, "anonymous");
        org.junit.Assert.assertNotNull(credentials6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_DOMAINNAME_RESOLVER_IMPL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.domainname.resolver.impl" + "'", str0, "hadoop.domainname.resolver.impl");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.TFILE_FS_INPUT_BUFFER_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 262144 + "'", int0 == 262144);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_EXPIRY_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43200000 + "'", int0 == 43200000);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String str1 = org.apache.hadoop.security.UserGroupInformation.trimLoginMethod("ipc.maximum.data.length");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ipc.maximum.data.length" + "'", str1, "ipc.maximum.data.length");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_NUM_REFILL_THREADS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_MAP_INDEX_INTERVAL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.map.index.interval" + "'", str0, "io.map.index.interval");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_TAGS_CUSTOM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.tags.custom" + "'", str0, "hadoop.tags.custom");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.String str0 = org.apache.hadoop.security.UserGroupInformation.HADOOP_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HADOOP_TOKEN" + "'", str0, "HADOOP_TOKEN");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SECURE_RANDOM_DEVICE_FILE_PATH_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.random.device.file.path" + "'", str0, "hadoop.security.random.device.file.path");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        org.apache.hadoop.fs.Path path12 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.addResource(path12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        configuration1.setDeprecatedProperties();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = configuration1.getPropsWithPrefix("Token file {} does not exist");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod9 = org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.TOKEN;
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod10 = configuration1.getEnum("(auth:", authenticationMethod9);
        java.net.InetSocketAddress inetSocketAddress15 = configuration1.getSocketAddr("hadoop.zk.timeout-ms", "ha.health-monitor.connect-retry-interval.ms", "latency", 4000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + authenticationMethod9 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.TOKEN + "'", authenticationMethod9.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.TOKEN));
        org.junit.Assert.assertTrue("'" + authenticationMethod10 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.TOKEN + "'", authenticationMethod10.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.TOKEN));
        org.junit.Assert.assertNotNull(inetSocketAddress15);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.NET_TOPOLOGY_SCRIPT_NUMBER_ARGS_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_NUM_REFILL_THREADS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.kms.client.encrypted.key.cache.num.refill.threads" + "'", str0, "hadoop.security.kms.client.encrypted.key.cache.num.refill.threads");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod3 = userGroupInformation2.getRealAuthenticationMethod();
        java.util.Collection<org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier>> wildcardTokenCollection4 = userGroupInformation2.getTokens();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertTrue("'" + authenticationMethod3 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod3.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertNotNull(wildcardTokenCollection4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        java.lang.String str1 = org.apache.hadoop.security.UserGroupInformation.trimLoginMethod("fs.client.resolve.topology.enabled");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fs.client.resolve.topology.enabled" + "'", str1, "fs.client.resolve.topology.enabled");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta2 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("fs.du.interval", "hadoop.http.authentication.type");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_CIPHER_SUITE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.crypto.cipher.suite" + "'", str0, "hadoop.security.crypto.cipher.suite");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IPC_SERVER_RPC_READ_THREADS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.read.threadpool.size" + "'", str0, "ipc.server.read.threadpool.size");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        java.util.Iterator<java.lang.Integer> intItor1 = integerRanges0.iterator();
        java.util.Iterator<java.lang.Integer> intItor2 = integerRanges0.iterator();
        org.junit.Assert.assertNotNull(intItor1);
        org.junit.Assert.assertNotNull(intItor2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = configuration1.getStrings("hi!");
        char[] charArray5 = configuration1.getPassword("ha.health-monitor.connect-retry-interval.ms");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.writeXml("security.refresh.generic.protocol.acl", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property security.refresh.generic.protocol.acl not found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "ipc.client.connect.max.retries", "os.name", "hbase@HADOOP.APACHE.ORG", 134217728);
        boolean boolean6 = mutableQuantiles5.changed();
        int int7 = mutableQuantiles5.getInterval();
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 134217728 + "'", int7 == 134217728);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        org.apache.hadoop.conf.Configuration configuration2 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str5 = userGroupInformation4.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials6 = userGroupInformation4.getCredentials();
        java.lang.String str7 = userGroupInformation4.getUserName();
        java.lang.String[] strArray8 = userGroupInformation4.getGroupNames();
        java.lang.String[] strArray9 = configuration2.getTrimmedStrings("io.sort.mb", strArray8);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation10 = org.apache.hadoop.security.UserGroupInformation.createUserForTesting(",", strArray8);
        java.util.Set<org.apache.hadoop.security.token.TokenIdentifier> tokenIdentifierSet11 = userGroupInformation10.getTokenIdentifiers();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation12 = userGroupInformation10.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "anonymous" + "'", str5, "anonymous");
        org.junit.Assert.assertNotNull(credentials6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anonymous" + "'", str7, "anonymous");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(userGroupInformation10);
        org.junit.Assert.assertNotNull(tokenIdentifierSet11);
        org.junit.Assert.assertNull(userGroupInformation12);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.lang.ClassLoader classLoader12 = null;
        configuration1.setClassLoader(classLoader12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HA_FC_GRACEFUL_FENCE_TIMEOUT_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ha.failover-controller.graceful-fence.rpc-timeout.ms" + "'", str0, "ha.failover-controller.graceful-fence.rpc-timeout.ms");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODECS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codecs" + "'", str0, "io.compression.codecs");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CREDENTIAL_PROVIDER_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.credential.provider.path" + "'", str0, "hadoop.security.credential.provider.path");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = configuration1.getStrings("hi!");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation7 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod8 = userGroupInformation7.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod9 = configuration1.getEnum("security.router.admin.protocol.acl", authenticationMethod8);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(userGroupInformation7);
        org.junit.Assert.assertTrue("'" + authenticationMethod8 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod8.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authenticationMethod9 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod9.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CUSTOM_TAGS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.custom.tags" + "'", str0, "hadoop.custom.tags");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_TOKEN_FILES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.token.files" + "'", str0, "hadoop.token.files");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.writeXml(outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_GETSPACEUSED_JITTER_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fs.getspaceused.jitterMillis" + "'", str0, "fs.getspaceused.jitterMillis");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.ZK_ACL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.zk.acl" + "'", str0, "hadoop.zk.acl");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_CLIENT_LOW_LATENCY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.client.low-latency" + "'", str0, "ipc.client.low-latency");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_USER_GROUP_STATIC_OVERRIDES_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dr.who=;" + "'", str0, "dr.who=;");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod3 = userGroupInformation2.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod4 = userGroupInformation2.getRealAuthenticationMethod();
        java.util.Collection<org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier>> wildcardTokenCollection5 = userGroupInformation2.getTokens();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertTrue("'" + authenticationMethod3 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod3.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authenticationMethod4 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod4.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertNotNull(wildcardTokenCollection5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        int int0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.KMS_CLIENT_ENC_KEY_CACHE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_DNS_LOG_SLOW_LOOKUPS_THRESHOLD_MS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.dns.log-slow-lookups.threshold.ms" + "'", str0, "hadoop.security.dns.log-slow-lookups.threshold.ms");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        boolean boolean1 = org.apache.hadoop.conf.Configuration.isDeprecated("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_POLICY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "security.refresh.policy.protocol.acl" + "'", str0, "security.refresh.policy.protocol.acl");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SASL_PROPS_RESOLVER_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.saslproperties.resolver.class" + "'", str0, "hadoop.security.saslproperties.resolver.class");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DF_INTERVAL_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 60000L + "'", long0 == 60000L);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        java.net.InetSocketAddress inetSocketAddress8 = configuration1.getSocketAddr("hadoop.security.uid.cache.secs", "seq.io.sort.factor", 60);
        configuration1.addResource("hadoop.security.group.mapping");
        org.apache.hadoop.conf.StorageUnit storageUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = configuration1.getStorageSize("", (double) 10L, storageUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Conversion unit cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod0 = org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE;
        org.junit.Assert.assertTrue("'" + authenticationMethod0 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod0.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_DEFAULT_CIPHER_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AES/CTR/NoPadding" + "'", str0, "AES/CTR/NoPadding");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("hadoop.security.kms.client.failover.max.retries", "Initiating re-login for {}");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.lang.String[] strArray13 = configuration1.getTrimmedStrings("Groups:");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.Path path16 = configuration1.getLocalPath("hadoop.security.group.mapping", "security.trace.protocol.acl");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No valid local directories in property: hadoop.security.group.mapping");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule0 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        boolean boolean1 = hadoopLoginModule0.login();
        boolean boolean2 = hadoopLoginModule0.login();
        boolean boolean3 = hadoopLoginModule0.logout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "ipc.client.connect.max.retries", "os.name", "hbase@HADOOP.APACHE.ORG", 134217728);
        boolean boolean6 = mutableQuantiles5.changed();
        int int7 = mutableQuantiles5.getInterval();
        mutableQuantiles5.add(1000L);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 134217728 + "'", int7 == 134217728);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
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
        org.apache.hadoop.security.UserGroupInformation userGroupInformation21 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod22 = userGroupInformation21.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod23 = userGroupInformation21.getRealAuthenticationMethod();
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod24 = authenticationMethod23.getAuthMethod();
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod25 = configuration1.getEnum("Logout successful for user", authMethod24);
        int int26 = configuration1.size();
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(userGroupInformation21);
        org.junit.Assert.assertTrue("'" + authenticationMethod22 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod22.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authenticationMethod23 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod23.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authMethod24 + "' != '" + org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE + "'", authMethod24.equals(org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authMethod25 + "' != '" + org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE + "'", authMethod25.equals(org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod1 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("hadoop.security.authorization", authMethod1);
        userGroupInformation2.logoutUserFromKeytab();
        java.util.Collection<org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier>> wildcardTokenCollection4 = userGroupInformation2.getTokens();
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(wildcardTokenCollection4);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.lang.String str13 = configuration1.getTrimmed("hadoop.security.kms.client.failover.max.retries");
        configuration1.setQuietMode(false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        long long0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_LOCAL_BLOCK_SIZE_DEFAULT;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 33554432L + "'", long0 == 33554432L);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_TOKEN_SERVICE_USE_IP_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        org.slf4j.Logger logger0 = null;
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str3 = userGroupInformation2.getPrimaryGroupName();
        userGroupInformation2.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation2);
        userGroupInformation2.logoutUserFromKeytab();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.UserGroupInformation.logUserInfo(logger0, "ha.health-monitor.connect-retry-interval.ms", userGroupInformation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anonymous" + "'", str3, "anonymous");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        int int1 = integerRanges0.getRangeStart();
        boolean boolean2 = integerRanges0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getBestUGI("+token: {} -> {}", "hbase");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation4 = org.apache.hadoop.security.UserGroupInformation.createProxyUser(")", userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertNotNull(userGroupInformation4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        org.apache.hadoop.conf.Configuration.DeprecationDelta deprecationDelta3 = new org.apache.hadoop.conf.Configuration.DeprecationDelta("UGI loginUser: {}", "ipc.server.log.slow.rpc", "callqueue.overflow.trigger.failover");
        java.lang.String str4 = deprecationDelta3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UGI loginUser: {}" + "'", str4, "UGI loginUser: {}");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        configuration1.setIfUnset("Login", "hbase@HADOOP.APACHE.ORG");
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUPS_CACHE_BACKGROUND_RELOAD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.security.groups.cache.background.reload" + "'", str0, "hadoop.security.groups.cache.background.reload");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        boolean boolean0 = org.apache.hadoop.fs.CommonConfigurationKeys.HADOOP_SECURITY_DNS_LOG_SLOW_LOOKUPS_ENABLED_DEFAULT;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        java.net.InetSocketAddress inetSocketAddress8 = configuration1.getSocketAddr("hadoop.security.uid.cache.secs", "seq.io.sort.factor", 60);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress12 = configuration1.getSocketAddr("", "* rw", 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Does not contain a valid host:port authority: * rw (configuration property '')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        boolean boolean3 = userGroupInformation0.hasKerberosCredentials();
        org.apache.hadoop.security.UserGroupInformation.setLoginUser(userGroupInformation0);
        java.util.Collection<org.apache.hadoop.security.token.Token<? extends org.apache.hadoop.security.token.TokenIdentifier>> wildcardTokenCollection5 = userGroupInformation0.getTokens();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardTokenCollection5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.lang.String str13 = configuration1.getTrimmed("hadoop.security.kms.client.failover.max.retries");
        configuration1.setLong("hadoop.zk.auth", (long) (short) -1);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.writeXml(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
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
        org.apache.hadoop.security.UserGroupInformation userGroupInformation21 = org.apache.hadoop.security.UserGroupInformation.getUGIFromTicketCache("Token file {} does not exist", "Keytab");
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod22 = userGroupInformation21.getRealAuthenticationMethod();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod23 = userGroupInformation21.getRealAuthenticationMethod();
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod24 = authenticationMethod23.getAuthMethod();
        org.apache.hadoop.security.SaslRpcServer.AuthMethod authMethod25 = configuration1.getEnum("Logout successful for user", authMethod24);
        org.apache.hadoop.conf.Configuration configuration29 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation31 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str32 = userGroupInformation31.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials33 = userGroupInformation31.getCredentials();
        java.lang.String str34 = userGroupInformation31.getUserName();
        java.lang.String[] strArray35 = userGroupInformation31.getGroupNames();
        java.lang.String[] strArray36 = configuration29.getTrimmedStrings("io.sort.mb", strArray35);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation37 = org.apache.hadoop.security.UserGroupInformation.createUserForTesting(",", strArray35);
        configuration1.setStrings("scheduler.priority.levels", strArray35);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(userGroupInformation21);
        org.junit.Assert.assertTrue("'" + authenticationMethod22 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod22.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authenticationMethod23 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod23.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authMethod24 + "' != '" + org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE + "'", authMethod24.equals(org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE));
        org.junit.Assert.assertTrue("'" + authMethod25 + "' != '" + org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE + "'", authMethod25.equals(org.apache.hadoop.security.SaslRpcServer.AuthMethod.SIMPLE));
        org.junit.Assert.assertNotNull(userGroupInformation31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anonymous" + "'", str32, "anonymous");
        org.junit.Assert.assertNotNull(credentials33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anonymous" + "'", str34, "anonymous");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(userGroupInformation37);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
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
        boolean boolean26 = configuration1.onlyKeyExists("org.apache.hadoop.crypto.OpensslSm4CtrCryptoCodec,org.apache.hadoop.crypto.JceSm4CtrCryptoCodec");
        java.io.Reader reader28 = configuration1.getConfResourceAsReader("ipc.server.max.response.size");
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(userGroupInformation19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anonymous" + "'", str20, "anonymous");
        org.junit.Assert.assertNotNull(credentials21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anonymous" + "'", str22, "anonymous");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(reader28);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        boolean boolean3 = userGroupInformation0.shouldRelogin();
        java.util.Set<org.apache.hadoop.security.token.TokenIdentifier> tokenIdentifierSet4 = userGroupInformation0.getTokenIdentifiers();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str6 = userGroupInformation5.getPrimaryGroupName();
        userGroupInformation5.checkTGTAndReloginFromKeytab();
        boolean boolean8 = userGroupInformation5.hasKerberosCredentials();
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod9 = userGroupInformation5.getRealAuthenticationMethod();
        userGroupInformation0.setAuthenticationMethod(authenticationMethod9);
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokenIdentifierSet4);
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + authenticationMethod9 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE + "'", authenticationMethod9.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.SIMPLE));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.lang.String str13 = configuration1.getTrimmed("hadoop.security.kms.client.failover.max.retries");
        configuration1.setLong("hadoop.zk.auth", (long) (short) -1);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration1.writeXml(writer17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: javax.xml.transform.TransformerException: Result object passed to ''{0}'' is invalid.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
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
        configuration1.set("hadoop.http.metrics.enabled", "destroy ticket failed", "warn");
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule0 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        javax.security.auth.Subject subject1 = null;
        javax.security.auth.callback.CallbackHandler callbackHandler2 = null;
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule3 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        boolean boolean4 = hadoopLoginModule3.login();
        javax.security.auth.Subject subject5 = null;
        javax.security.auth.callback.CallbackHandler callbackHandler6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.apache.hadoop.conf.Configuration configuration9 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        configuration9.setStrings("hadoop.prometheus.endpoint.enabled", strArray11);
        configuration9.setDeprecatedProperties();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = configuration9.getPropsWithPrefix("Token file {} does not exist");
        hadoopLoginModule3.initialize(subject5, callbackHandler6, strMap7, strMap15);
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule17 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        boolean boolean18 = hadoopLoginModule17.login();
        javax.security.auth.Subject subject19 = null;
        javax.security.auth.callback.CallbackHandler callbackHandler20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.apache.hadoop.conf.Configuration configuration23 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        configuration23.setStrings("hadoop.prometheus.endpoint.enabled", strArray25);
        configuration23.setDeprecatedProperties();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = configuration23.getPropsWithPrefix("Token file {} does not exist");
        hadoopLoginModule17.initialize(subject19, callbackHandler20, strMap21, strMap29);
        hadoopLoginModule0.initialize(subject1, callbackHandler2, strMap7, strMap21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        java.util.Iterator<java.lang.Integer> intItor1 = integerRanges0.iterator();
        java.util.Spliterator<java.lang.Integer> intSpliterator2 = integerRanges0.spliterator();
        java.util.Iterator<java.lang.Integer> intItor3 = integerRanges0.iterator();
        int int4 = integerRanges0.getRangeStart();
        boolean boolean6 = integerRanges0.isIncluded((int) ' ');
        org.junit.Assert.assertNotNull(intItor1);
        org.junit.Assert.assertNotNull(intSpliterator2);
        org.junit.Assert.assertNotNull(intItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.DFS_CLIENT_IGNORE_NAMENODE_DEFAULT_KMS_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dfs.client.ignore.namenode.default.kms.uri" + "'", str0, "dfs.client.ignore.namenode.default.kms.uri");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeys.IO_COMPRESSION_CODEC_ZSTD_LEVEL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.compression.codec.zstd.level" + "'", str0, "io.compression.codec.zstd.level");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        org.apache.hadoop.conf.Configuration.addDeprecation("hadoop.user.group.static.mapping.overrides", "Subject does not contain a valid User", ",");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        org.apache.hadoop.conf.Configuration.setRestrictSystemPropertiesDefault(true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials2 = userGroupInformation0.getCredentials();
        java.lang.String str3 = userGroupInformation0.getUserName();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation0);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str6 = userGroupInformation5.getPrimaryGroupName();
        userGroupInformation5.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation5);
        org.apache.hadoop.security.Credentials credentials9 = userGroupInformation5.getCredentials();
        userGroupInformation0.addCredentials(credentials9);
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNotNull(credentials2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anonymous" + "'", str3, "anonymous");
        org.junit.Assert.assertNotNull(userGroupInformation5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(credentials9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = configuration1.getStrings("hi!");
        org.apache.hadoop.conf.StorageUnit storageUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = configuration1.getStorageSize("", "hadoop.shell.safely.delete.limit.num.files", storageUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Key cannot be blank.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_SKIP_CHECKSUM_ERRORS_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.skip.checksum.errors" + "'", str0, "io.skip.checksum.errors");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation.logAllUserInfo(userGroupInformation0);
        userGroupInformation0.reloginFromKeytab();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation5 = userGroupInformation0.getRealUser();
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertNull(userGroupInformation5);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        org.apache.hadoop.conf.Configuration.setRestrictSystemPropertiesDefault(false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.IPC_SERVER_LISTEN_QUEUE_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ipc.server.listen.queue.size" + "'", str0, "ipc.server.listen.queue.size");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        java.lang.String str6 = userGroupInformation3.getUserName();
        java.lang.String[] strArray7 = userGroupInformation3.getGroupNames();
        java.lang.String[] strArray8 = configuration1.getTrimmedStrings("io.sort.mb", strArray7);
        java.util.regex.Pattern pattern10 = null;
        java.util.regex.Pattern pattern11 = configuration1.getPattern("hadoop.security.groups.cache.warn.after.ms", pattern10);
        int[] intArray13 = configuration1.getInts("");
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "anonymous" + "'", str6, "anonymous");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(pattern11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str2 = userGroupInformation1.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials3 = userGroupInformation1.getCredentials();
        java.lang.String str4 = userGroupInformation1.getShortUserName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hadoop.security.service.user.name.key", "hadoop.zk.retry-interval-ms", "tfile.io.chunk.size", "hadoop.http.metrics.enabled", "PrivilegedActionException as: {}", "security.get.user.mappings.protocol.acl" };
        org.apache.hadoop.security.UserGroupInformation userGroupInformation12 = org.apache.hadoop.security.UserGroupInformation.createProxyUserForTesting("callqueue.capacity.weights", userGroupInformation1, strArray11);
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anonymous" + "'", str2, "anonymous");
        org.junit.Assert.assertNotNull(credentials3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(userGroupInformation12);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str1 = userGroupInformation0.getPrimaryGroupName();
        userGroupInformation0.checkTGTAndReloginFromKeytab();
        boolean boolean3 = userGroupInformation0.hasKerberosCredentials();
        org.apache.hadoop.security.UserGroupInformation.setLoginUser(userGroupInformation0);
        org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod authenticationMethod5 = org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY;
        userGroupInformation0.setAuthenticationMethod(authenticationMethod5);
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anonymous" + "'", str1, "anonymous");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + authenticationMethod5 + "' != '" + org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY + "'", authenticationMethod5.equals(org.apache.hadoop.security.UserGroupInformation.AuthenticationMethod.PROXY));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.loginUserFromKeytabAndReturnUGI("Unable to find JAAS classes:", "io.compression.codec.zstd.buffersize");
        org.junit.Assert.assertNotNull(userGroupInformation2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        java.lang.String str0 = org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_CALLER_CONTEXT_SIGNATURE_MAX_SIZE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.caller.context.signature.max.size" + "'", str0, "hadoop.caller.context.signature.max.size");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        org.apache.hadoop.conf.Configuration.IntegerRanges integerRanges0 = new org.apache.hadoop.conf.Configuration.IntegerRanges();
        boolean boolean1 = integerRanges0.isEmpty();
        int int2 = integerRanges0.getRangeStart();
        boolean boolean3 = integerRanges0.isEmpty();
        java.util.Iterator<java.lang.Integer> intItor4 = integerRanges0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intItor4);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        char[] charArray11 = configuration1.getPasswordFromCredentialProviders("fs.trash.checkpoint.interval");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule hadoopLoginModule0 = new org.apache.hadoop.security.UserGroupInformation.HadoopLoginModule();
        boolean boolean1 = hadoopLoginModule0.abort();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        org.apache.hadoop.conf.Configuration configuration1 = new org.apache.hadoop.conf.Configuration(false);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        configuration1.setStrings("hadoop.prometheus.endpoint.enabled", strArray3);
        int[] intArray6 = configuration1.getInts("fs.client.resolve.remote.symlinks");
        configuration1.setLong("]:", (long) 0);
        java.net.URL uRL11 = configuration1.getResource(")");
        java.net.URL uRL13 = configuration1.getResource("Initiating re-login for {}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        org.apache.hadoop.metrics2.lib.MutableQuantiles mutableQuantiles5 = new org.apache.hadoop.metrics2.lib.MutableQuantiles("loginUserFromKeyTab must be done first", "ipc.client.connect.max.retries", "os.name", "hbase@HADOOP.APACHE.ORG", 134217728);
        boolean boolean6 = mutableQuantiles5.changed();
        mutableQuantiles5.add((long) 128);
        org.apache.hadoop.metrics2.MetricsRecordBuilder metricsRecordBuilder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableQuantiles5.snapshot(metricsRecordBuilder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation1 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("ipc.client.connect.max.retries");
        java.util.List<java.lang.String> strList2 = userGroupInformation1.getGroups();
        org.junit.Assert.assertNotNull(userGroupInformation1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation0 = org.apache.hadoop.security.UserGroupInformation.getLoginUser();
        org.apache.hadoop.security.UserGroupInformation userGroupInformation2 = org.apache.hadoop.security.UserGroupInformation.createRemoteUser("ipc.client.connect.max.retries");
        org.apache.hadoop.security.UserGroupInformation userGroupInformation3 = org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
        java.lang.String str4 = userGroupInformation3.getPrimaryGroupName();
        org.apache.hadoop.security.Credentials credentials5 = userGroupInformation3.getCredentials();
        org.apache.hadoop.security.Credentials credentials6 = userGroupInformation3.getCredentials();
        userGroupInformation2.addCredentials(credentials6);
        userGroupInformation0.addCredentials(credentials6);
        org.junit.Assert.assertNotNull(userGroupInformation0);
        org.junit.Assert.assertNotNull(userGroupInformation2);
        org.junit.Assert.assertNotNull(userGroupInformation3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anonymous" + "'", str4, "anonymous");
        org.junit.Assert.assertNotNull(credentials5);
        org.junit.Assert.assertNotNull(credentials6);
    }
}

