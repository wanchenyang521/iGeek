package com.wanchenyang.learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 16:30
 * @description
 * 反转数组
 **/
public class TestDemo05
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {1,2,3,4,5,6};
        List list = Arrays.asList(arr2);
        Collections.reverse(list);
        System.out.println("Collections："+list);

        int[] arr3 = {1,2,3,4,5,6};


    }
    public static void reverseArr(int[] arr)
    {
        int temp;
//        for (int i = 0 j = arr.length-1; i <=j; i++,j--)
        for (int i = 0; i < arr.length/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

    }
}
