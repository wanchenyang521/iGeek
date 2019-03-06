package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 19:52
 * @description
 * 1.键盘录入10个整数存入数组中
 * 	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
 * 	3.定义一个方法打印原数组和处理后的数组
 **/
public class Extend01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        printArr(arr);
    }

    public static void printArr(int[] arr)
    {
        System.out.println("原数组："+ Arrays.toString(arr));
        int[] newArr = getArr(arr);
        System.out.println("处理数组："+ Arrays.toString(newArr));
    }

    public static int[] getArr(int[] arr)
    {
        int[] arrNew = new int[arr.length];
        int count = 0;
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]%2==1)
            {
                arrNew[count++] = arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]%2==0)
            {
                arrNew[count++] = arr[i];
            }
        }
        return arrNew;
    }
}

