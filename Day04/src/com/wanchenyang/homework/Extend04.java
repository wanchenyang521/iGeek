package com.wanchenyang.homework;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:52
 * @description
 * 1.键盘录入班级人数
 * 	2.根据录入的班级人数创建数组
 * 	3.利用随机数产生0-100的成绩(包含0和100)
 * 	4.要求:
 * 		(1)打印该班级的不及格人数
 * 		(2)打印该班级的平均分
 * 		(3)演示格式如下:
 * 			请输入班级人数:
 * 			键盘录入:100
 * 			控制台输出:
 * 				不及格人数:19
 * 				班级平均分:87
 **/
public class Extend04
{
    public static void main(String[] args)
    {
//        1.键盘录入班级人数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入班级人数:");
        int num = input.nextInt();
//        2.根据录入的班级人数创建数组
        int[] arr = new int[num];
//        3.利用随机数产生0-100的成绩(包含0和100)
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=random.nextInt(101);
        }
//        (1)打印该班级的不及格人数
//        (2)打印该班级的平均分
        int failStudent = 0;
        int sum = 0;
        int average;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<60)
            {
                failStudent++;
            }
            sum+=arr[i];
        }
        average = sum/arr.length;
        System.out.println("不及格人数："+failStudent);
        System.out.println("平均分："+average);
//        显示全部成绩
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i]+" ");
//            if((i+1)%10==0)
//            {
//                System.out.println();
//            }
//        }



    }
}
