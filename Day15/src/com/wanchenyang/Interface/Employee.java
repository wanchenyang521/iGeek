package com.wanchenyang.Interface;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 16:37
 * @description
 * 员工类
 **/
public class Employee
{
    private String name;
    private double salary;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public Employee()
    {
    }

    public void work()
    {
        System.out.println("工作");
    }


}
