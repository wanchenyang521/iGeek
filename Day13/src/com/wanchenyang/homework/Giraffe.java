package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:09
 * @description
 **/
public class Giraffe extends Herbivore
{

    @Override
    public void eat()
    {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"的长颈鹿在吃树叶");
    }

    public Giraffe(int numOfLegs, int age)
    {
        super(numOfLegs, age);
    }

    public Giraffe()
    {
    }
}
