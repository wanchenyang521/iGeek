package com.homework.guanka01;

import java.util.Scanner;

import static com.learn.Test14.jiechen;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:01
 * @description
 **/
public class Test10
{
    public static void main(String[] args)
    {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        System.out.println(jiechen(temp));
    }
    public static int jiechen(int i)
    {
        if(i==1)
        {
            return 1;
        }
        return i*jiechen(i-1);
    }

}
