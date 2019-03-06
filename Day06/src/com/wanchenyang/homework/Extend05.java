package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 20:43
 * @description
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
 * 定义一个方法求出这个数列的前20 项之和。
 **/
public class Extend05
{
    public static void main(String[] args)
    {
        System.out.println("结果为"+printSum());
    }
    public static double printSum()
    {
        double[] fenzi = new double[20];
        double[] fenmu = new double[20];
        double result = 0;
        fenzi[0] = 2;
        fenzi[1] = 3;
        fenmu[0] = 1;
        fenmu[1] = 2;
        for (int i = 2 ; i < 20 ; i++)
        {
            fenzi[i] = fenzi[i-1]+fenzi[i-2];
            fenmu[i] = fenmu[i-1]+fenmu[i-2];
        }
        for (int i = 0; i < 20; i++)
        {
            result += fenzi[i]/fenmu[i];
        }
        return result;

    }
}
