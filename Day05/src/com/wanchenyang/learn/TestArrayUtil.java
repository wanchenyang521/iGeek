package com.wanchenyang.learn;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 14:21
 * @description
 *
 **/
public class TestArrayUtil
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] array = {1,2,3,4};
//        遍历数组
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++)
        {
            array2[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(array2));
        Arrays.parallelSort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
