package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-20 20:20
 * @description
 **/
public class Cat
{
    private String name;
    private String color;
    private int age;

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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Cat()
    {
    }

    public Cat(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}
