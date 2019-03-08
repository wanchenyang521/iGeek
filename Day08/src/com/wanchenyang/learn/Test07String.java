package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 14:50
 * @description
 * toCharArray()  str转字符数组
 * toLowerCase()    转小写
 * toUpperCase()    转大写
 *
 **/
public class Test07String
{
    public static void main(String[] args)
    {
        String str = "helloWorld";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }




}
