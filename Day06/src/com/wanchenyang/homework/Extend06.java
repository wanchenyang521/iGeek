package com.wanchenyang.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 20:54
 * @description
 * 1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数， [1,2][1,2]
 * 	2.定义一个方法，传入两个数组，方法中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
 * 		如果没有则输出"对不起两个数组的所有元素均相同"
 **/
public class Extend06
{
    public static void main(String[] args)
    {

        int[] arr1 = getArr();
        int[] arr2 = getArr();
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {1,2,3,4};
//        int[] arr2 = {1,2,3};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        printString(arr1,arr2);

    }


    public static String lookFor(int[] arr1,int[] arr2)
    {
        String s ="";
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i]!=arr2[j])
                {
                    if(j==arr2.length-1)
                    {
                        s+=arr1[i];
                    }

                }
                else
                {
                    break;
                }
            }
        }
        return s;

    }
    public static void printString(int[] arr1,int[] arr2)
    {
        String s ="";
        s+=lookFor(arr1, arr2);
        s+=lookFor(arr2, arr1);
        if(s.length()==0)
        {
            System.out.println("对不起两个数组的所有元素均相同");
        }
        else
        {
            System.out.println(s);
            System.out.println("字符串的长度"+s.length());;
        }




    }




    public static int[] getArr()
    {
        Random random = new Random();
        int randomNum;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            randomNum=random.nextInt(100)+1;
            for (int j = 0; j < 10; j++)
            {
                if(randomNum==arr[i])
                {
                    continue;
                }
            }
            arr[i] = randomNum;
        }
        return arr;
    }
}
