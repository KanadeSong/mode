package com.ljj.demo;

/**
 * @Description: 具体元素A类
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
