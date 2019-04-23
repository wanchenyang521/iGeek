package com.wanchenyang.homework.guanka02;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:32
 * @description
 * ArrayList有以下元素:
 * "a","f","b","c","a","d"
 * 利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)
 **/
public class Test01
{
    public static void main(String[] args)
    {
//        1.	创建ArrayList
        ArrayList<String> stringArrayList = new ArrayList<String>();
//2.	使用add方法往ArrayList添加元素
        stringArrayList.add("a");
        stringArrayList.add("f");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("a");
        stringArrayList.add("d");
        System.out.println("stringArrayList:"+stringArrayList);
//3.	创建HashSet.用于将ArrayList中重复的元素去除
        HashSet<String> stringHashSet = new HashSet<String>();
//4.	调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
        stringHashSet.addAll(stringArrayList);
        System.out.println("stringHashSet:"+stringHashSet);
//5.	清空list的所有元素
        stringArrayList.clear();
        System.out.println("清空:"+stringArrayList);
//6.	将set集合中的元素再添加回ArrayList集合
        stringArrayList.addAll(stringHashSet);
        System.out.println(stringArrayList);
    }
}
