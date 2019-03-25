package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:43
 * @description
 **/
public class Cock extends Poultry
{
    public Cock(String color, int age)
    {
        super(color, age);
    }

    public Cock()
    {
    }

    @Override
    public void eat()
    {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"公鸡在啄米");
    }
    public void crow()
    {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"公鸡在打鸣");
    }
}
