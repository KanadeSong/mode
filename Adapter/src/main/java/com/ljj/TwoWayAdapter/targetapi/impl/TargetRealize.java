package com.ljj.TwoWayAdapter.targetapi.impl;

import com.ljj.TwoWayAdapter.targetapi.TwoWayTarget;

/**
 * @Description: 目标实现
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class TargetRealize implements TwoWayTarget {
    public void request()
    {
        System.out.println("目标代码被调用！");
    }
}
