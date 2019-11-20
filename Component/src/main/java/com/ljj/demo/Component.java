package com.ljj.demo;

/**
 * @Description: 抽象构件
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
