package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-01 09:36
 * @description
 * 在调用泛型方法，并且传入实参的时候才能确定方法上形象的类型
 * 修饰符<T,Q....>
 **/
public class MyClassType02
{
    public<T> void method(T t)
    {
        System.out.println(t);
    }
}
