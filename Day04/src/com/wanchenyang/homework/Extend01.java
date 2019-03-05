package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:39
 * @description 看程序说结果，请不要提前运行？
 **/
public class Extend01
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] temp1 = arr1;
        int[] temp2 = arr1;


        System.out.println("通过temp1取出数组值: ");
        for (int i = 0; i < temp1.length; i++)
        {
            System.out.print(temp1[i] + " ");
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: ");
        for (int i = 0; i < temp2.length; i++)
        {
            System.out.print(temp2[i] + " ");
        }
        System.out.println();
        temp1[2] = 9;

        System.out.println("通过temp1取出数组值: ");
        for (int i = 0; i < temp1.length; i++)
        {
            System.out.print(temp1[i] + " ");
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: ");
        for (int i = 0; i < temp2.length; i++)
        {
            System.out.print(temp2[i] + " ");
        }
        System.out.println();

    }
}
