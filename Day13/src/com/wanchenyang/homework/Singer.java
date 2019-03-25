package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:52
 * @description
 **/
public class Singer extends Person
{
    @Override
    public void eat()
    {
        System.out.println(super.getAge()+"岁的演员"+super.getName()+"在吃大闸蟹");
    }

    @Override
    public void say(String content)
    {

    }

    public Singer()
    {
    }

    public Singer(String name, String age)
    {
        super(name, age);
    }

    public void dance()
    {
        System.out.println(super.getAge()+"岁的演员"+super.getName()+"在演唱丑八怪");
    }
}
