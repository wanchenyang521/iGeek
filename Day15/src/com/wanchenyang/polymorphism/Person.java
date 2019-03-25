package com.wanchenyang.polymorphism;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:12
 * @description
 **/
public class Person extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("筷子吃饭");
    }

    @Override
    public void sleep()
    {
        System.out.println("人睡觉");
    }

    public void study()
    {
        System.out.println("学习java");
    }
    public void work()
    {
        System.out.println("工作");
    }
}
