package com.ljj.demo.impl;

import com.ljj.demo.Flyweight;
import com.ljj.demo.UnsharedConcreteFlyweight;

/**
 * @Description: 具体享元角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
