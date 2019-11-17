package com.ljj;

import com.ljj.Company.Company;
import com.ljj.person.Agent;
import com.ljj.person.Fans;
import com.ljj.person.Star;

/**
 * 迪米特法则
 *
 */
public class LeastKnowledgeApp
{
    public static void main( String[] args )
    {
        Agent agent = new Agent();
        agent.setStar(new Star("仓木麻衣"));
        agent.setFans(new Fans("粉丝a"));
        agent.setCompany(new Company("xxx会社"));
        agent.meeting();
        agent.business();
    }
}
