package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 15:37
 * @description
 * 递归
 * 自己调用自己
 * 阶乘
 **/
public class TestRecursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }
    public static int factorial(int n)
    {
        if (n==0)
            return 1;
        return n*factorial(n-1);
    }



}
