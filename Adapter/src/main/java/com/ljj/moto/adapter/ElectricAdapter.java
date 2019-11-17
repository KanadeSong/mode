package com.ljj.moto.adapter;

import com.ljj.moto.adaptee.ElectricMotor;

/**
 * @Description: 适
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class ElectricAdapter {
    private ElectricMotor emotor;
    public ElectricAdapter()
    {
        emotor=new ElectricMotor();
    }
    public void drive()
    {
        emotor.electricDrive();
    }
}
