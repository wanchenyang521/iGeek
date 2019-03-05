package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 09:31
 * @description
 **/
public class TestMethod03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(compare(num1,num2));


    }
    public static boolean compare(int num1,int num2)
    {
        if(num1==num2)
        {
            return true;
        }
        return false;
    }
}
