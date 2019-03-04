package com.wanchenyang.learn;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-04 14:26
 * @description 杨辉三角形
 **/
public class TestArrayTwo04
{
    public static void main(String[] args)
    {
//        动态录入层数
        System.out.println("请输入层数");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] arr = new int[num][num];
        arr[0][0] = 1;
        for(int i = 1; i<arr.length;i++)
        {
            arr[i][0] = 1;
            for (int j = 1; j <arr[i].length ; j++)
            {
//                规律
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }

//        打印三角形
        for (int m = 0; m <arr.length ; m++)
        {
//            打印前边空格
            for(int x =0;x<=10-m;x++ )
            {
                System.out.print(" ");
            }
//            循环打印值
            for (int n = 0; n <arr[m].length ; n++)
            {
//                数组默认值为0，不显示
                if(arr[m][n]==0)
                {
                    continue;
                }
//                打印值
                System.out.print(arr[m][n]+" ");
            }
//            换行控制
            System.out.println();

        }

    }
}
