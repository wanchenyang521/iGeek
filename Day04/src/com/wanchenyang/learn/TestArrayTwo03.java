package com.wanchenyang.learn;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 14:11
 * @description
 **/
public class TestArrayTwo03
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[][] arr = new int[3][3];
        int[][] arr2 = {{1},{1,2}};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = random.nextInt(100)+1;
            }
        }

//        int[][] arr3 = new int[3][3];
//        arr3 = {{1,2,3},{1,2,3},{1,2,3}};


        for (int m = 0; m < arr.length; m++)
        {
            for (int n = 0; n < arr[m].length; n++)
            {
                System.out.print(arr[m][n]+"\t");
            }
            System.out.println();
        }


    }
}
