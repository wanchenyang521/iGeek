package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:07
 * @description
 **/
public class Extend02Student
{
    private String name;
    private int age;
    private String content;

    public Extend02Student()
    {
    }

    public Extend02Student(String name, int age, String content)
    {
        this.name = name;
        this.age = age;
        this.content = content;
    }

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

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }


    public void eat()
    {
        System.out.println("年龄为"+age+"的"+name+"同学正在吃饭....");
    }

    public void learn()
    {
        System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听着"+content+"的知识....");
    }




}
