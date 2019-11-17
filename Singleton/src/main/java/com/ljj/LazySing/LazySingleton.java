package com.ljj.LazySing;

/**
 * @Description: 懒汉式单例
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class LazySingleton {
    //保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }    //private 避免类在外部被实例化

    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
