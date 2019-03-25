package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:00
 * @description
 **/
public class Car extends Vehicle
{
    public Car()
    {
    }

    public Car(int wheel, String color)
    {
        super(wheel, color);
    }

    public void addGasoline()
    {
        System.out.println(wheel+"个轮子的"+color+"小汽车在加油");
    }
}
