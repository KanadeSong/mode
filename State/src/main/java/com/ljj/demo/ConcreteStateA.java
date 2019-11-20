package com.ljj.demo;

/**
 * @Description: 具体状态A类
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
