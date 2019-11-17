package com.ljj.TwoWayAdapter;

import com.ljj.TwoWayAdapter.adaptee.TwoWayAdaptee;
import com.ljj.TwoWayAdapter.adaptee.impl.AdapteeRealize;
import com.ljj.TwoWayAdapter.adpter.impl.TwoWayAdapter;
import com.ljj.TwoWayAdapter.targetapi.TwoWayTarget;
import com.ljj.TwoWayAdapter.targetapi.impl.TargetRealize;

/**
 * @Description: 双向适配器模式
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class TwoWayAdapterRun {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee=new AdapteeRealize();
        TwoWayTarget target=  new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target=new TargetRealize();
        adaptee=  new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
