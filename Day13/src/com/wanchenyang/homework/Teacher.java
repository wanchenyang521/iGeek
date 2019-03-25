package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:17
 * @description
 **/
public class Teacher extends Person
{
    private double salary;

    public Teacher(String name, String age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Teacher()
    {
    }

    @Override
    public void eat()
    {
        System.out.println("工资为"+salary+"元的"+super.getAge()+"岁的"+super.getName()+"老师在吃工作餐");
    }

    @Override
    public void say(String content)
    {

    }

    public void lecture()
    {
        System.out.println("工资为"+salary+"元的"+super.getAge()+"岁的"+super.getName()+"老师在讲课");
    }
}
