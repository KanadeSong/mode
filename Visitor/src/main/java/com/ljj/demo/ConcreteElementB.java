package com.ljj.demo;

/**
 * @Description: 具体元素B类
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class ConcreteElementB implements Element{
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationB()
    {
        return "具体元素B的操作。";
    }
}
