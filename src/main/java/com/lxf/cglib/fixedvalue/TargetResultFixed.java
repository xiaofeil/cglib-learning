package com.lxf.cglib.fixedvalue;

import net.sf.cglib.proxy.FixedValue;

/**
 * Created by Liaoxf on 2017-08-01 15:16.
 */
public class TargetResultFixed implements FixedValue {
    /**
     * 该类实现FixedValue接口，同时锁定回调值为999
     * (整型，CallbackFilter中定义的使用FixedValue型回调的方法为getConcreteMethodFixedValue，该方法返回值为整型)。
     */
    public Object loadObject() throws Exception {
        System.out.println("******锁定结果******");
        Object obj = 999;
        return obj;
    }
}
