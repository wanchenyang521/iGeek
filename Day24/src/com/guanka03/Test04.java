package com.guanka03;

import java.util.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:56
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        HashMap<String,String> hashMap = new HashMap<>();

        for (int i = 0; i < 4; i++)
        {
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 8; j++)
            {
                stringBuilder.append(random.nextInt(10));
            }
            if(i==0)
            {
                hashMap.put(String.valueOf(stringBuilder), "苹果");
            }
            if(i==1)
            {
                hashMap.put(String.valueOf(stringBuilder), "香蕉");
            }
            if(i==2)
            {
                hashMap.put(String.valueOf(stringBuilder), "西瓜");
            }
            if(i==3)
            {
                hashMap.put(String.valueOf(stringBuilder), "橘子");
            }
        }
        System.out.println(hashMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id号");
        String s = scanner.nextLine();
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        boolean flag = false;
        for (Map.Entry<String, String> entrySets:
                entries)
        {
            String key = entrySets.getKey();
            String value = entrySets.getValue();
            if(key.equals(s))
            {
                System.out.println("根据商品号："+key+"，查询到对应的商品为："+value);
                flag = true;
            }
        }
        if(!flag)
        {
            System.out.println("查无此商品");
        }



    }
}
