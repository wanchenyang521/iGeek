package com.wanchenyang.learn;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 09:14
 * @description 数组基本知识点
 * 数据类型[] 数组名
 * 数据类型 数组名[]
 **/
public class TestArray01
{
    public static void main(String[] args)
    {
//        int[] arr;
//        int arr[];
//        初始化
        int[] arr = new int[6];

        int[] arr2 = {1, 2, 3};//简化
        int[] arr3 = new int[]{1,2,3};
        System.out.println(arr3.length);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
        System.out.println(arr2.length);

        arr2[0] = 10;
        System.out.println(arr2[0]);


    }
}
