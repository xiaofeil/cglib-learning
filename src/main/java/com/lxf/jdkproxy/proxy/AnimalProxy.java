package com.lxf.jdkproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Liaoxf on 2017-08-01 20:53.
 */
public class AnimalProxy implements InvocationHandler {

    private Object object;

    private AnimalProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new AnimalProxy(object));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=========before proxy======");
        method.invoke(object, args);
        System.out.println("=========after proxy======");
        return null;
    }
}
