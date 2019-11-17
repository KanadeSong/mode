package com.ljj.demo2;

/**
 * @Description: 奖状类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class citation implements Cloneable{
    String name;
    String info;
    String college;
    public citation(String name, String info, String college)
    {
        this.name=name;
        this.info=info;
        this.college=college;
        System.out.println("奖状创建成功！");
    }
    public void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(this.name);
    }
    public void display()
    {
        System.out.println(name+info+college);
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("奖状拷贝成功！");
        return (citation)super.clone();
    }
}
