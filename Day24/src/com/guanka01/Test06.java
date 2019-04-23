package com.guanka01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:52
 * @description
 * Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”, “谢霆锋”->”张柏芝”.使用Entry方式迭代出Map集合中的元素
 **/
public class Test06
{
    public static void main(String[] args)
    {
//        1.	创建HashMap
        HashMap<String,String> stringStringHashMap = new HashMap<>();
//2.	使用put方法添加元素
        stringStringHashMap.put("邓超","孙俪");
        stringStringHashMap.put("李晨","范冰冰");
        stringStringHashMap.put("刘德华","柳岩");
        stringStringHashMap.put("黄晓明","Baby");
        stringStringHashMap.put("谢霆锋","张柏芝");
//3.	使用entrySet方法获取到所有的键值对关系
        Set<Map.Entry<String, String>> entrySet = stringStringHashMap.entrySet();
//4.	获取entrySet的迭代器
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
//5.	使用迭代器查看是否有下一个元素
//6.	使用迭代器拿到下一个元素(Entry类型)
        while (entryIterator.hasNext())
        {
            Map.Entry<String, String> thisEntry = entryIterator.next();
            System.out.println(thisEntry);
        }
//7.	通过一个Entry<K,V>获取到key和value
    }
}
