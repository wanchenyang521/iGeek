package com.wanchenyang.homework.guanka02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:27
 * @description
 * 有2个ArrayList,
 * 元素如下:
 * array1 = "a","b","a","c","d",
 * array2 = "e","f","a","d","g",
 * 将两个集合重复项去除后合并成一个集合
 **/
public class Test10
{
    public static void main(String[] args)
    {
//        1.	创建ArrayList array1
        String[] arr1 = {"a","b","a","c","d"};
        ArrayList<String> array1 = new ArrayList<String>(Arrays.asList(arr1));//2.	使用add方法为array1存放对应的元素
//3.	创建ArrayList array2//4.	使用add方法为array2存放对应的元素
        String[] arr2 = {"e","f","a","d","g"};
        ArrayList<String> array2 = new ArrayList<String>(Arrays.asList(arr2));
//5.	创建HashSet用于存放去除重复的元素
        HashSet<String> stringHashSet = new HashSet<String>();
//6.	遍历array1,获取到每个元素,将每个元素添加到HashSet中
        for (String temp:
             array1)
        {
            stringHashSet.add(temp);
        }
//7.	遍历array2,获取到每个元素,将每个元素添加到HashSet中
        for (String temp:
                array2)
        {
            stringHashSet.add(temp);
        }
//8.	输出HashSet中去除重复后的元素
        System.out.println(stringHashSet);
    }
}
