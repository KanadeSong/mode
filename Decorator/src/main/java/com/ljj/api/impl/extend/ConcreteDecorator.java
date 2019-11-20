package com.ljj.api.impl.extend;

import com.ljj.api.Component;
import com.ljj.api.impl.Decorator;

/**
 * @Description: 具体装饰角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
