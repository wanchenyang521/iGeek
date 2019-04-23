package com.wanchenyang.homework.guanka;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 16:13
 * @description
 **/
public class Student
{
    private String id;
    private String name;
    private String sex;
    private int age;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Student()
    {
    }

    public Student(String id, String name, String sex, int age)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
