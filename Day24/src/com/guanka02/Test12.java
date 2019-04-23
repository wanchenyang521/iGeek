package com.guanka02;

import java.util.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:06
 * @description
 **/
public class Test12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Double> hashMap = new HashMap<>();
        while (hashMap.size()<5)
        {
            System.out.println("请输入书名");
            String name = scanner.nextLine();
            System.out.println("请输入价格");
            Double score = scanner.nextDouble();
            scanner.nextLine();
            hashMap.put(name, score);
        }
        hashMap.remove("C++");
        hashMap.put("Java", (Double) (hashMap.get("Java")+38.5));
        Set<String> stringSet = hashMap.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            double value = hashMap.get(key);
            System.out.println(key+":"+value);
        }

        Set<Map.Entry<String, Double>> entries = hashMap.entrySet();
        for (Map.Entry<String, Double> entrySets:
                entries)
        {
            String key = entrySets.getKey();
            Double value = entrySets.getValue();
            System.out.print(key+":");
            System.out.println(value);
        }

    }
}
