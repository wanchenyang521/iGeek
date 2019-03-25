package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 14:50
 * @description
 *
 **/
public class TestOverride
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Horse horse = new Horse();
        horse.run();
    }
}
