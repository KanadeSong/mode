package com.ljj;

import com.ljj.customer.Customer;
import com.ljj.shop.impl.ChiBaShop;
import com.ljj.shop.impl.ShaoguanShop;

/**
 * 依赖倒置原则
 */
public class DependenceInversionApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("顾客购买以下商品：");
        customer.shopping(new ChiBaShop());
        customer.shopping(new ShaoguanShop());
    }
}
