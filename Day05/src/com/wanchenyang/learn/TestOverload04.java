package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 10:50
 * @description
 **/
public class TestOverload04
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println("3a "+a+" b "+b);
        change(a,b);
        System.out.println("4a "+a+" b "+b);
    }
    public static void change(int a,int b)
    {
        System.out.println("1a="+a+" b="+b);
        a=b;
        b=a+b;
        System.out.println("2a="+a+" b="+b);

    }
}
