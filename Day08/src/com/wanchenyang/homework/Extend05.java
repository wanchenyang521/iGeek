package com.wanchenyang.homework;

import java.util.Random;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 20:16
 * @description
 * 定义String getStr(char[] chs)方法
 * 		功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
 * 	2.定义main方法，方法内完成：
 * 		(1)定义长度为26，元素值为26个大写英文字母的数组chs
 * 		(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
 **/
public class Extend05
{
    public static void main(String[] args)
    {
        char[] chs = new char[26];
        for (int i = 0; i < chs.length; i++)
        {
            chs[i] = (char) ('A'+i);
        }
        String result = getStr(chs);
        System.out.println(result);

    }

    public static String getStr(char[] chs)
    {
        Random random = new Random();
        String result="";
        for (int i = 0; i < 4; i++)
        {
            result += chs[random.nextInt(26)+1];
        }
        result += random.nextInt(10);
        return result;
    }

}
