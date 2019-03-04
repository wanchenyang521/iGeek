package com.wanchenyang.learn;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 08:50
 * @description 随机数猜数字
 **/
public class TestRandom02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int num = number.nextInt(100)+1;
        System.out.println("随机数"+num);
        int temp;
       while (true)
       {
           System.out.println("请输入数字：");
           temp = input.nextInt();
           if(temp==num)
           {
               System.out.println("正确");
               break;
           }
           else if(temp>num)
           {
               System.out.println("大了");
           }
           else
           {
               System.out.println("小了");
           }


       }
    }
}
