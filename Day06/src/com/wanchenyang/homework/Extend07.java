package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 21:57
 * @description
 * 分析以下需求，并用代码实现
 * 	1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
 * 	2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
 * 		（需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）
 * 	3.将a中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
 **/
public class Extend07
{
    public static void main(String[] args)
    {
        int[] arr = inputArr();
        System.out.println("原数组："+ Arrays.toString(arr));
        int key = locationArr(arr);
        arr = changeArr(arr, key);
        System.out.println("新数组："+ Arrays.toString(arr));





    }
    public static int[] inputArr()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int locationArr(int[] arr)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key：");
        int key = scanner.nextInt();
        if(key<0&&key>9)
        {
            Random random = new Random();
            key = random.nextInt(10);
        }
        return key;
    }
    public static int[] changeArr(int[] arr,int location)
    {
        if(location==0||location==arr.length-1)
        {

        }
        else
        {
            int temp;
            temp = arr[location-1];
            arr[location-1] = arr[location+1];
            arr[location+1] = temp;
        }
        return arr;
    }



}
