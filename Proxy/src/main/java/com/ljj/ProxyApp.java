package com.ljj;

import com.ljj.demo.Proxy;

/**
 * 代理模式
 */
public class ProxyApp {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
