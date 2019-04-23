package com.guanka01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:47
 * @description
 * Map集合中包含5对元素:
 * "邓超"->"孙俪",
 * "李晨"->"范冰冰",
 * "刘德华"->"柳岩",
 * “黄晓明”->” Baby”,
 * "谢霆锋”->”张柏芝”.
 * 使用keySet方式迭代出Map集合中的元素
 **/
public class Test05
{
    public static void main(String[] args)
    {
//        1.	创建HashMap
        HashMap<String,String> stringStringHashMap = new HashMap<>();
//        2.	使用put方法添加元素
        stringStringHashMap.put("邓超","孙俪");
        stringStringHashMap.put("李晨","范冰冰");
        stringStringHashMap.put("刘德华","柳岩");
        stringStringHashMap.put("黄晓明","Baby");
        stringStringHashMap.put("谢霆锋","张柏芝");
//        3.	使用keySet方法获取所有的键
        Set<String> stringSet = stringStringHashMap.keySet();
//        4.	获取到keySet的迭代器
        Iterator<String> stringIterator = stringSet.iterator();
//        5.	循环判断迭代器是否有下一个元素
        while (stringIterator.hasNext())
        {
//        6.	使用迭代器next方法获取到一个键
            String key = stringIterator.next();
//        7.	通过一个键找到一个值
            String value = stringStringHashMap.get(key);
            System.out.println(key+":"+value);

        }
//        8.	输出键和值

    }
}
