package com.ljj;

import com.ljj.demo.ConcreteStrategyA;
import com.ljj.demo.ConcreteStrategyB;
import com.ljj.demo.Context;
import com.ljj.demo.Strategy;

/**
 * 策略模式
 */
public class StrategyApp {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
