package com.wanchenyang.exception;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 08:50
 * @description
 **/
public class ArrayIndex
{
    public static void main(String[] args)
    {
        int[] a = new int[10];
        try
        {
            a[10] = 10;
            System.out.println("hee");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Good night");


    }
}
