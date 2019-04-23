package com.wanchenyang.homework.guanka02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:40
 * @description
 * 已知数组存放一批QQ号码.QQ号码最长为11位, 最短为5位
 * String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
 * 将该数组里面的所有qq号都存放在LinkedList中,将list中重复元素删除,将list中所有元素用两种方式打印出来
 **/
public class Test03
{
    public static void main(String[] args)
    {
//        1.	定义QQ号码数组String[] strs
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
//2.	创建LinkedList
        LinkedList<String> stringLinkedList = new LinkedList<String>();
//3.	遍历strs获取每个qq号码
        for (String temp:
             strs)
        {
            //4.	判断LinkedList是否已经存在这个qq号码
            //5.	不存在这个qq号码则添加到LinkedList中
            if(!stringLinkedList.contains(temp))
            {
                stringLinkedList.add(temp);
            }
        }


//6.	增强for遍历LinkedList
        for (String temp:
             stringLinkedList)
        {
            System.out.println(temp);
        }
        System.out.println("----");
//7.	迭代器遍历LinkedList
        Iterator<String>stringIterator = stringLinkedList.iterator();
        while (stringIterator.hasNext())
        {
            System.out.println(stringIterator.next());
        }
    }
}
