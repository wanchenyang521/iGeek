package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:02
 * @description
 **/
public class Parrot extends Animal
{
    public Parrot()
    {
    }

    public Parrot(String color, int numOfLegs)
    {
        super(color, numOfLegs);
    }
    @Override
    public void eat()
    {
        System.out.println(super.getNumOfLegs()+"条腿"+super.getColor()+"鹦鹉在吃小米");
    }
    public void say()
    {
        System.out.println(super.getNumOfLegs()+"条腿"+super.getColor()+"鹦鹉在说你好,丑八怪");
    }
}
