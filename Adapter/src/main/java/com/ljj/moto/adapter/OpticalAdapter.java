package com.ljj.moto.adapter;

import com.ljj.moto.adaptee.OpticalMotor;

/**
 * @Description: 光能适配器
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class OpticalAdapter {
    private OpticalMotor omotor;
    public OpticalAdapter()
    {
        omotor=new OpticalMotor();
    }
    public void drive()
    {
        omotor.opticalDrive();
    }
}
