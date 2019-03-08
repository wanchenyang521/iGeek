package com.wanchenyang.homework;

import javax.accessibility.AccessibleText;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 20:03
 * @description
 *  1.键盘录入一个字符串
 * 	2.将该字符串变成字符数组(不能使用toCharArray()方法)
 * 	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
 * 	4.如果第一位和最后一位的内容不相同,则交换
 * 	5.将字符数组中索引为偶数的元素变成'~'
 * 	6.打印数组元素的内容
 **/
public class Extend04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String string = scanner.nextLine();
        char[] stringArr = toArray(string);
        toLow(stringArr);
        changeArr(stringArr);
        changOdd(stringArr);
        System.out.println(Arrays.toString(stringArr));


    }
//    将该字符串变成字符数组(不能使用toCharArray()方法)
    public static char[] toArray(String string)
    {
        char[] stringArr = new char[string.length()];
        for (int i = 0; i < string.length(); i++)
        {
            stringArr[i] = string.charAt(i);
        }
        return stringArr;
    }
//    将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
    public static void toLow(char[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>=65&&arr[i]<=90)
            {
                arr[i]+=32;
            }
        }
    }
//    如果第一位和最后一位的内容不相同,则交换
    public static void changeArr(char[] arr)
    {
        if(arr[0]!=arr[arr.length-1])
        {
            char temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }

    }
//    将字符数组中索引为偶数的元素变成'~'
    public static void changOdd(char[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(i%2==0)
            {
                arr[i]='~';
            }
        }
    }


}
