package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:55
 * @description
 **/
public class Dog extends  Animal
{
    public void lookHome()
    {
        System.out.println(color+"的"+name+"狗在看家 ");
    }
    public Dog()
    {
    }

    public Dog(String name, String color)
    {
        super(name, color);
    }
}
