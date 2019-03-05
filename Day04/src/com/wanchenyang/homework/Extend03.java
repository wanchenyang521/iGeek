package com.wanchenyang.homework;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:44
 * @description
 * 将数字1-10保存到一个长度为10的一维数组中
 * 定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
 * 给新数组的元素赋值
 * 求新数组所有元素的和
 **/
public class Extend03
{
    public static void main(String[] args)
    {
//       将数字1-10保存到一个长度为10的一维数组中
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i+1;
        }
//        定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
//        给新数组的元素赋值
        Random random = new Random();
        int[] arr2 = new int[3];
        int num;
        for (int i = 0; i < arr2.length; i++)
        {
            num = random.nextInt(10);
            arr2[i]=arr[num];
        }
//        求新数组所有元素的和
        int sum = 0;
        for (int i = 0; i < arr2.length; i++)
        {
            sum+=arr2[i];
        }
//        打印
        System.out.println("原数组：");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("新数组：");
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("求和为:"+sum);



    }
}
