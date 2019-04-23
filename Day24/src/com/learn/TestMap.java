package com.learn;

import java.util.HashMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 08:40
 * @description
 * Map:双列集合。键值对
 * 键唯一
 * 值
 * put(key,value)
 * get(key)
 **/
public class TestMap
{
    public static void main(String[] args)
    {
        HashMap<String,String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("姓名", "wcy");
        stringStringHashMap.put("年龄", "18");
        stringStringHashMap.put("性别", "male");
//        stringStringHashMap.put("性别", "male");键唯一，值会被覆盖
        stringStringHashMap.put("性别", "female");
        System.out.println(stringStringHashMap);
        System.out.println(stringStringHashMap.get("年龄"));
        System.out.println(stringStringHashMap.get("age"));



    }
}

















