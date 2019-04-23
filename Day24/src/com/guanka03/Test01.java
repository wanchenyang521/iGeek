package com.guanka03;

import javax.xml.stream.FactoryConfigurationError;
import java.util.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:25
 * @descriptio
 * Map中有{张三=3,李四=4,王五=5,赵六=6,孙七=7,田七=7,周八=5}这些元素.
 * 将Map中value相同的元素从Map中去除(value为7和5是相同的,都要删除).
 * 再将Map中剩余元素的key存放到一个ArrayLis中,并打印到控制台上
 **/
public class Test01
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("张三", 3);
        hashMap.put("李四", 4);
        hashMap.put("王五", 5);
        hashMap.put("赵六", 6);
        hashMap.put("孙七", 7);
        hashMap.put("田七", 7);
        hashMap.put("周八", 5);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entrySets:
                entries)
        {
            Integer value = entrySets.getValue();
            arrayList.add(value);
        }

        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
        {
            boolean flag = false;
            int value = arrayList.get(i);
            for (int j = i+1; j <arrayList.size() ; j++)
            {
                if(value == arrayList.get(j))
                {
                    arrayList.remove(j);
                    flag = true;
                }
            }
            if(flag)
            {
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);


    }
}
