package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:17
 * @description
 **/
public class Test9
{
    public static void main(String[] args)
    {
        Car car = new Car("白色", 4);
        ElectricBicycle electricBicycle = new ElectricBicycle("红色", 2);
        System.out.println(car.getNumOfWheel()+"个轮子的"+car.getColor()+"的汽车");
        car.run();
        car.oil();
        System.out.println(electricBicycle.getNumOfWheel()+"个轮子的"+electricBicycle.getColor()+"电动自行车");
        electricBicycle.run();
        electricBicycle.Charging();

    }
}
