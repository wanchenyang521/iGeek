package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 19:49
 * @description
 *键盘录入一个大字符串, 再录入一个小字符串
 * 	2.统计小字符串在大字符串中出现的次数
 * 	3.代码运行打印格式:
 * 		请输入大字符串: abcdefg
 * 		请输入小字符串:a
 * 		控制台输出:小字符串a,在大字符串abcdefg中共出现1次
 *
 **/
public class Extend02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入大字符串");
        String string = scanner.nextLine();
        System.out.println("请输入小字符串");
        String string2 = scanner.nextLine();
        System.out.println("小字符串"+string2+",在大字符串"+string+"中共出现"+countString(string, string2)+"次");

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
