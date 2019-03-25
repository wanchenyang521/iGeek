package com.wanchenyang.polymorphism;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:34
 * @description
 **/
public class Dog extends Animal
{
    @Override
    public void sleep()
    {
        System.out.println("狗狗睡觉");
    }

    @Override
    public void eat()
    {
        System.out.println("狗狗吃饭");
    }
    public void keepDoor()
    {
        System.out.println("看门");
    }
}
