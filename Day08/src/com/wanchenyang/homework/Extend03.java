package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 19:54
 * @description
 *
 * 键盘录入一个源字符串由字符串变量scrStr接收
 * 	2.键盘录入一个要删除的字符串由字符串变量delStr接收
 * 	3.要求
 * 		删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
 * 	4.代码运行打印格式:
 * 		请输入源字符串:java woaijava,i like jajavava i enjoy java
 * 		请输入要删除的字符串:java
 * 		控制台输出结果:源字符串中总共包含:4 个 java 删除java后的字符串为: woai,i like  i enjoy
 **/
public class Extend03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源字符串");
        String scrStr = scanner.nextLine();
        System.out.println("请输入删除字符串");
        String delStr = scanner.nextLine();
        deleteStr(scrStr, delStr);
    }
    public static void deleteStr(String scrStr,String delStr)
    {
        int count = countString(scrStr, delStr);
        String str = scrStr.replace(delStr, "");
        System.out.println("源字符串中总共包含:"+count+"个"+delStr+" 删除"+delStr+"后的字符串为:"+str);


    }

    public static int countString(String str,String s)
    {
        int count=0;
        int index = 0;
        while ((index = str.indexOf(s, index)) != -1)
        {
            index = index + s.length();
            count++;
        }
        return count;
    }
}
