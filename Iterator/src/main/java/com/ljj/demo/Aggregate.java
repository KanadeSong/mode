package com.ljj.demo;

/**
 * @Description: 抽象聚合
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
