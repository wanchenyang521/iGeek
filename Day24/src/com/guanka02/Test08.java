package com.guanka02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 19:31
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("abc");
        stringArrayList.add("bcd");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < stringArrayList.size(); i++)
        {
            String temp = stringArrayList.get(i);
            char[] c = temp.toCharArray();
            for (int j = 0; j < c.length; j++)
            {
                countingKey(map, String.valueOf(c[j]));
            }
        }
        System.out.println(map);


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
