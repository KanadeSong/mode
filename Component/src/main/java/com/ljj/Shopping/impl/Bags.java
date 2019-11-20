package com.ljj.Shopping.impl;

import com.ljj.Shopping.Articles;

import java.util.ArrayList;

/**
 * @Description: 树枝构件：袋子
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Bags implements Articles {
    private String name;     //名字
    private ArrayList<Articles> bags = new ArrayList<Articles>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
