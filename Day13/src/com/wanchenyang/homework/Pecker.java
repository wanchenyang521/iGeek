package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:08
 * @description
 **/
public class Pecker extends Carnivore
{
    @Override
    public void eat()
    {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿的啄木鸟的在吃昆虫");
    }

    public Pecker(int numOfLegs, int age)
    {
        super(numOfLegs, age);
    }

    public Pecker()
    {
    }
}
