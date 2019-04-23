package com.learn.test01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 08:44
 * @description
 **/
public class KeyBoard extends HardWare implements USB
{
    @Override
    public void open()
    {
        System.out.println("连接键盘的USB");
    }

    @Override
    public void work()
    {
        System.out.println("键盘按键");
    }

    @Override
    public void close()
    {
        System.out.println("断开键盘的USB");
    }
}
