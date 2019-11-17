package com.ljj;

import com.ljj.demo.President;

/**
 * @Description: 用懒汉式单例模式模拟产生美国当今总统对象
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class SingletonDemoLazyApp {
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }

}
