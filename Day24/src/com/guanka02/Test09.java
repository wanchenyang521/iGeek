package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 19:38
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String stringScanner = scanner.nextLine();
        String[] strings = stringScanner.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++)
        {
            countingKey(map, strings[i]);
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
