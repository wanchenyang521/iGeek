package com.wanchenyang.homework;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 20:50
 * @description
 * 1.定义ArrayList集合，存入多个字符串
 * 		   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
 * 		2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
 * 		3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 **/
public class ExtendTest03
{
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<String>()
        {
            {
                add("a12");
                add("123ad");
                add("bca");
                add("dadfadf");
                add("dddaaa");
                add("你好啊");
                add("我来啦");
                add("别跑啊");
            };
        };
        System.out.print("原始：");
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.print(strings.get(i)+" ");
        }
//    遍历集合,删除长度大于5的字符串,打印删除后的集合对象
        for (int i = 0; i < strings.size(); i++)
        {
            if(strings.get(i).length()>5)
            {
                strings.remove(i--);
            }
        }
        System.out.print("\n删除后：");
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.print(strings.get(i)+" ");
        }

        for (int i = 0; i < strings.size(); i++)
        {
            char[] chars = strings.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++)
            {
                if(chars[j]>='0'&&chars[j]<='9')
                {
                    strings.remove(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println("\n删除数字：");
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.print(strings.get(i)+" ");
        }
        
        

    }




}
