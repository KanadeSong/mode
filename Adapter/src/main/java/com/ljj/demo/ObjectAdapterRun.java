package com.ljj.demo;

import com.ljj.demo.adaptee.Adaptee;
import com.ljj.demo.adapter.ObjectAdapter;
import com.ljj.demo.api.Target;

/**
 * @Description: 对象适配器
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class ObjectAdapterRun {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
