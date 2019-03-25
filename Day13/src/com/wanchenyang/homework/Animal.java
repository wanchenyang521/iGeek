package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 21:25
 * @description
 **/
public abstract class Animal
{
    private String name;
    private String color;
    private int numOfLegs;
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Animal(int numOfLegs, int age)
    {
        this.numOfLegs = numOfLegs;
        this.age = age;
    }

    public int getNumOfLegs()
    {
        return numOfLegs;
    }

    public Animal(String color, int numOfLegs)
    {
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public Animal(String name, String color, int numOfLegs)
    {
        this.name = name;
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs)
    {
        this.numOfLegs = numOfLegs;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Animal()
    {
    }

    public Animal(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    public abstract void eat();

}
