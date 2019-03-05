package com.wanchenyang.learn;

import javax.sound.midi.Soundbank;
import java.nio.channels.NonWritableChannelException;
import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 11:25
 * @description
 **/
public class TestOverload07
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
        System.out.println(addArray(arr));

    }

    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static int addArray(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
