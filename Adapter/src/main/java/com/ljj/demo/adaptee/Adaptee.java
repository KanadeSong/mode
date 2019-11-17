package com.ljj.demo.adaptee;

/**
 * @Description: 适配者接口
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
