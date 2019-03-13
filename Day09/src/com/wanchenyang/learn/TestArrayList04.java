package com.wanchenyang.learn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 11:02
 * @description
 * 给定字符串数组，只遍历符合字符串首字母的
 **/
public class TestArrayList04
{
    public static void main(String[] args)
    {
        String[] array = {"万晨阳","wan","万chenyang","chen","万晨yang","yang"};
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < array.length; i++)
        {
            arrayList.add(array[i]);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
//        arrayList.add("万晨阳");
//        arrayList.add("wan");
//        arrayList.add("万Chen");
//        arrayList.add("chen");
//        arrayList.add("万yang");
//        arrayList.add("yang");
//        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i).startsWith("万"))
            {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
