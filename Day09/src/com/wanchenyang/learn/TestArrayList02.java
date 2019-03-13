package com.wanchenyang.learn;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 10:49
 * @description
 * 遍历容器
 **/
public class TestArrayList02
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList.size());
        arrayList.add("Wan");
        arrayList.add("Chen");
        arrayList.add("yang");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

    }
}
