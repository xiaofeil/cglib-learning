package com.lxf.cglib;

import com.lxf.cglib.dto.TargetObject;
import com.lxf.cglib.filter.TargetMethodCallbackFilter;
import com.lxf.cglib.fixedvalue.TargetResultFixed;
import com.lxf.cglib.interceptor.TargetInterceptor;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by Liaoxf on 2017-08-01 15:14.
 */
public class CglibCallbackFilterTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();

        /**
         * (1)callback1：方法拦截器
         (2)NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
         (3)FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
         */
        Callback noopCb = NoOp.INSTANCE;
        Callback callback1 = new TargetInterceptor();
        Callback fixedValue = new TargetResultFixed();
        Callback[] cbarray = new Callback[]{callback1, noopCb, fixedValue, callback1};
        enhancer.setCallbacks(cbarray);
        enhancer.setCallbackFilter(callbackFilter);
        TargetObject targetObject2 = (TargetObject) enhancer.create();
        System.out.println(targetObject2);
        System.out.println(targetObject2.method1("mmm1"));
        System.out.println(targetObject2.method2(100));
        System.out.println(targetObject2.method3(101));
        System.out.println(targetObject2.method3(200));
    }
}
