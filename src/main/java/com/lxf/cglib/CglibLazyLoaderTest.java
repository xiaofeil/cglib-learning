package com.lxf.cglib;

import com.lxf.cglib.dto.LazyBean;
import com.lxf.cglib.dto.PropertyBean;
import com.lxf.cglib.dto.TargetObject;
import com.lxf.cglib.filter.TargetMethodCallbackFilter;
import com.lxf.cglib.fixedvalue.TargetResultFixed;
import com.lxf.cglib.interceptor.TargetInterceptor;
import com.lxf.cglib.lazyloader.ConcreteClassLazyLoader;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by Liaoxf on 2017-08-01 15:14.
 */
public class CglibLazyLoaderTest {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(PropertyBean.class);
//        enhancer.setCallback(new ConcreteClassLazyLoader());
//        PropertyBean propertyBean = (PropertyBean) enhancer.create();
//        System.out.println(propertyBean);

        LazyBean lazyBean = new LazyBean("Jack", 20);
        System.out.println(lazyBean);
        System.out.println(lazyBean.getPropertyBean());
        System.out.println(lazyBean.getPropertyBeanDispatcher());
    }
}
