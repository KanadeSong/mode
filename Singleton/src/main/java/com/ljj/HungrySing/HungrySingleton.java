package com.ljj.HungrySing;

/**
 * @Description: 饿汉式单例
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
