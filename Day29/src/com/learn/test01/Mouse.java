package com.learn.test01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 08:39
 * @description
 **/
public class Mouse extends HardWare implements USB
{

    @Override
    public void open()
    {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void work()
    {
        System.out.println("鼠标点击");
    }

    @Override
    public void close()
    {
        System.out.println("断开鼠标的USB");
    }
}
