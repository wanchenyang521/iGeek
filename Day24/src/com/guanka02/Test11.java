package com.guanka02;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 19:55
 * @description
 **/
public class Test11
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("赵四",21);
        hashMap.put("王二",17);
        hashMap.put("张三",21);

        Set<String> stringSet = hashMap.keySet();
//        for (String thisSet:
//                stringSet)
//        {
//            System.out.println(thisSet+":"+hashMap.get(thisSet));
//        }
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            Integer value = hashMap.get(key);
            System.out.println(key+":"+value);
        }

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entrySets:
                entries)
        {
            String key = entrySets.getKey();
            Integer value = entrySets.getValue();
            System.out.print(key+":");
            System.out.println(value);
        }

        hashMap.put("赵四", 18);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day24\\src\\com\\guanka02\\student.txt"));
        Set<Map.Entry<String, Integer>> entries2 = hashMap.entrySet();
        for (Map.Entry<String, Integer> entrySets:
                entries2)
        {
            String key = entrySets.getKey();
            Integer value = entrySets.getValue();
           bufferedWriter.write(key+","+value);
           bufferedWriter.newLine();
           bufferedWriter.flush();
        }
        bufferedWriter.close();

    }
}
