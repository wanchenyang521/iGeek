package com.guanka01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:09
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
        HashMap<String,Student08> stringStudentHashMap = new HashMap<>();
        stringStudentHashMap.put("js", new Student08("w", 18));
        stringStudentHashMap.put("bj", new Student08("c", 19));
        stringStudentHashMap.put("nj", new Student08("y", 20));

        stringStudentHashMap.put("js", new Student08("w", 18));
        stringStudentHashMap.put("bj", new Student08("c", 19));
        stringStudentHashMap.put("nj", new Student08("y", 20));


        Set<String> strings = stringStudentHashMap.keySet();
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext())
        {
            String key = stringIterator.next();
            String value = stringStudentHashMap.get(key).toString();
            System.out.println(key+":"+value);
        }
        System.out.println("5.使用entrySet方式遍历Map");
        Set<Map.Entry<String, Student08>> entrySet = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student08>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext())
        {
            System.out.println(entryIterator.next());
        }
    }
}
