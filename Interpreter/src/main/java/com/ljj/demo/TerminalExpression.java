package com.ljj.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 终结符表达式类
 * @Author LeeJack
 * @Date 2019/11/21
 * @Version V1.0
 **/
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
