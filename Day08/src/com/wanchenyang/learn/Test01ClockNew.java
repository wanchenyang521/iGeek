package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 09:41
 * @description
 **/
public class Test01ClockNew
{
    private int value;
    private int limit;

    public Test01ClockNew()
    {
    }

    public Test01ClockNew(int limit)
    {
        this.limit = limit;
    }

    public Test01ClockNew(int value, int limit)
    {
        this.value = value;
        this.limit = limit;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getLimit()
    {
        return limit;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public void increase()
    {
        if(value==limit)
        {
            value = 0;
        }
        else
        {
            value++;
        }
    }




}
