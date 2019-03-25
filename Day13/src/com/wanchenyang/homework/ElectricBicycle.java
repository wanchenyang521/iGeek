package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:16
 * @description
 **/
public class ElectricBicycle extends Vehicle
{
    public ElectricBicycle(String color, int numOfWheel)
    {
        super(color, numOfWheel);
    }

    public ElectricBicycle()
    {
    }

    @Override
    public void run()
    {
        System.out.println("骑着跑");
    }
    public void Charging()
    {
        System.out.println("充电");
    }
}
