package com.wanchenyang.learn;

import java.util.Objects;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-15 16:11
 * @description
 **/
public class TestObject
{
    public static void main(String[] args)
    {
        TestObject testObject = new TestObject();
        System.out.println(testObject.toString());
        System.out.println(testObject);
        Person2 person2 = new Person2("cy",21);
        System.out.println(person2.toString());
    }

//    @Override
//    public String toString()
//    {
//        return "略略略";
//    }
}

class Person2
{
    String name;
    int age;
    @Override
    public String toString()
    {
        return name+age;
    }

    public Person2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }
}
