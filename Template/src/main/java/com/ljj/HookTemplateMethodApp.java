package com.ljj;

import com.ljj.HookTemplateMethod.HookAbstractClass;
import com.ljj.HookTemplateMethod.HookConcreteClass;

/**
 * @Description: 含钩子方法的模板方法模式
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class HookTemplateMethodApp {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
