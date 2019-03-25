package com.wanchenyang.Interface;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 16:38
 * @description
 * 经理类
 **/
public class Manager extends Employee implements Drivable
{
//    奖金
    private double bounds;

    public double getBounds()
    {
        return bounds;
    }

    public void setBounds(double bounds)
    {
        this.bounds = bounds;
    }

    public Manager()
    {
    }
    public Manager(String name, double salary, double bounds)
    {
        super(name, salary);
        this.bounds = bounds;
    }

    @Override
    public void work()
    {
        System.out.println("管理酒店");
    }

    @Override
    public void theoryTest()
    {
        System.out.println("理论一");
    }

    @Override
    public void fieldDrive()
    {
        System.out.println("理论二");
    }

    @Override
    public void roadDrive()
    {
        System.out.println("理论三");
    }
}
