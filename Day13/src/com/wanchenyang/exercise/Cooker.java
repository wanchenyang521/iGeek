package com.wanchenyang.exercise;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 16:42
 * @description
 * 厨师
 *
 **/
public class Cooker extends Employee
{
    public Cooker()
    {
    }

    public Cooker(String name, double salary)
    {
        super(name, salary);
    }

    @Override
    public void work()
    {
        System.out.println("掌勺");
    }
}
