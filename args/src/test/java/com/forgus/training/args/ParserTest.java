package com.forgus.training.args;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 孤峰
 * @since 2020/01/07
 */
public class ParserTest {

    private Parser parser;

    @BeforeEach
    public void before() {
        //指定参数结构
        parser = new Parser("l:boolean", "p:integer","d:string");
    }

    @Test
    public void should_return_input_value() {
        //接收参数列表
        parser.input("l","p 8080","d /usr/logs");
        //断言预期值
        assertEquals(Boolean.TRUE,parser.getValue("l"));
        assertEquals(8080,parser.getValue("p"));
        assertEquals("/usr/logs",parser.getValue("d"));
    }

    @Test
    public void should_return_default_value() {
        assertEquals(Boolean.FALSE,parser.getValue("l"));
        assertEquals(0,parser.getValue("p"));
        assertEquals("",parser.getValue("d"));
    }

}
