package com.wanchenyang.Interface;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 16:41
 * @description
 * 服务员类
 **/
public class Waiter extends Employee
{
    public Waiter()
    {
    }

    public Waiter(String name, double salary)
    {
        super(name, salary);
    }

    @Override
    public void work()
    {
        System.out.println("上菜");
    }
}
