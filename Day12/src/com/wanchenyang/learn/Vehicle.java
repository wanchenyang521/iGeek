package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 14:50
 * @description
 * 交通工具类
 **/
public class Vehicle
{
    public void run()
    {
        System.out.println("vehicle run");
    }

    public Person passenger()
    {
        return new Person();
    }
}
