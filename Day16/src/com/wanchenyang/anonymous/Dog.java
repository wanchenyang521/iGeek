package com.wanchenyang.anonymous;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:34
 * @description
 **/
public class Dog extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("dog eat");
    }

    @Override
    public void sleep()
    {
        System.out.println("dog sleeps");
    }
}
