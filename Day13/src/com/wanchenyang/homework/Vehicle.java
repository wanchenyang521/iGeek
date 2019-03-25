package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:13
 * @description
 **/
public abstract class Vehicle
{
    private String color;
    private int numOfWheel;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getNumOfWheel()
    {
        return numOfWheel;
    }

    public void setNumOfWheel(int numOfWheel)
    {
        this.numOfWheel = numOfWheel;
    }

    public Vehicle()
    {
    }

    public Vehicle(String color, int numOfWheel)
    {
        this.color = color;
        this.numOfWheel = numOfWheel;
    }

    public abstract void run();
}
