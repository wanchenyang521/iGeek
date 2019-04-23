package com.guanka01;

import java.util.HashMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 14:33
 * @description
 * StringBuilder
 **/
public class Test02
{
    public static void main(String[] args)
    {
//        1.	创建HashMap
        HashMap<String,String> stringStringHashMap = new HashMap<>();
//        2.	使用put添加元素
        stringStringHashMap.put("name","晨阳" );
        stringStringHashMap.put("age","18" );
//        3.	使用put修改元素
        stringStringHashMap.put("name", "晨阳哇");
//        4.	使用get获取元素
        String value = stringStringHashMap.get("name");
        System.out.println(value);
//        5.	使用remove删除元素
        System.out.println(stringStringHashMap);
        stringStringHashMap.remove("name");
//        6.	打印集合中的元素
        System.out.println(stringStringHashMap);

    }
}
