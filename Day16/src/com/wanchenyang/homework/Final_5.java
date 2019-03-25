package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:36
 * @description
 * 验证:修饰成员变量，需要在创建对象前赋值，否则报错。
 * (当没有显式赋值时，多个构造方法的均需要为其赋值。
 **/
public class Final_5
{
    final int a = 10;
    final int b;
//    i.	提示The blank final field b may not have been initialized,被final修饰的成员变量可能没有被赋值

    public Final_5()
    {
        b=20;
    }

    public Final_5(int b)
    {
        this.b = b;
    }
//    被final修饰成员变量只能赋值一次
}
