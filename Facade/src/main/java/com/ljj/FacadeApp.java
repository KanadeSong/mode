package com.ljj;

import com.ljj.demo.Facade;

/**
 * 外观模式
 */
public class FacadeApp {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}
