package com.forgus.training.args;

/**
 * @author 孤峰
 * @since 2020/01/07
 */
public class Schema {

    private String flag;
    private String type;
    private Object value;

    public Schema(String schemaStr) {
        String[] split = schemaStr.split(":");
        this.flag = split[0];
        this.type = split[1];
        if("boolean".equals(type)) {
            this.value = Boolean.FALSE;
        }else if ("integer".equals(type)) {
            this.value = 0;
        }else if("string".equals(type)) {
            this.value = "";
        }
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public String getFlag() {
        return flag;
    }
}
