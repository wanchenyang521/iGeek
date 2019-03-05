package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 10:20
 * @description
 **/
public class TestOverload02
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        System.out.println(sum(a,b));
    }

    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
}
