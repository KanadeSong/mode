package com.ljj.demo;

import com.ljj.demo.impl.ConcreteFlyweight;

import java.util.HashMap;

/**
 * @Description: 享元工厂角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
