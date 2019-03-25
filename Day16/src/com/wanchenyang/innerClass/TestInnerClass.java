package com.wanchenyang.innerClass;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 14:10
 * @description
 **/
public class TestInnerClass
{
    public static void main(String[] args)
    {
        NestClass.InnerClass x = new NestClass().new InnerClass();
        x.innerMethod();

    }
}
