package com.lxf.cglib.dto;

/**
 * 没有实现接口，需要CGlib动态代理的目标类
 * Created by Liaoxf on 2017-08-01 14:54.
 */
public class TargetObject {

    public String method1(String paramName) {
        return paramName;
    }

    public int method2(int count) {
        return count;
    }

    public int method3(int count) {
        return count;
    }

    @Override
    public String toString() {
        return "TargetObject [" + getClass() + "]";
    }
}
