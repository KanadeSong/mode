package com.ljj;

import com.ljj.StudyAbroadProcess.StudyAbroad;
import com.ljj.StudyAbroadProcess.StudyInAmerica;

/**
 * @Description: 用模板方法模式实现出国留学手续设计程序。
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class StudyAbroadProcessApp {
    public static void main(String[] args) {
        StudyAbroad tm = new StudyInAmerica();
        tm.TemplateMethod();
    }
}
