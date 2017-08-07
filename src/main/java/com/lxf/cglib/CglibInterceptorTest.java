package com.lxf.cglib;

import com.lxf.cglib.dto.TargetObject;
import com.lxf.cglib.interceptor.TargetInterceptor;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by Liaoxf on 2017-08-01 15:04.
 */
public class CglibInterceptorTest {
    public static void main(String[] args) {
        // Enhancer类是CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());
        TargetObject targetObject2 = (TargetObject) enhancer.create();
        System.out.println(targetObject2);
        System.out.println(targetObject2.method1("mmm1"));
        System.out.println(targetObject2.method2(100));
        System.out.println(targetObject2.method3(200));
    }
}
