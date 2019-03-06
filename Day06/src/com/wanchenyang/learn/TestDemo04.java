package com.wanchenyang.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 15:49
 * @description
 * 平分系统
 * 6人
 * 去掉最高分、最低分、其余四人平均值
 **/
public class TestDemo04
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入6位成绩：");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("成绩:"+Arrays.toString(arr));
        System.out.println("平均成绩："+getAverage(arr));


    }
    public static double getAverage(Integer[] arr)
    {
        double result;
        int sum = sum(arr, arr.length);
        double value = getValue(arr);
        result = (sum-value)/(arr.length-2);
        return result;
    }

    public static int getValue(Integer[] arr)
    {
        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("最小值："+min);
        System.out.println("最大值："+max);
        return min+max;
    }

    public static int sum(Integer arr[], int n)
    {
        if(n == 1)
        {
            return arr[0];
        }
        else
        {
            return arr[n-1] + sum(arr, --n);
        }
    }

}
