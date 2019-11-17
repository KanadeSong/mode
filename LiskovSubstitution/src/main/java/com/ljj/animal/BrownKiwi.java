package com.ljj.animal;

import com.ljj.animal.bird.Bird;

/**
 * @Description: 几维鸟类
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class BrownKiwi extends Bird {

    @Override
    public void setSpeed(double speed) {
        flySpeed = 0;
    }
}
