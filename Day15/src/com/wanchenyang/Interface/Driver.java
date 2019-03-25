package com.wanchenyang.Interface;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 09:33
 * @description
 **/
public class Driver extends Employee implements Drivable
{
    @Override
    public void work()
    {
        System.out.println("秋名山老司机");
    }

    public Driver(String name, double salary)
    {
        super(name, salary);
    }

    public Driver()
    {
    }

    @Override
    public void theoryTest()
    {
        System.out.println("司机刷题");
    }

    @Override
    public void fieldDrive()
    {
        System.out.println("模拟");
    }

    @Override
    public void roadDrive()
    {
        System.out.println("上路啊");
    }
}
