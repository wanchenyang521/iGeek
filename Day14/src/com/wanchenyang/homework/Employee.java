package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:18
 * @description
 **/
public abstract class Employee
{
    private int age;
    private String name;
    public  void speek()
    {
        System.out.print("会说话");
    }
    public abstract void work();

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Employee()
    {
    }

    public Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}
