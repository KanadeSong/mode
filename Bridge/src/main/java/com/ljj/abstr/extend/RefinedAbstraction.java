package com.ljj.abstr.extend;

import com.ljj.abstr.Abstraction;
import com.ljj.api.Implementor;

/**
 * @Description: TODO
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}
