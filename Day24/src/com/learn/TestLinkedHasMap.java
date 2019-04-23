package com.learn;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 09:15
 * @description
 **/
public class TestLinkedHasMap
{
    public static void main(String[] args)
    {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("a", "1");
        linkedHashMap.put("b", "2");
        linkedHashMap.put("c", "3");
        linkedHashMap.put("d", "4");
        System.out.println(linkedHashMap);
        Set<String> stringSet = linkedHashMap.keySet();
        for (String key:
             stringSet)
        {
            System.out.print(key+":");
            System.out.println(linkedHashMap.get(key));
        }
    }
}
