package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:03
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
        Car car  = new Car();
        car.wheel = 4;
        car.color = "白色";
        car.run();
        car.addGasoline();
        ElectricBicycle electricBicycle = new ElectricBicycle();
        electricBicycle.wheel = 2;
        electricBicycle.color = "黑色";
        electricBicycle.run();
        electricBicycle.charge();
    }
}
