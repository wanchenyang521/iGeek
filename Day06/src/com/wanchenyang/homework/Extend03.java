package com.wanchenyang.homework;

import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-06 20:24
 * @description
 * 分析以下需求，并用代码实现
 * 	1.键盘录入6个int类型的数据存数数组arr中
 * 	2.将arr数组中的内容反转
 * 	3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
 * 	4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
 * 	5.打印最终的数组(实现了1-4步之后的数组)
 * 	6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
 **/
public class Extend03
{

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        reverseArr(arr);
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
//    将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
    public static void changeArr(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            if(i%2==1&&i<5)
            {
                temp = arr[i];
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
        }
//        最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
        temp = arr[1];
        arr[1] = arr[5];
        arr[5] = temp;

    }
//    实现反转
    public static void reverseArr(int[] arr)
    {
        int temp;
        for (int i = 0; i < arr.length/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
