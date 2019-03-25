package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:14
 * @description
 **/
public class Gril
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Gril()
    {
    }

    public Gril(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
