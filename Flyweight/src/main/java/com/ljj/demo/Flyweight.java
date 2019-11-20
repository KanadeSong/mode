package com.ljj.demo;

/**
 * @Description: 抽象享元角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
