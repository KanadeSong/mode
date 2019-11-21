package com.ljj.demo;

/**
 * @Description: 抽象访问者
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
