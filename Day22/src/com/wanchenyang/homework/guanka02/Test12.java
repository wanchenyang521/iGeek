package com.wanchenyang.homework.guanka02;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:44
 * @description
 * 定义一个方法filterChars(ArrayList<String> list)
 * 将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,
 * 比如list有2个元素{"hello123java", "11world555java"}，返回结果{"123", "11555"}
 **/
public class Test12
{
    public static void main(String[] args)
    {
//        1.	定义ArrayList strs存放元素
        ArrayList<String> stringArrayList = new ArrayList<String>();
//2.	使用add方法往ArrayList中添加元素,元素包含字母和数字
        stringArrayList.add("hello123java");
        stringArrayList.add("11world555java");

//7.	调用filterChars方法
        filterChars(stringArrayList);
        System.out.println(stringArrayList);
    }
//3.	定义filterChars(ArrayList<String> list)方法
//4.	在filterChars方法中使用for循环拿出每个元素
//5.	替换掉字符串中所有的字母
//6.	使用替换后的字符串覆盖原来的字符串
    public static void filterChars(ArrayList<String> list)
    {
        String temp;
        for (int i = 0; i < list.size(); i++)
        {
            temp = list.get(i).replaceAll("[^\\d]", "");
            list.set(i, temp);
        }
    }
}
