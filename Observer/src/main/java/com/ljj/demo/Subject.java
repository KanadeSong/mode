package com.ljj.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 抽象目标
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}
