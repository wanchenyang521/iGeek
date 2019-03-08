package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 18:47
 * @description
 * 一、	需求说明：定义如下字符串：
 * String str = “javajfiewjavajfiowfjavagkljjava”;
 * 二、	请分别定义方法统计出：
 * 1.	字符串中：字符j的数量
 * 2.	字符串中：字符串java的数量
 *
 * 1.	定义MainApp类，包含main()方法；
 * 2.	在MainApp类中，定义以下两个方法：
 * 1)	可以统计一个字符串中，某个字符出现的次数；
 * public static int countChar(String str,char c)
 * 2)	可以统计一个字符串中，某个字符串出现的次数；
 * public static int countString(String str,String s)
 * 3.	请实现方法，并在main()方法中分别调用这两个方法进行统计。
 *
 **/
public class Test02
{
    public static void main(String[] args)
    {
        String str = "javajfiewjavajfiowfjavagkljjava";
//        字符串中：字符j的数量
        System.out.println("字符串中：字符j的数量:"+countChar(str,'j'));
//        字符串中：字符串java的数量
        System.out.println("字符串中：字符串java的数量:"+countString(str, "java"));


    }
//可以统计一个字符串中，某个字符出现的次数；
    public static int countChar(String str,char c)
    {
        int count = 0;
        for (int i = 0 ; i <str.length() ; i++)
        {
            if(str.charAt(i)==c)
            {
                count++;
            }
        }
        return count;
    }
    public static int countString(String str,String s)
    {
        int count=0;
//        String[] arr = str.split(s);
//        if(arr !=null)
//        {
//            count = arr.length;
//        }
        int index = 0;
        while ((index = str.indexOf(s, index)) != -1)
        {
            index = index + s.length();
            count++;
        }
        return count;
    }

}
