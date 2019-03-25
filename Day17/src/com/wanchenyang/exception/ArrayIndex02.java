package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 09:03
 * @description
 * throw e; 抛出异常
 * 异常：
 **/
public class ArrayIndex02
{
    public static void f()
    {
        int[] a = new int[10];
        a[10] = 10;
        System.out.println(a[10]);
    }
    public static void g()
    {

        f();
    }
    public static void h()
    {
       int i = 10;
       if(i<100)
       {
           g();
       }

    }

    public static void k()
    {
        try
        {
            h();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("k()");
//            抛出异常
            throw e;
        }
    }




    public static void main(String[] args)
    {
        try
        {
            k();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
//            抛出异常
//            throw e;
        }
        System.out.println("hello");
    }
}
