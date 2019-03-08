package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 10:45
 * @description
 * 字符串赋值区别
 * 直接赋值 创建对象在方法区的常量池
 * 通过构造方法 对象在堆内存
 *
 * 基本数据类型:比较的是基本数据类型的值是否相等
 * 引用数据类型：比较的引用数据类型的地址是否相同
 *
 **/
public class Test01String
{
    public static void main(String[] args)
    {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("str1"+str1);
        System.out.println("str2"+str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = "hello";
        System.out.println(str1==str3);


    }


}
