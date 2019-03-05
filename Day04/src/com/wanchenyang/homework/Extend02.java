package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 16:43
 * @description
 * 看程序说结果，请不要提前运行？
 **/
public class Extend02
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7};
        int[] temp = arr1;

        System.out.println("通过temp取出arr1中的元素: ");

        for(int i = 0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }

        temp = arr2;

        System.out.println("通过temp取出arr2中的元素: ");

        for(int i = 0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }

    }
}
