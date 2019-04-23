package com.homework.guanka01;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:57
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        System.out.println(sum(temp));
    }

    private static int sum(int temp)
    {
        if(temp==1)
        {
            return 1;
        }
        return temp+sum(temp-1);

    }
}
