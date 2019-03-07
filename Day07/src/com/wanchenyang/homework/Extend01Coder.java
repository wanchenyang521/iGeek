package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 18:56
 * @description
 **/
public class Extend01Coder
{
    private String name;
    private String id;
    private int salary;

    public Extend01Coder()
    {
    }

    public Extend01Coder(String name, String id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void work()
    {
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员正在努力的写着代码......");
    }
}
