package com.ljj.demo;

/**
 * @Description: 非享元角色
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class UnsharedConcreteFlyweight {
    private String info;
    public UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
