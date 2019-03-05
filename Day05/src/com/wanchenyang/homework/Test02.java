package com.wanchenyang.homework;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 16:31
 * @description
 * 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
 **/
public class Test02
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int num1 = random.nextInt(100)+1;
        int num2 = random.nextInt(100)+1;
        int result = sum(num1,num2);
        System.out.println(num1+"+"+num2+"="+result);
    }
    public static int sum(int num1,int num2)
    {
        return num1+num2;
    }
}
