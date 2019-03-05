package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 09:09
 * @description
 **/
public class TestMethod02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num1");
        int num1 = scanner.nextInt();
        System.out.println("请输入num2");
        int num2 = scanner.nextInt();
        TestMethod02 testMethod02 = new TestMethod02();
        System.out.println("最大值：");
        System.out.println(testMethod02.maxValue(num1,num2));

    }
    int maxValue(int num1,int num2)
    {
        return (num1>num2)?num1:num2;
    }
}
