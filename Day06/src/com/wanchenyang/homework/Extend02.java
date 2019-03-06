package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 20:07
 * @description
 * 定义一个方法传入一个int类型数组，输出这个数组中每一个数字及其出现的个数
 * 	例如 传入数组[1,2,2,2,3,3,4,4,4,4]  打印结果：
 * 	数字1出现了1次
 * 	数字2出现了3次…
 **/
public class Extend02
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入10个数");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("数组:"+ Arrays.toString(arr));
        printArr(arr);
    }



    public static void printArr(int[] arr)
    {
        int min = minValue(arr);
        int max = maxValue(arr);
        int count = 0;
        while (min<=max)
        {
            for (int i = 0;i< arr.length;i++)
            {
                if(min==arr[i])
                {
                    count++;
                }
            }
            if(count!=0)
            {
                System.out.println("数字"+min+"出现了"+count+"次");
            }
            min++;
            count=0;
        }
    }



    public static int maxValue(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minValue(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

}
