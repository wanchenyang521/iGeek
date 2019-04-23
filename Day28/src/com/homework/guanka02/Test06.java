package com.homework.guanka02;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:20
 * @description
 *打印流的使用
 * 已知数组int arr[] = {2,3,4,2,4};
 *  	(1)计算出该数组的平均分、最大值、最小值
 *  	(2)并将大于平均分的元素放到当前根目录下number.txt中(使用打印流,以追加的方式添加)
 **/
public class Test06
{
    public static void main(String[] args) throws IOException
    {
        int arr[] = {2,3,4,2,4};
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
            if(max<arr[i])
            {
                max = arr[i];
            }
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        int avg = sum/arr.length;
        PrintWriter printWriter = new PrintWriter
                (new FileWriter("number.txt",true));
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>avg)
            {
                printWriter.println(arr[i]);
            }
        }
        printWriter.close();


    }
}
