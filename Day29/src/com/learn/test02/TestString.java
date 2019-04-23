package com.learn.test02;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 08:57
 * @description
 * 键盘录入一个字符串，要求删除该字符串中的所有java字符串（最终的字符串中不能包含java），
 * 要求打印删除后的结果以及删除了几个java字符串
 * 	比如键盘录入："java woaijava,i like jajavava,i enjoy java"
 * 	程序输出结果：
 * 	原字符串："java woaijava,i like jajavava,i enjoy java"中
 * 	总共包含：5个java删除java后的字符串为：" woai,i like ,i enjoy
 **/
public class TestString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String string = scanner.nextLine();
//        统计删除的个数
        int javaNumber = 0;
//        处理后的新的字符串
        String tempString = string;
//        下标
        int index = tempString.indexOf("java");
        while (index!=-1)
        {
//            截取java前的字符串
            String before = tempString.substring(0, index);
//            截取java后的字符串
            String after = tempString.substring(index+4);
            tempString = before+after;
            index = tempString.indexOf("java");
            javaNumber++;
        }
        System.out.println("原字符串："+string+"中");


        System.out.println("总共包含："+javaNumber+"个java删除java后的字符串为：\""+tempString+"\"");

    }
}
