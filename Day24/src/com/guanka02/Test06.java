package com.guanka02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 16:03
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String temp = scanner.nextLine();
        char[] tempArr = temp.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        Set<Character> characters = hashMap.keySet();
        for (int i = 0; i < tempArr.length; i++)
        {
            char c = tempArr[i];
            if(hashMap.size()==0)
            {
                hashMap.put(c, 1);
            }
            else
            {
                boolean flag = false;
                Iterator<Character> iterator = characters.iterator();
                while (iterator.hasNext())
                {
                    char hashMapC = iterator.next();
                    if(String.valueOf(c).equals(String.valueOf(hashMapC)))
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
                    hashMap.put(c, hashMap.get(c)+1);
                }
                else
                {
                    hashMap.put(c, 1);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext())
        {
            char key = iterator.next();
            int value = hashMap.get(key);
            String temps = key+"("+value+") ";
            stringBuilder.append(temps);
        }
        System.out.println(stringBuilder);
    }
}
