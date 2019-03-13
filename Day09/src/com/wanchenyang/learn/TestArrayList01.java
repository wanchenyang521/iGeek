package com.wanchenyang.learn;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 10:06
 * @description
 **/
public class TestArrayList01
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("hello");
        arrayList1.add("world");
        arrayList1.add("wan");
        System.out.println(arrayList1);
        arrayList1.add(1,"cy");
        System.out.println(arrayList1);
//      获取元素
        System.out.println("-------------------");
        System.out.println("获取指定下标:get()"+arrayList1.get(1));
        System.out.println("元素个数：size()"+arrayList1.size());
        System.out.println(arrayList1);
        System.out.println("删除返回Boolean"+arrayList1.remove("world"));
        System.out.println(arrayList1);
        System.out.println("删除返回删除元素"+arrayList1.remove(2));
        System.out.println(arrayList1);
        System.out.println("修改元素的值,返回修改的元素"+arrayList1.set(0, "fuck***"));
        System.out.println(arrayList1);




    }
}
