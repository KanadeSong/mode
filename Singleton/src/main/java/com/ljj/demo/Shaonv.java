package com.ljj.demo;

import javax.swing.*;

/**
 * @Description: 少女
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Shaonv extends JPanel {
    private static Shaonv instance = new Shaonv();

    private Shaonv() {
        JLabel l1 = new JLabel(new ImageIcon("src/shaonv.png"));
        this.add(l1);
    }

    public static Shaonv getInstance() {
        return instance;
    }
}
