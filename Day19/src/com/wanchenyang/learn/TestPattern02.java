package com.wanchenyang.learn;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 11:19
 * @description
 **/
public class TestPattern02
{
    public static void main(String[] args)
    {
//        Pattern pattern = Pattern.compile("([a-z]+)([0-9]+)");


//  替换
//        Pattern pattern = Pattern.compile("[0-9]");
//        Matcher matcher = pattern.matcher("aaa33**sada324**f2f21asdsd");
//        String str = matcher.replaceAll("￥");
//        System.out.println(str);

//        string 提供的分割
//        String str = "a,b,c";
//        String[] a = str.split(",");
//        System.out.println(Arrays.toString(a));


//        通过正则表达式分割字符串
        String str = "dasd155das1da3s1d3adsa";
        String[] a = str.split("\\d+");
        System.out.println(Arrays.toString(a));





//        while (matcher.find())
//        {
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(0)+"---");
//            System.out.println(matcher.group(1)+"+++");
//            System.out.println(matcher.group(2)+"````");
//        }

    }
}
