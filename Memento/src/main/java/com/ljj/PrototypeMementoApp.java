package com.ljj;

import com.ljj.PrototypeMemento.OriginatorPrototype;
import com.ljj.PrototypeMemento.PrototypeCaretaker;

/**
 * @Description: 备忘录模式如何同原型模式混合使用
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class PrototypeMementoApp {
    public static void main(String[] args) {
        OriginatorPrototype or=new OriginatorPrototype();
        PrototypeCaretaker cr=new PrototypeCaretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:"+or.getState());
    }
}
