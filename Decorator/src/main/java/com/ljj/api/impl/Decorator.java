package com.ljj.api.impl;

import com.ljj.api.Component;

/**
 * @Description: 抽象装饰角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
