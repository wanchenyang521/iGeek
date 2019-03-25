package com.wanchenyang.polymorphism;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:11
 * @description
 **/
public abstract class Animal
{
    public void eat()
    {
        System.out.println("动物吃饭");
    }
    public abstract void sleep();
}
