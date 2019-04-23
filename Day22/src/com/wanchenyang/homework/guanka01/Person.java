package com.wanchenyang.homework.guanka01;

import java.util.Objects;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:14
 * @description
 **/
public class Person
{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o)
    {
//        Person otherP = (Person)o;
//        if(!this.name.equals(otherP.name))
//        {
//            return false;
//        }
//        if(this.age!=otherP.age)
//        {
//            return false;
//        }
//        return true;

        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Person))
        {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
