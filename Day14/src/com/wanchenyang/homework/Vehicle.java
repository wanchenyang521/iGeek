package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:59
 * @description
 **/
public class Vehicle
{
    int wheel;
    String color;
    public void run()
    {
        System.out.println(wheel+"个轮子"+color+"的车在跑");
    }

    public Vehicle()
    {
    }

    public Vehicle(int wheel, String color)
    {
        this.wheel = wheel;
        this.color = color;
    }
}
