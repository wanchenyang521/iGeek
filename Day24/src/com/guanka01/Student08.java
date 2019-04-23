package com.guanka01;

import java.util.Objects;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:09
 * @description
 **/
public class Student08
{
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "Student08{" +
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
        if (!(o instanceof Student08))
        {
            return false;
        }
        Student08 student08 = (Student08) o;
        return age == student08.age &&
                Objects.equals(name, student08.name);
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

    public Student08()
    {
    }

    public Student08(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
