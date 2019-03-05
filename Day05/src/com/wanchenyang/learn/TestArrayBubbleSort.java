package com.wanchenyang.learn;


import java.util.Arrays;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 14:30
 * @description
 * 冒泡排序
 **/
public class TestArrayBubbleSort
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i]=random.nextInt(100);
        }

        System.out.println("原数组:"+Arrays.toString(array));
        bubbbleSort(array);
        System.out.println("新数组:"+Arrays.toString(array));
    }
    public static void bubbbleSort(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j <arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("第"+(i+1)+"次:"+Arrays.toString(arr));
        }
    }
}
