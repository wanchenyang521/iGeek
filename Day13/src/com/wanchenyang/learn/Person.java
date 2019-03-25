package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 10:44
 * @description
 **/
public class Person
{
    String name;
    int age;

    public Person()
    {
        System.out.println("person无参"+age+name);
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
