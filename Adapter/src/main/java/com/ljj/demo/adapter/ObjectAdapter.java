package com.ljj.demo.adapter;

import com.ljj.demo.adaptee.Adaptee;
import com.ljj.demo.api.Target;

/**
 * @Description: 对象适配器类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
