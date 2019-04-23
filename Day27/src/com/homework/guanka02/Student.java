package com.homework.guanka02;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 16:30
 * @description
 **/
public class Student
{
    private String name;
    private String id;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
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

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
}
