package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 10:05
 * @description 两个数组指向同一个地址
 **/
public class TestArray02
{
    public static void main(String[] args)
    {
        int[] arr = new int[6];
        int[] arr2 = arr;
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        arr2[2]=66;
        System.out.println(arr[2]);
        System.out.println(arr2[2]);
    }
}
