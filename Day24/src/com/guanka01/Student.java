package com.guanka01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:59
 * @description
 **/
public class Student
{
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
