package com.wanchenyang.homework.guanka03;

import java.util.Objects;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 22:01
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Student))
        {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
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

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Student()
    {
    }
}
