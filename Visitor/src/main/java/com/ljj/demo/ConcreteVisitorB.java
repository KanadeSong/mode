package com.ljj.demo;

/**
 * @Description: 具体访问者B类
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class ConcreteVisitorB implements Visitor {
    public void visit(ConcreteElementA element)
    {
        System.out.println("具体访问者B访问-->"+element.operationA());
    }
    public void visit(ConcreteElementB element)
    {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}
