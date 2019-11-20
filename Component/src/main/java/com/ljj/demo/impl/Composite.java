package com.ljj.demo.impl;

import com.ljj.demo.Component;

import java.util.ArrayList;

/**
 * @Description: 树枝构件
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
