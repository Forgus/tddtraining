package com.forgus.training.args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 孤峰
 * @since 2020/01/07
 */
public class SchemaTest {

    @Test
    public void test_boolean() {
        Schema schema = new Schema("l:boolean");
        assertEquals(Boolean.class,schema.getType());
        assertEquals(Boolean.FALSE,schema.getValue());
    }
    
    @Test
    public void test_integer() {
        Schema schema = new Schema("p:integer");
        assertEquals(Integer.class,schema.getType());
        assertEquals(0,schema.getValue());
    }

    @Test
    public void test_string() {
        Schema schema = new Schema("d:string");
        assertEquals(String.class,schema.getType());
        assertEquals("",schema.getValue());
    }
}
