package com.wanchenyang.homework.guanka02;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:18
 * @description
 * 键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.
 * 例如输入: aaaabbbcccddd,打印结果为: abcd
 **/
public class Test08
{
    public static void main(String[] args)
    {
//        1.	创建Scanner对象,用于键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
//2.	调用Scanner的nextLine()方法,让用户输入一个字符串
        String string = scanner.nextLine();
//3.	创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<String>();
//4.	将字符串串转成char[]
        char[] chars = string.toCharArray();
//5.	使用增强for循环遍历每个字符
        for (char c:
             chars)
        {
            //6.	将每个字符添加到LinkedHashSet中
            stringLinkedHashSet.add(String.valueOf(c));
        }

//7.	使用增强for打印LinkedHashSet中的内容
        for(String s:
        stringLinkedHashSet)
        {
            System.out.println(s);
        }

    }
}
