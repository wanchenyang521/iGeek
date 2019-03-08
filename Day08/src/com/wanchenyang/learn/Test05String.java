package com.wanchenyang.learn;

import java.lang.ref.SoftReference;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 14:11
 * @description
 * string.length();  字符个数
 * string.charAt(int index); 索引获取字符
 * string.indexOf(String str) 字符获取第一次索引
 * string.substring(start); start开始截取字符串
 * string.substring(bgin, end) [start,end) 截取字符串
 *
 **/
public class Test05String
{
    public static void main(String[] args)
    {
        String string ="helloworld";
        System.out.println(string.length());
        System.out.println(string.charAt(1));
        System.out.println(string.indexOf("l"));
        System.out.println(string.substring(3));
        System.out.println(string.substring(5,10));
    }

}
