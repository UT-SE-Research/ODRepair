package com.alibaba.json.bvt.serializer;

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
        com.alibaba.fastjson.parser.DefaultJSONParser defaultJSONParser1 = new com.alibaba.fastjson.parser.DefaultJSONParser(":true");
        com.alibaba.fastjson.parser.SymbolTable symbolTable2 = defaultJSONParser1.symbolTable;
        defaultJSONParser1.resolveStatus = (byte) -1;
        defaultJSONParser1.setDateFormat("{fastjson.serializer_buffer_threshold:{}}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.alibaba.fastjson.parser.ParseContext parseContext7 = defaultJSONParser1.getOwnerContext();
    }
}

