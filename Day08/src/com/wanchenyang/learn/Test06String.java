package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 14:21
 * @description
 * 统计 大写 小写 数字出现次数
 **/
public class Test06String
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string =  scanner.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;

        for (int i = 0; i < string.length(); i++)
        {
            if(Character.isUpperCase(string.charAt(i)))
            {
                upperCase++;
            }
//            if(string.charAt(i)>='A'&&string.charAt(i)<='Z')
//            {
//                upperCase++;
//            }

            if(Character.isLowerCase(string.charAt(i)))
            {
                lowerCase++;
            }
//            if(string.charAt(i)>='a'&&string.charAt(i)<='z')
//            {
//                lowerCase++;
//            }
            if(Character.isDigit(string.charAt(i)))
            {
                number++;
            }
//            if(string.charAt(i)>='0'&&string.charAt(i)<='9')
//            {
//                number++;
//            }
        }
        System.out.println("大写："+upperCase);
        System.out.println("小写："+lowerCase);
        System.out.println("数字："+number);


    }



}
