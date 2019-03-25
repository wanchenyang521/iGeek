package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:03
 * @description
 **/
public class Bear
{
    private String color;
    private int numOfLegs;
    public void eat()
    {
        System.out.println("吃蜂蜜");
    }
    public void catchFish()
    {
        System.out.println("抓鱼");
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

    public Bear(String color, int numOfLegs)
    {
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public Bear()
    {
    }
}
