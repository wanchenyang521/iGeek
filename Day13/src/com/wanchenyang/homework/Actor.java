package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:50
 * @description
 **/
public class Actor extends Person
{
    public Actor()
    {
    }

    public Actor(String name, String age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println(super.getAge()+"岁的演员"+super.getName()+"在吃小龙虾");
    }

    @Override
    public void say(String content)
    {

    }

    public void dance()
    {
        System.out.println(super.getAge()+"岁的演员"+super.getName()+"在跳白天鹅");
    }
}
