package com.wanchenyang.homework.guanka01;

import java.util.LinkedList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 19:59
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {

//        1.	创建LinkedList
        LinkedList<String> stringLinkedList = new LinkedList<>();
//        2.	使用add方法添加元素
        stringLinkedList.add("万晨阳");
        System.out.println(stringLinkedList);
//        3.	使用add方法在指定索引添加元素
        stringLinkedList.add(1, "晨阳");
        System.out.println(stringLinkedList);
//        4.	使用set方法修改指定位置索引
        stringLinkedList.set(0, "小晨阳");
        System.out.println(stringLinkedList);
//        5.	使用get方法获取指定索引的元素
        System.out.println(  stringLinkedList.get(0));
//        6.	使用size方法获取集合大小
        int size = stringLinkedList.size();
        System.out.println(size);
//        7.	使用remove方法删除指定索引的元素
        stringLinkedList.remove(0);
        System.out.println(stringLinkedList);
//        8.	使用clear清空集合中的元素
        stringLinkedList.clear();
        System.out.println(stringLinkedList);

    }
}
