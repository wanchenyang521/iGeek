package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:30
 * @description
 * 已知数组int[] nums = {5,10,15},,要求创建一个新数组
 * 1.新数组的长度和已知数组相同
 * 2.新数组每个元素的值 是已知数组对应位置元素的2倍
 * 3.在控制台中打印新数组的所有元素
 **/
public class Test03
{
    public static void main(String[] args)
    {
        int[] nums = {5,10,15};
        int[] arr = new int[nums.length];
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = nums[i]*2;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
