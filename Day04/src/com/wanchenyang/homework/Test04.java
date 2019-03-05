package com.wanchenyang.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:33
 * @description
 * 键盘录入一个整数，创建一个该长度的数组
 * 为每一个元素赋值为1-10的随机整数
 * 最后打印数组中所有值大于5且为偶数的元素
 **/
public class Test04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入一个数字");
        int temp = input.nextInt();
        int[] arr = new int[temp];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=random.nextInt(10)+1;
        }

//        原数组
        System.out.println("原数组");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n所有值大于5且为偶数的元素");
        for (int i = 0; i < arr.length; i++)
        {
//            所有值大于5且为偶数的元素
            if(arr[i]>5&&arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
