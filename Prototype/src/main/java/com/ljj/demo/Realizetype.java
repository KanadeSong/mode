package com.ljj.demo;

/**
 * @Description: 具体原型类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
