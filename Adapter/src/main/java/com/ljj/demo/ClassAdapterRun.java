package com.ljj.demo;

import com.ljj.demo.adapter.ClassAdapter;
import com.ljj.demo.api.Target;

/**
 * @Description: 客户端代码
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class ClassAdapterRun {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
