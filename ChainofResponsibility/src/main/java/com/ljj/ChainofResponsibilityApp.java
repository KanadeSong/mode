package com.ljj;

import com.ljj.demo.ConcreteHandler1;
import com.ljj.demo.ConcreteHandler2;
import com.ljj.demo.Handler;

/**
 * 职责链模式
 */
public class ChainofResponsibilityApp {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
