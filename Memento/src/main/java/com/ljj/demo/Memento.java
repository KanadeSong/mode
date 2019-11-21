package com.ljj.demo;

/**
 * @Description: 备忘录
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class Memento {
    private String state;
    public Memento(String state)
    {
        this.state=state;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
}
