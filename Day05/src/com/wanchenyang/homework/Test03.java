package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 16:35
 * @description
 * 有如下数组int[] arr={10,20};
 * 定义一个方法求两个数字的和(方法参数为两个int类型),使用这个方法求出数组这两个元素相加的结果并打印
 **/
public class Test03
{
    public static void main(String[] args)
    {
        int[] arr={10,20};
        System.out.println("求和为:"+sumArray(arr, arr.length));
    }

    public static int sumArray(int[] arr,int length)
    {
        if(length == 1)
        {
            return arr[0];
        }
        else
        {
            return arr[length-1]+sumArray(arr, --length);
        }
    }

}
