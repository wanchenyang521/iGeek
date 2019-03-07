package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:13
 * @description
 **/
public class Extend03Cat
{
    private String color;
    private String breed;

    public Extend03Cat()
    {
    }

    public Extend03Cat(String color, String breed)
    {
        this.color = color;
        this.breed = breed;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void eat()
    {
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse()
    {
        System.out.println(color+"的"+breed+"正在逮老鼠....");
    }

}
