package com.ljj;

import com.ljj.abstr.Abstraction;
import com.ljj.abstr.extend.RefinedAbstraction;
import com.ljj.api.Implementor;
import com.ljj.api.impl.ConcreteImplementorA;

/**
 * 桥接模式
 */
public class BridgeApp {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
