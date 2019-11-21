package com.ljj.PrototypeMemento;

/**
 * @Description: 原型管理者
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class PrototypeCaretaker {
    private OriginatorPrototype opt;
    public void setMemento(OriginatorPrototype opt)
    {
        this.opt=opt;
    }
    public OriginatorPrototype getMemento()
    {
        return opt;
    }
}
