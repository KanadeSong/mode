package com.ljj.abstr;

import com.ljj.api.Implementor;

/**
 * @Description: 抽象化角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
