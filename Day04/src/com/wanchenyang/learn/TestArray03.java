package com.wanchenyang.learn;

import javax.sound.midi.Soundbank;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 10:35
 * @description
 **/
public class TestArray03
{
    public static void main(String[] args)
    {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int j :
                arr)
        {
            System.out.print(j);
        }
        System.out.println();
        for (int m = 0; m < arr2.length; m++)
        {
            arr2[m] = m + 1;
        }
        for (int n = 0; n <arr2.length; n++)
        {
            System.out.print(arr2[n]);
        }

    }
}
