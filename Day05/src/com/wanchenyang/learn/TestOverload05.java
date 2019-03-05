package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 10:59
 * @description
 * 引用类型
 **/
public class TestOverload05
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("1111111");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        change(arr);
        System.out.println();
        System.out.println("33333");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void change(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                arr[i] *= 2;
            }
        }
        System.out.println("22222222");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
