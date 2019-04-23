package com.wanchenyang.homework.guanka02;

import java.util.HashSet;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:38
 * @description
 * 向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
 **/
public class Test02
{
    public static void main(String[] args)
    {
//        1.	创建HashSet集合
        HashSet<String> stringHashSet = new HashSet<String>();
//2.	使用add方法往HashSet中添加元素
        stringHashSet.add("张三");
        stringHashSet.add("李四");
        stringHashSet.add("王五");
        stringHashSet.add("二丫");
        stringHashSet.add("钱六");
        stringHashSet.add("孙七");
//3.	使用remove方法删除HashSet中的二丫
        stringHashSet.remove("二丫");
//4.	使用add方法往HashSet中添加王小丫
        stringHashSet.add("王小丫");
        System.out.println(stringHashSet);
    }
}
