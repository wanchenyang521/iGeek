package com.wanchenyang.homework;

import java.nio.channels.Pipe;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:14
 * @description
 **/
public class Car extends Vehicle
{
    @Override
    public void run()
    {
        System.out.println("开着跑");
    }
    public void oil()
    {
        System.out.println("加油");
    }

    public Car()
    {
    }

    public Car(String color, int numOfWheel)
    {
        super(color, numOfWheel);
    }
}
