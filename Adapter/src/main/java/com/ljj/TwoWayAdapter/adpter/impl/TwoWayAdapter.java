package com.ljj.TwoWayAdapter.adpter.impl;

import com.ljj.TwoWayAdapter.adaptee.TwoWayAdaptee;
import com.ljj.TwoWayAdapter.targetapi.TwoWayTarget;

/**
 * @Description: 双向适配器
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee{
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;
    public TwoWayAdapter(TwoWayTarget target)
    {
        this.target=target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee)
    {
        this.adaptee=adaptee;
    }
    public void request()
    {
        adaptee.specificRequest();
    }
    public void specificRequest()
    {
        target.request();
    }
}
