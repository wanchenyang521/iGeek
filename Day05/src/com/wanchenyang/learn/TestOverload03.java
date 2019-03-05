package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 10:33
 * @description byte short int long 类型比较相同
 **/
public class TestOverload03
{
    public static void main(String[] args)
    {
        byte a1 = 1;
        byte b1 = 2;

        short a2 = 23;
        short b2 = 23;

        int a3 = 342;
        int b3 = 1342;

        long a4 = 11;
        long b4 = 11;
        System.out.println(isEqual(a1,b1));
        System.out.println(isEqual(a2,b2));
        System.out.println(isEqual(a3,b3));
        System.out.println(isEqual(a4,b4));


    }

    public static boolean isEqual(byte a, byte b)
    {
        if (a == b)
        {
            return true;
        }
        return false;
    }

    public static boolean isEqual(short a, short b)
    {
        if (a == b)
        {
            return true;
        }
        return false;
    }

    public static boolean isEqual(int a, int b)
    {
        if (a == b)
        {
            return true;
        }
        return false;
    }

    public static boolean isEqual(long a, long b)
    {
        if (a == b)
        {
            return true;
        }
        return false;
    }
}
