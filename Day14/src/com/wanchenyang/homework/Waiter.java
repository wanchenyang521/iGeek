package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:20
 * @description
 **/
public class Waiter extends Employee
{
    @Override
    public void work()
    {
        System.out.print("上菜");
    }

    public Waiter()
    {
    }

    public Waiter(int age, String name)
    {
        super(age, name);
    }
}
