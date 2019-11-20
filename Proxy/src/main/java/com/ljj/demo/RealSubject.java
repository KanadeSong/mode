package com.ljj.demo;

/**
 * @Description: 真实主题
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class RealSubject implements Subject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
