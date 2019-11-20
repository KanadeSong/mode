package com.ljj.demo.impl;

import com.ljj.demo.Component;

/**
 * @Description: 树叶构件
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void add(Component c) {
    }

    public void remove(Component c) {
    }

    public Component getChild(int i) {
        return null;
    }

    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
