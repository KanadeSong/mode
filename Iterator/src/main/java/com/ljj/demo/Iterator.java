package com.ljj.demo;

/**
 * @Description: 抽象迭代器
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
