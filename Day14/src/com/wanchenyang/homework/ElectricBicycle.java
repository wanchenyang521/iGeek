package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:02
 * @description
 **/
public class ElectricBicycle extends Vehicle
{
    public void charge()
    {
        System.out.println(wheel+"个轮子的"+color+"电动自行车在充电");
    }
    public ElectricBicycle()
    {
    }

    public ElectricBicycle(int wheel, String color)
    {
        super(wheel, color);
    }
}
