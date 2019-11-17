package com.ljj;

import com.ljj.demo2.citation;

/**
 * @Description: 用原型模式生成“三好学生”奖状
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class PrototypeApp2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1=new citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        obj1.display();
        citation obj2=(citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
