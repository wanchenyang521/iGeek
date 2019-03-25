package com.wanchenyang.Interface;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-21 11:19
 * @description
 **/
public class MyInterfaceClass implements MyInterface
{

    @Override
    public void method()
    {
        System.out.println("子类重写");
    }
}
