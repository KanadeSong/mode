package com.ljj.demo;

/**
 * @Description: 管理者
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m)
    {
        memento=m;
    }
    public Memento getMemento()
    {
        return memento;
    }
}
