package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 10:58
 * @description
 * //        s.equals(); 是否相同
 * //        s.equalsIgnoreCase(); 是否相同，区分大小写
 * //        s.startsWith() 是否以指定str开头
 * //        s.endsWith();  是否以是定str结尾
 **/
public class Test03String
{
    public static void main(String[] args)
    {
        String s = new String();

        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("----------------------");
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith("He"));
        System.out.println("----------------------");
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.endsWith("Lo"));
    }
}
