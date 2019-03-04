package com.wanchenyang.learn;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 10:43
 * @description 数组最大值
 **/
public class TestArray04
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100) + 1;
        }
        int maxTemp = arr[0];
        int minTemp = arr[0];
        for (int j = 0; j < arr.length; j++)
        {
            if (maxTemp <= arr[j])
            {
                maxTemp = arr[j];
            }
            if (minTemp >= arr[j])
            {
                minTemp = arr[j];
            }
        }
        for (int m = 0; m < arr.length; m++)
        {
            System.out.print(arr[m] + "\t");
        }
        System.out.println("\n最大值：" + maxTemp);
        System.out.println("最小值：" + minTemp);
    }
}
