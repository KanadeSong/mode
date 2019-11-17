package com.ljj.demo.adapter;

import com.ljj.demo.adaptee.Adaptee;
import com.ljj.demo.api.Target;

/**
 * @Description: 类适配器类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
