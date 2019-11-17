package com.ljj.customer;

import com.ljj.shop.Shop;
import com.ljj.shop.impl.ChiBaShop;

/**
 * @Description: 顾客类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Customer {
    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}
