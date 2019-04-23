package com.guanka01;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:16
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2));


    }


    public static int add(int...arr)
    {
        int sum = 0;
        for (int temp:
             arr)
        {
            sum += temp;
        }
        return sum;
    }
}
