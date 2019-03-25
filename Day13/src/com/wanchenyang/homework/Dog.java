package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 21:28
 * @description
 **/
public class Dog extends Animal
{
    private String breed;

    public Dog(String color, int numOfLegs)
    {
        super(color, numOfLegs);
    }

    public Dog()
    {
    }

    public Dog(String name, String color, String breed)
    {
        super(name, color);
        this.breed = breed;
    }

    @Override
    public void eat()
    {
        System.out.println(super.getNumOfLegs()+"条腿"+super.getColor()+"的狗在啃骨头");
    }
    public void lookHome()
    {
        System.out.println(super.getNumOfLegs()+"条腿"+super.getColor()+"的狗在看家");
    }
}
