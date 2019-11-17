package com.ljj.moto;

import com.ljj.moto.api.Motor;
import com.ljj.moto.read.ReadXML;

import java.sql.SQLOutput;

/**
 * @Description: 用适配器模式（Adapter）模拟新能源汽车的发动机
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class MotorAdapterRun {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor=(Motor) ReadXML.getObject();
        motor.drive();
    }

}
