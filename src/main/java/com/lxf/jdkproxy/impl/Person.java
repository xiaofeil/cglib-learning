package com.lxf.jdkproxy.impl;

import com.lxf.jdkproxy.Animal;

/**
 * Created by Liaoxf on 2017-08-01 20:53.
 */
public class Person implements Animal {
    public String setType(String type) {
        System.out.println("Person set type is:" + type);
        return type;
    }

    public Object behavior(Object behavior) {
        System.out.println("Person set behavior is:" + behavior);
        return behavior;
    }
}
