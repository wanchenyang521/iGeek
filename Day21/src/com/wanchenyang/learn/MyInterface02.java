package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 09:51
 * @description
 **/
public class MyInterface02<T> implements  MyInterfaceType02<T>
{


    @Override
    public void method(T t)
    {
        System.out.println(t);
    }
}
