package com.ljj.demo;

/**
 * @Description: 具体状态B类
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
