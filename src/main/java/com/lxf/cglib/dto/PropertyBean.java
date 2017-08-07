package com.lxf.cglib.dto;

/**
 * Created by Liaoxf on 2017-08-01 16:33.
 */
public class PropertyBean {
    private String key;
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyBean [key=" + key + ", value=" + value + "]" + getClass();
    }
}
