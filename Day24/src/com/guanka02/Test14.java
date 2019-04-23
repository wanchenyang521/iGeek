package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:18
 * @description
 **/
public class Test14
{
    public static void main(String[] args)
    {
        String string = "常州极客营,无锡极客营,武汉极客营,镇江极客营,苏州极客营";
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("极客营", 0);
        String[] strings = string.split(",");
        for (int i = 0; i < strings.length; i++)
        {
            if(strings[i].indexOf("极客营")!=-1)
            {
                hashMap.put("极客营",hashMap.get("极客营")+1);
            }
        }
        System.out.println(hashMap);

    }

    public static void countingKey(HashMap<String, Integer> map, String key)
    {
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        if(map.size()==0)
        {
            map.put(key, 1);
        }
        else
        {
            boolean flag = false;

            while (iterator.hasNext())
            {

                if(key.equals(iterator.next()))
                {
                    flag = true;
                    break;
                }
                else
                {
                    flag = false;
                }
            }
            if(flag)
            {
                map.put(key, map.get(key)+1);
            }
            else
            {
                map.put(key, 1);
            }
        }
    }
}
