package com.forgus.training.args;

/**
 * @author 孤峰
 * @since 2020/01/07
 */
public class Schema {

    private String flag;
    private Object type;
    private Object value;

    public Schema(String schemaStr) {
        String[] split = schemaStr.split(":");
        this.flag = split[0];
        String type = split[1];
        if("boolean".equals(type)) {
            this.type = Boolean.class;
            this.value = Boolean.FALSE;
        }else if ("integer".equals(type)) {
            this.type = Integer.class;
            this.value = 0;
        }else if("string".equals(type)) {
            this.type = String.class;
            this.value = "";
        }
    }

    public Object getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public String getFlag() {
        return flag;
    }
}
