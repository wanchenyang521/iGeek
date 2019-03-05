package com.wanchenyang.homework;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:18
 * @description 定义一个含有五个元素的数组, 并为每个元素赋值, 求数组中所有元素的最小值
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
//            随机产生数字并赋值
            arr[i] = random.nextInt(100) + 1;
        }

//        设置临时变量
        int minTemp = arr[0];
        for (int j = 0; j < arr.length; j++)
        {
            if (minTemp > arr[j])
            {
                minTemp = arr[j];
            }
        }
//        打印
        System.out.print("数组为：");
        for (int m = 0; m < arr.length; m++)
        {
            System.out.print(arr[m] + " ");
        }
        System.out.println("\n最小值为：" + minTemp);
    }
}
