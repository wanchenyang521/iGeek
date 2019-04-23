package com.homework.guanka01;

import java.io.Serializable;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:46
 * @description
 **/
public class Student implements Serializable
{
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public Student()
    {
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
}
