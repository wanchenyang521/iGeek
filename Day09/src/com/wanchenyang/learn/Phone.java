package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 09:14
 * @description
 **/
public class Phone
{
    private String id;
    private String os;
    private int money;

    public Phone()
    {
    }

    public Phone(String id, String os, int money)
    {
        this.id = id;
        this.os = os;
        this.money = money;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public int getMoney()
    {
        return money;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }
}
