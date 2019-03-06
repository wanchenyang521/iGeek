package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 19:35
 * @description
 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
 **/
public class Test04
{

    public static void main(String[] args)
    {
        int[] arr ={1,2,3,2};
        int key1 = 2;
        int key2 = 5;
        System.out.println("key:2");
        getLocation(arr, key1);
        System.out.println("\nkey:5");
        getLocation(arr, key2);


    }

    public static void getLocation(int[] arr,int key)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==key)
            {
                count++;
                System.out.print(i+" ");
            }
        }
        if(count==0)
        {
            System.out.println("数组中没有这个数字");
        }
    }




}
