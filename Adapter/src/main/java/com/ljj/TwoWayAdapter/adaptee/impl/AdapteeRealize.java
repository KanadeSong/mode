package com.ljj.TwoWayAdapter.adaptee.impl;

import com.ljj.TwoWayAdapter.adaptee.TwoWayAdaptee;

/**
 * @Description: 适配者实现
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class AdapteeRealize implements TwoWayAdaptee {
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
