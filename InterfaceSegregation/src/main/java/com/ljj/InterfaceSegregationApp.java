package com.ljj;

import com.ljj.api.CountModule;
import com.ljj.api.InputModule;
import com.ljj.api.PrintModule;
import com.ljj.impl.StuScoreList;

/**
 * 接口隔离原则
 *
 */
public class InterfaceSegregationApp
{
    public static void main( String[] args )
    {
        InputModule inputModule = StuScoreList.getInputModule();
        CountModule countModule = StuScoreList.getCountModule();
        PrintModule printModule = StuScoreList.getPrintModule();
        inputModule.insert();
        countModule.countTotalScore();
        printModule.printStuInfo();
    }
}
