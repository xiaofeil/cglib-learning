package com.lxf.cglib.filter;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 回调方法过滤
 * Created by Liaoxf on 2017-08-01 15:10.
 */
public class TargetMethodCallbackFilter implements CallbackFilter {

    /**
     * @Author Liaoxf
     * @Date 2017-08-01 15:12
     * @param
     * @return  值为被代理类的各个方法在回调数组Callback[]中的位置索引
     */
    public int accept(Method method) {
        if (method.getName().equals("method1")) {
            System.out.println("filter method1 ==1");
            return 0; // 表示CglibCallbackFilterTest cbarray中的位置索引
        }
        if (method.getName().equals("method2")) {
            System.out.println("filter method2 ==2");
            return 1;
        }
        if (method.getName().equals("method3")) {
            System.out.println("filter method3 ==3");
            return 2;
        }
        return 0;
    }
}
