package com.wanchenyang.homework.guanka01;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 20:04
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
//        1.	创建LinkedList
        LinkedList<String> stringLinkedList = new LinkedList<String>();
//        2.	使用add方法添加元素
        stringLinkedList.add("你猜猜");
        System.out.println(stringLinkedList);
//        3.	使用addFirst添加元素到集合最前面
        stringLinkedList.addFirst("第一");
        System.out.println(stringLinkedList);
//        4.	使用addLast添加元素到集合最后面
        stringLinkedList.addLast("最后");
        System.out.println(stringLinkedList);
//        5.	使用getFirst获取集合第一个元素
        System.out.println(stringLinkedList.getFirst());
//        6.	使用getLast获取集合最后一个元素
        System.out.println(stringLinkedList.getLast());
//        7.	使用removeLast删除集合第一个元素
        stringLinkedList.removeFirst();
        System.out.println(stringLinkedList);
//        8.	使用removeLast删除集合最后一个元素
        stringLinkedList.removeLast();
        System.out.println(stringLinkedList);


    }
}
