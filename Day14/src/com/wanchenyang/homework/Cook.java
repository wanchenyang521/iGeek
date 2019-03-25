package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 15:24
 * @description
 **/
public class Cook extends Employee
{

    public Cook()
    {
    }

    public Cook(int age, String name)
    {
        super(age, name);
    }

    @Override
    public void work()
    {
        System.out.println("炒菜");
    }
}
