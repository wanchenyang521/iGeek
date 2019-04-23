package com.wanchenyang.homework.guanka02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:56
 * @description
 * 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 * 创建一个ArrayList，将数组里面的元素添加进ArrayList，但元素不能重复(使用HashSet去除重复元素)
 **/
public class Test05
{
    public static void main(String[] args)
    {
//        1.	创建arr数组
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
//2.	创建HashSet集合
        HashSet<String> stringHashSet = new HashSet<String>();
//3.	遍历arr数组
//4.	将arr数组中的元素添加进HashSet中.重复的就不会添加进去了
        for (String string:
             arr)
        {
            stringHashSet.add(string);
        }
//5.	创建ArrayList集合,将HashSet的元素添加到ArrayList中
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.addAll(stringHashSet);
//6.	遍历ArrayList打印元素
        for (String string:
                stringArrayList)
        {
            System.out.println(string);
        }
    }
}
