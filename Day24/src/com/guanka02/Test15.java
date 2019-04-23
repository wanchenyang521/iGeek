package com.guanka02;

import java.util.HashMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 20:23
 * @description
 **/
public class Test15
{
    public static void main(String[] args)
    {
        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++)
        {
            hashMap.put(arr1[i],arr2[i]);
        }
        System.out.println(hashMap);
    }
}
