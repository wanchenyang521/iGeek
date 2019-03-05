package com.wanchenyang.homework;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:26
 * @description
 * 定义一个长度为3的一维数组, 给每个元素赋值.
 * (要求数组中每个元素的值是0-9的随机数)
 * 遍历数组打印每个元素的值
 **/
public class Test02
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
