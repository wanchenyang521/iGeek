package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:20
 * @description
 **/
public abstract class Employee
{
    private String id;
    private String name;

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

    public Employee()
    {
    }

    public Employee(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public abstract void work();
}
