package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:26
 * @description
 **/
public class IGeekMaintainer extends IGeekAdminStaff
{
    @Override
    public void work()
    {
        System.out.println("在解决不能共享屏幕问题");
    }

    public IGeekMaintainer()
    {
    }

    public IGeekMaintainer(String id, String name)
    {
        super(id, name);
    }
}
