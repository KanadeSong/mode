package com.ljj.person;

import com.ljj.Company.Company;

/**
 * @Description: 经纪人
 * @Author LeeJack
 * @Date 2019/11/17
 * @Version V1.0
 **/
public class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;
    public void setStar(Star myStar)
    {
        this.myStar=myStar;
    }
    public void setFans(Fans myFans)
    {
        this.myFans=myFans;
    }
    public void setCompany(Company myCompany)
    {
        this.myCompany=myCompany;
    }
    public void meeting()
    {
        System.out.println(myFans.getName()+"与明星"+myStar.getName()+"见面了。");
    }
    public void business()
    {
        System.out.println(myCompany.getName()+"与明星"+myStar.getName()+"洽淡业务。");
    }
}
