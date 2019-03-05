package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 16:27
 * @description
 * 定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
 * 如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
 * 如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字（大于3）");
        int num = scanner.nextInt();
        printNum(num);
    }

    public static void printNum(int num)
    {
        for (int i = 0; i <= num; i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
