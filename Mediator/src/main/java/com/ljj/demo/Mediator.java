package com.ljj.demo;

/**
 * @Description: 抽象中介者
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
