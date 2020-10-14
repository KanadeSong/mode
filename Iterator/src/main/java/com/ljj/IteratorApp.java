package com.ljj;

import com.ljj.demo.Aggregate;
import com.ljj.demo.ConcreteAggregate;
import com.ljj.demo.Iterator;

/**
 * 迭代器模式
 *
 */
public class IteratorApp
{
    public static void main( String[] args )
    {
        Aggregate ag=new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it=ag.getIterator();
        while(it.hasNext())
        {
            Object ob=it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object ob=it.first();
        System.out.println("\nFirst："+ob.toString());
    }

}