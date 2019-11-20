package com.ljj.api.impl;

import com.ljj.api.Implementor;

/**
 * @Description: 具体实现化角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteImplementorA implements Implementor {
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
