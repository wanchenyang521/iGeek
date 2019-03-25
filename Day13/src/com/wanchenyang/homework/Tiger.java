package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 11:06
 * @description
 **/
public class Tiger extends Carnivore
{
    @Override
    public void eat()
    {
        System.out.println("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿的老虎在吃羊");
    }

    public Tiger(int numOfLegs, int age)
    {
        super(numOfLegs, age);
    }

    public Tiger()
    {
    }
}
