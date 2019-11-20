package com.ljj;

import com.ljj.api.Component;
import com.ljj.api.impl.ConcreteComponent;
import com.ljj.api.impl.extend.ConcreteDecorator;

/**
 * 装饰模式
 */
public class DecoratorApp {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
