package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:03
 * @description
 **/
public class Extend02Teacher
{
    private String name;
    private int age;
    private String content;

    public Extend02Teacher()
    {
    }

    public Extend02Teacher(String name, int age, String content)
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
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
    }
    public void teach()
    {
        System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识........");
    }

}
