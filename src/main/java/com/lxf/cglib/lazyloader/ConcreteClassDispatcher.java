package com.lxf.cglib.lazyloader;

import com.lxf.cglib.dto.PropertyBean;
import com.lxf.cglib.dto.TargetObject;
import net.sf.cglib.proxy.Dispatcher;

/**
 * Created by Liaoxf on 2017-08-01 16:35.
 */
public class ConcreteClassDispatcher implements Dispatcher {
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("dispatcher");
        propertyBean.setValue(new TargetObject());
        System.out.println("after Dispatcher...");
        return propertyBean;
    }
}
