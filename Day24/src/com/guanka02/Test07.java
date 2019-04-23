package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 16:43
 * @description
 **/
public class Test07
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s = scanner.nextLine();
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("字母", 0);
        hashMap.put("空格", 0);
        hashMap.put("数字", 0);
        hashMap.put("其他", 0);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if(String.valueOf(chars[i]).matches("[A-Za-z]+"))
            {
                countingKey(hashMap,"字母");
            }
            else if(String.valueOf(chars[i]).matches("\\s+"))
            {
                countingKey(hashMap,"空格");
            }
            else if(String.valueOf(chars[i]).matches("\\d+"))
            {
                countingKey(hashMap,"数字");
            }
            else
            {
                countingKey(hashMap,"其他");
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
