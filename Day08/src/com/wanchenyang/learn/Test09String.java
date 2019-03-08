package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 15:25
 * @description
 * trim()去除两端空格
 * split("") 指定符号分割字符串
 **/
public class Test09String
{
    public static void main(String[] args)
    {
        String s1 = "helloworld";
        String s2 = "  helloworld   ";
        String s3 = "  hello    world   ";
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s3);
        System.out.println(s3.trim());
        String string = "a,,,b,c";
        String[] strArr = string.split(",");
        for (int i = 0; i < strArr.length; i++)
        {
            System.out.println(strArr[i]);
        }



    }
}
