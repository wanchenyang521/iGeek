package com.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:02
 * @description
 * 递归
 **/
public class Test13
{
    static int i = 1;
    public static void main(String[] args)
    {
        methodA();
    }

    private static void methodA()
    {
        System.out.println("方法A"+i);
        i++;
        methodB();
        i++;
        System.out.println("方法A"+i);
    }

    private static void methodB()
    {
        System.out.println("方法B"+i);
        i++;
        methodC();
        i++;
        System.out.println("方法B"+i);
    }

    private static void methodC()
    {

    }
}
