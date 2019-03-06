package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 18:43
 * @description
 * 随机产生5个范围是[1,100]的整数,把这些数字中所有个位或十位为3的数字打印出来
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100)+1;
        }
        System.out.println("随机5个数是："+ Arrays.toString(arr));
        System.out.print("个位或十位为3的数字:");
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(getNum(arr[i])!=0)
            {
                System.out.print(arr[i]+" ");
            }
            else
            {
                sum++;
                if(sum==5)
                {
                    System.out.print("无");
                }
            }

        }
    }

    public static int getNum(int num)
    {
        int num1 = num%10;      //个位
        int num2 = num/10%10;   //十位
        if(num1==3||num2==3)
        {
            return num;
        }
        return 0;
    }
}
