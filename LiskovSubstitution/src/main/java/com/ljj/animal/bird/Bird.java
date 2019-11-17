package com.ljj.animal.bird;

/**
 * @Description: 鸟类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Bird {
    public double flySpeed;

    public void setSpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}
