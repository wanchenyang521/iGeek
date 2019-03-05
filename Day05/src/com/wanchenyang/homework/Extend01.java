package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 18:57
 * @
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};
 * 这个数组没有重复元素.
 * 定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 **/
public class Extend01
{
    public static void main(String[] args)
    {
        int[] arr= {10,20,30,40,50,60};
        System.out.println("最大元素值的索引值"+getLocation(arr));
    }
    public static int getLocation(int[] arr)
    {
        int location = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[location]<arr[i])
            {
                location=i;
            }
        }
        return location;
    }
}
