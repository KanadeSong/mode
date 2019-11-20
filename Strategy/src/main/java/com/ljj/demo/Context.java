package com.ljj.demo;

/**
 * @Description: 环境类
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
