package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 14:26
 * @description
 **/
public class IGeekBuyer extends IGeekAdminStaff
{
    @Override
    public void work()
    {
        System.out.println("在采购音响设备");
    }

    public IGeekBuyer()
    {
    }

    public IGeekBuyer(String id, String name)
    {
        super(id, name);
    }
}
