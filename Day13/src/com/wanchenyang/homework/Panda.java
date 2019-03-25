package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:06
 * @description
 **/
public class Panda
{
    private String color;
    private int numOfLegs;
    public void eat()
    {
        System.out.println("吃竹子");
    }
    public void climbTree()
    {
        System.out.println("爬树");
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getNumOfLegs()
    {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs)
    {
        this.numOfLegs = numOfLegs;
    }

    public Panda()
    {
    }

    public Panda(String color, int numOfLegs)
    {
        this.color = color;
        this.numOfLegs = numOfLegs;
    }
}
