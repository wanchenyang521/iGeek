package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 10:58
 * @description
 **/
public class TestCar
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Car.Engine engine = new Car().new Engine();
        engine.work(car.isStatus());
        car.setStatus(true);
        engine.work(car.isStatus());
    }
}
