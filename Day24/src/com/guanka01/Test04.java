package com.guanka01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:44
 * @description
 * 往一个Map集合中添加若干元素.获取Map中的所有value, 并使用增强for和迭代器遍历输出每个value
 **/
public class Test04
{
    public static void main(String[] args)
    {
//        1.	创建HashMap
        HashMap<String,String> stringStringHashMap = new HashMap<>();
//2.	使用put添加元素
        stringStringHashMap.put("1", "a1");
        stringStringHashMap.put("2", "a2");
        stringStringHashMap.put("3", "a3");
        stringStringHashMap.put("4", "a4");
//3.	使用Map的values方法获取到所有的value
        Collection<String> values = stringStringHashMap.values();
//4.	使用增强for获取每个value
        for (String thisValues:
             values)
        {
            System.out.println(thisValues);
        }
        System.out.println("迭代器");
//5.	使用迭代器获取每个value
        Iterator<String> stringIterator = values.iterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringIterator.next());
        }
    }
}
