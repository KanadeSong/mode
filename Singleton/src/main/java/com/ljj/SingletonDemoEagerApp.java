package com.ljj;

import com.ljj.demo.Shaonv;

import javax.swing.*;
import java.awt.*;

/**
 * @Description: 用饿汉式单例模式模拟产生少女对象
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class SingletonDemoEagerApp {
    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        Shaonv obj1 = Shaonv.getInstance();
        contentPane.add(obj1);
        Shaonv obj2 = Shaonv.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
