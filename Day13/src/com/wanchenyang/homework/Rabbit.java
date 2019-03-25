package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:13
 * @description
 **/
public class Rabbit extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿的兔子在吃狗尾草");
    }

    public Rabbit()
    {
    }

    public Rabbit(int numOfLegs, int age)
    {
        super(numOfLegs, age);
    }
}
