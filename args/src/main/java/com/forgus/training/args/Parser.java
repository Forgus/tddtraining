package com.forgus.training.args;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 孤峰
 * @since 2020/01/07
 */
public class Parser {

    private Set<Schema> schemas;
    private Map<String,Object> flagValueMap;
    private Map<String,Schema> flagSchemaMap;

    public Parser(String... schemaStrs) {
        schemas = new HashSet<Schema>();
        flagValueMap = new HashMap<String, Object>();
        flagSchemaMap = new HashMap<String, Schema>();
        for (String schemaStr: schemaStrs) {
            Schema schema = new Schema(schemaStr);
            schemas.add(schema);
            flagValueMap.put(schema.getFlag(),schema.getValue());
            flagSchemaMap.put(schema.getFlag(),schema);
        }
    }

    public void input(String... argStrs) {
        for (String argStr : argStrs) {
            String[] split = argStr.split(" ");
            String flag = split[0];
            Schema schema = flagSchemaMap.get(flag);
            if(schema == null) {
                System.out.println("flag:"+ flag + " not support!");
                break;
            }
            if("l".equals(flag)) {
                flagValueMap.put(flag,Boolean.TRUE);
            }else {
                String value = split[1];
                flagValueMap.put(flag,convert(value,schema.getType()));
            }
        }
    }

    private Object convert(String value, String type) {
        if("integer".equals(type)) {
            return Integer.valueOf(value);
        }
        return value;
    }

    public Object getValue(String flag) {
        return flagValueMap.get(flag);
    }
}
