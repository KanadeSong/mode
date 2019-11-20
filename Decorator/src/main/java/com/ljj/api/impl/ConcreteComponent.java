package com.ljj.api.impl;

import com.ljj.api.Component;

/**
 * @Description: 具体构件角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
