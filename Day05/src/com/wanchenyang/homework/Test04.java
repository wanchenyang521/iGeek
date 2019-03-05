package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 16:45
 * @description 主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
 * 并返回这个数组中元素的最小值
 **/
public class Test04
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50,60};
        System.out.println("最小值:"+getMin(arr));
    }

    public static int getMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
}
