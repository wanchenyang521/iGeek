package com.learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 08:49
 * @description
 * 遍历
 **/
public class TestMap02
{
    public static void main(String[] args)
    {
        HashMap<String,String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("姓名", "wcy");
        stringStringHashMap.put("年龄", "18");
        stringStringHashMap.put("性别", "male");

//        获取所有键的集合
        System.out.println("Set<String> stringSet");
        Set<String> stringSet = stringStringHashMap.keySet();
        System.out.println(stringSet);

        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringStringHashMap.get(stringIterator.next()));
        }


        System.out.println("Set<Entry<String, String>>");
        Set<Entry<String, String>> entrySet = stringStringHashMap.entrySet();
        for (Entry<String, String> entrySets:
             entrySet)
        {
            String key = entrySets.getKey();
            String value = entrySets.getValue();
            System.out.print(key+":");
            System.out.println(value);
        }


    }
}
