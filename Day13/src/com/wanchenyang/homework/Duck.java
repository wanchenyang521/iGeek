package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:45
 * @description
 **/
public class Duck extends Poultry
{
    public Duck(String color, int age)
    {
        super(color, age);
    }

    public Duck()
    {
    }

    @Override
    public void eat()
    {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"的鸭子在吃鱼");
    }
    public void swim()
    {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"的鸭子在游泳");
    }
}
