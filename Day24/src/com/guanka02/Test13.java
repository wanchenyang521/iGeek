package com.guanka02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:12
 * @description
 * 张三=23,李四=24,王五=15,赵六=36,孙七=17,田七=57,周八=35
 **/
public class Test13
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("张三",23);
        hashMap.put("李四",24);
        hashMap.put("王五",15);
        hashMap.put("赵六",36);
        hashMap.put("孙七",17);
        hashMap.put("田七",57);
        hashMap.put("周八",35);
        hashMap.put("周八",22);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day24\\src\\com\\guanka02\\person.txt"));
        Set<String> stringSet = hashMap.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
        {
            String key = iterator.next();
            int value = hashMap.get(key);
            if(value<30)
            {
                bufferedWriter.write(key+"="+value);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        bufferedWriter.close();

    }
}
