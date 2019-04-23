package com.guanka01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:39
 * @description
 * 往一个Map集合中添加若干元素.获取Map中的所有key, 并使用增强for和迭代器遍历输出每个key
 **/
public class Test03
{
    public static void main(String[] args)
    {
//1.	创建HashMap
        HashMap<String,String> stringStringHashMap = new HashMap<>();
//2.	使用put添加元素
        stringStringHashMap.put("1", "a1");
        stringStringHashMap.put("2", "a2");
        stringStringHashMap.put("3", "a3");
        stringStringHashMap.put("4", "a4");
//3.	使用Map的keySet方法获取到所有的key
        Set<String> stringSet = stringStringHashMap.keySet();
//4.	使用增强for获取每个key
        for (String thisSet:
             stringSet)
        {
            System.out.println(thisSet);
        }
        System.out.println("迭代器");
//5.	获取keySet的迭代器
        Iterator<String> stringIterator = stringSet.iterator();
//6.	循环判断迭代器中是否有下一个元素
        while (stringIterator.hasNext())
        {
            //7.	使用迭代器获取每个key
            System.out.println(stringIterator.next());
        }


    }
}
