package com.ljj;

import com.ljj.demo.Builder;
import com.ljj.demo.ConcreteBuilder;
import com.ljj.demo.Director;
import com.ljj.demo.Product;

/**
 * 建造者（Builder）模式的主要结构
 */
public class BuilderApp {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
