package com.lxf.cglib.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Liaoxf on 2017-08-01 14:55.
 */
public class TargetInterceptor implements MethodInterceptor {
    /**
     * 重写方法拦截在方法前和方法后加入业务
     * Object obj为目标对象 由CGLib动态生成的代理类实例
     * Method method为目标方法
     * Object[] params 为参数，
     * MethodProxy proxy CGlib方法代理对象
     */
    public Object intercept(Object obj, Method method, Object[] params, MethodProxy proxy) throws Throwable {
        System.out.println("----------调用方法前-----------");
        Object result = proxy.invokeSuper(obj, params);
        System.out.println("----------调用方法后-----------");
        return result;
    }
}
