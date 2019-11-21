package com.ljj.demo;

/**
 * @Description: 抽象元素类
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public interface Element {
    void accept(Visitor visitor);
}
