package com.ljj.demo;

/**
 * @Description: 抽象处理者角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
