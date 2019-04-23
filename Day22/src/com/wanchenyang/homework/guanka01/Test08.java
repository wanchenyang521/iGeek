package com.wanchenyang.homework.guanka01;

import java.util.Iterator;
import java.util.LinkedHashSet;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:26
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
//        1.	创建LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
//2.	使用add方法添加元素到LinkedHashSet
        linkedHashSet.add("1");
        linkedHashSet.add("12");
        linkedHashSet.add("13");
//3.	使用迭代器获取LinkedHashSet中的元素
        Iterator<String> stringIterator = linkedHashSet.iterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringIterator.next());
        }
        System.out.println("----------------------");
//4.	使用增强for获取LinkedHashSet中的元素
        for (String string:
             linkedHashSet)
        {
            System.out.println(string);
        }
    }
}
