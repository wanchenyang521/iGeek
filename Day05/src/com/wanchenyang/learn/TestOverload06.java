package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 11:16
 * @description
 * 遍历数组改为方法实现，并调用方法
 **/
public class TestOverload06
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr);
    }
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {
            if(i==arr.length-1)
            {
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+",");

        }
    }
}
