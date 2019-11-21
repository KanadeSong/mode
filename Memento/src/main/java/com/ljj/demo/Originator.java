package com.ljj.demo;

/**
 * @Description: 发起人
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class Originator {
    private String state;
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
    public Memento createMemento()
    {
        return new Memento(state);
    }
    public void restoreMemento(Memento m)
    {
        this.setState(m.getState());
    }
}
