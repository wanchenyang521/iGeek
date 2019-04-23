package com.learn.test01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 08:48
 * @description
 **/
public class Computer
{

    public void begin()
    {
        System.out.println("开机");
        Screen screen = new Screen();
        screen.work();
    }
    public void useUsb(USB usb)
    {
       usb.open();
       usb.work();
       usb.close();
    }
    public void end()
    {
        System.out.println("关机");
    }
}
