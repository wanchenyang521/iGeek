package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:14
 * @description
 **/
public abstract class Person
{
    private String name;
    private String age;
    private String height;

    public String getHeight()
    {
        return height;
    }

    public void setHeight(String height)
    {
        this.height = height;
    }

    public Person(String name, String age, String height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public Person(String name, String age)
    {
        this.name = name;
        this.age = age;
    }

    public Person()
    {
    }

    public void eat()
    {
        System.out.println(age+"岁的"+name+"在吃饭");
    }
    public abstract void say(String content);

}
