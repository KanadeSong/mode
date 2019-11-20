package com.ljj.demo;

/**
 * @Description: 抽象同事类
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator)
    {
        this.mediator=mediator;
    }
    public abstract void receive();
    public abstract void send();
}
