package com.learn.test01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 08:51
 * @description
 **/
public class TestComputer
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.begin();
        computer.useUsb(new Mouse());
        computer.useUsb(new KeyBoard());
        computer.end();
    }
}
