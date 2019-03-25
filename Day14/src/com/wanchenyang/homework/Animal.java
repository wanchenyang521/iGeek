package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 14:44
 * @description
 **/
public class Animal
{
    String name;
    String color;
    public void eat()
    {
        System.out.println(color+"的"+name+"动物在吃东西");
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
}
