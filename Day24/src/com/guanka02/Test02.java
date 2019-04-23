package com.guanka02;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:36
 * @description
 * 定义一个方法add接收0个及以上的String类型数据,
 * 这个方法的作用是将传入的String类型的参数放入一个ArrayList中,
 * 并返回这个ArrayList集合
 **/
public class Test02
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=add("12","asd","sad");
        for (String s:
             arrayList)
        {
            System.out.println(s);
        }
    }
    public static ArrayList<String> add(String...str)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s:
             str)
        {
            arrayList.add(s);
        }
        return arrayList;
    }
}
