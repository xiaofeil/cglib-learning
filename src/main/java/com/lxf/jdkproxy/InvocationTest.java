package com.lxf.jdkproxy;

import com.lxf.jdkproxy.impl.Person;
import com.lxf.jdkproxy.proxy.AnimalProxy;

/**
 * Created by Liaoxf on 2017-08-01 20:55.
 */
public class InvocationTest {
    public static void main(String[] args) {
        try {
            Animal proxy = (Animal) AnimalProxy.newInstance(new Person());
            proxy.setType("person");
            proxy.behavior("run");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
