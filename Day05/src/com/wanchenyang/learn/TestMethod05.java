package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 09:45
 * @description
 * 写一个方法，传递一个整数大于1，在控制台打印1到该数值
 **/
public class TestMethod05
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int num = scanner.nextInt();
//        程序健壮性，输入值大于1限制。
        printNum(num);
    }
    public static void printNum(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.print(i+" ");
        }
    }
}
