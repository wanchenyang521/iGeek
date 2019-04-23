package com.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:05
 * @description
 * 递归求阶乘
 **/
public class Test14
{
    public static void main(String[] args)
    {
        System.out.println(jiechen(5));
        num(1);
    }
    public static int jiechen(int i)
    {
        if(i==1)
        {
            return 1;
        }
        return i*jiechen(i-1);
    }
    public static void num(int i)
    {
        System.out.println(i);
        if(i==10)
        {
           return;
        }
        num(++i);

    }
}
