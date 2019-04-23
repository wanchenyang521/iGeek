package com.wanchenyang.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 10:53
 * @description
 **/
public class TestPattern
{
    public static void main(String[] args)
    {
//        拿到Pattern对象，表达式对象
        Pattern pattern =Pattern.compile("\\w+");
//        船舰Mamatcher对象
        Matcher matcher = pattern.matcher("52%152&&2123-12353");


        while (matcher.find())
        {
            System.out.println(matcher.group());
            System.out.println(matcher.group(0)+"--");
        }

//        尝试将整个区域与模式匹配
//        boolean flag = matcher.matches();
//        尝试匹配下一个序列
//        boolean flag2 = matcher.find();

//        1.find()方法是部分匹配，是查找输入串中与模式匹配的子串，如果该匹配的串有组还可以使用group()函数。
//        matches()是全部匹配，是将整个输入串与模式匹配，如果要验证一个输入的数据是否为数字类型或其他类型，一般要用matches()。
//多次find，寻找到后，接着下一次寻找
//        System.out.println(flag);
//        System.out.println(flag2);
//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
//        System.out.println(matcher.find());
//        System.out.println(matcher.group());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
    }

}
