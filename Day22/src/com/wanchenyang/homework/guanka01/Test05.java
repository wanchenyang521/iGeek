package com.wanchenyang.homework.guanka01;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:07
 * @description
 * 往HashSet中添加字符串
 * "zhangsan", "lisi", "wangwu", "zhangsan".
 * 使用迭代器获取HashSet中的元素
 **/
public class Test05
{
    public static void main(String[] args)
    {
//        1.	创建HashSet集合
        HashSet<String> stringHashSet = new HashSet<String>();
//2.	使用add方法往HashSet添加元素
        stringHashSet.add("zhangsan");
        stringHashSet.add("lisi");
        stringHashSet.add("wangwu");
        stringHashSet.add("zhangsan");
//3.	使用迭代器获取HashSet中的元素
        Iterator<String> stringIterator = stringHashSet.iterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringIterator.next());
        }

    }
}
