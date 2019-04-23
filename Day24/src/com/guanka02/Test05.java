package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:53
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hashMap = new HashMap<>();
//        {1="张三丰",2="周芷若",3="汪峰",4="灭绝师太"}
        hashMap.put(1, "张三丰");
        hashMap.put(2, "周芷若");
        hashMap.put(3, "汪峰");
        hashMap.put(4, "灭绝师太");
        Set<Integer> stringSet = hashMap.keySet();
        for (Integer thisSet:
                stringSet)
        {
            System.out.println(thisSet+":"+hashMap.get(thisSet));
        }
        hashMap.put(5, "李晓红");
        hashMap.remove(1);
        hashMap.put(2, "周林");
        Iterator<Integer> iterator = stringSet.iterator();
        while (iterator.hasNext())
        {
            Integer key = iterator.next();
            String value = hashMap.get(key);
            System.out.println(key+":"+value);
        }

    }

}
