package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 10:55
 * @description
 * a)	成员变量: 状态(status),true表示运行状态一种,false表示停止状态.
 * b)	成员内部类: 发动机(Engine)
 * i.	成员方法:work()
 * 1.	如果汽车的运行状态打印发动机就飞速旋转
 * 2.	否则打印发动机停止工作
 * c)	提供:状态(status)的getter和setter方法
 **/
public class Car
{
    private boolean status;
    public class Engine
    {

        public void work(boolean status)
        {

            if(status)
            {
                System.out.println("发动机就飞速旋转");
            }
            else
            {
                System.out.println("发动机停止工作");
            }
        }
    }

    public Car()
    {
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public Car(boolean status)
    {
        this.status = status;
    }
}
