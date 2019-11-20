package com.ljj;

import com.ljj.demo.AbstractClass;
import com.ljj.demo.ConcreteClass;

/**
 * 模板方法模式
 */
public class TemplateApp {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
