package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 19:29
 * @description
 * 定义一个方法, 求出给定的数字在给定int型数组中出现的次数, 如果一次没有出现则返回0
 * 如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数
 **/
public class Test03
{
    public static void main(String[] args)
    {
        int num = 3;
        int[] arr = {3,4,3,5,7,9};
        System.out.println(num+"出现"+sumNum(arr, num)+"次");
    }
    public static int sumNum(int[] arr,int num)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(num==arr[i])
            {
                sum++;
            }
        }
        return sum;
    }
}
