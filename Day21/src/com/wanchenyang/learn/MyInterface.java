package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 09:42
 * @description
 * 定义类的时候，就指定接口中的数据类型的定义
 **/
public class MyInterface implements MyInterfaceType<String>
{
    @Override
    public void method(String s)
    {
        System.out.println(s);
    }

}
