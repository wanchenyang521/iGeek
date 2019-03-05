package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 19:10
 * @description 分析以下需求，并用代码实现
 * 1.定义一个方法equals(int[] arr1,int[] arr2)
 * 功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
 * 2.定义一个方法fill(int[] arr,int value)
 * 功能:将数组arr中的所有元素的值改为value
 * 3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
 * 功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
 * 4.定义一个方法copyOf(int[] arr, int newLength)
 * 功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
 * 5.定义一个方法copyOfRange(int[] arr,int from, int to)
 * 功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中,并将新数组返回
 **/
public class Extend03
{

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};
        int[] arr5 = {7, 8, 9};
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr7 = new int[10];
        int[] arr8 = new int[10];
        System.out.println("equals()" + equals(arr, arr2));
        System.out.println("equals()" + equals(arr, arr3));
        System.out.println("equals()" + equals(arr, arr4));
        fill(arr5, 6);
        System.out.println("fill()" + Arrays.toString(arr5));
        fill(arr6, 5, 7, 6);
        System.out.println("fill()" + Arrays.toString(arr6));
        arr7 = copyOf(arr6, 2);
        System.out.println("copyOf()" + Arrays.toString(arr7));
        arr8 = copyOfRange(arr6, 4, 6);
        System.out.println("copyOfRange()" + Arrays.toString(arr8));
    }


    //1.定义一个方法equals(int[] arr1,int[] arr2)
//  功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
    public static boolean equals(int[] arr1, int[] arr2)
    {
        return Arrays.equals(arr1, arr2);
    }

    //2.定义一个方法fill(int[] arr,int value)
//  功能:将数组arr中的所有元素的值改为value
    public static void fill(int[] arr, int value)
    {
        Arrays.fill(arr, value);
    }

    //3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
//      功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
    public static void fill(int[] arr, int fromIndex, int toIndex, int value)
    {
        Arrays.fill(arr, fromIndex, toIndex, value);
    }

    // 4.定义一个方法copyOf(int[] arr, int newLength)
//      功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
    public static int[] copyOf(int[] arr, int newLength)
    {
        return Arrays.copyOf(arr, newLength);
    }

    // 5.定义一个方法copyOfRange(int[] arr,int from, int to)
//      功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中,并将新数组返回
    public static int[] copyOfRange(int[] arr, int from, int to)
    {
        return Arrays.copyOfRange(arr, from, to);
    }
}
