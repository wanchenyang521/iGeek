package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 16:13
 * @description
 **/
public class TestStringBuilder01
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(1, 'x');
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("111");
        System.out.println(stringBuilder1);
        stringBuilder1.append("222");
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            stringBuilder2.append((char)('a'+i));
        }
        System.out.println(stringBuilder2);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);

//用来比较string，stringbuilder
        String test1 = new String("");
        StringBuilder test2 =  new StringBuilder("");
//        内存
        long num = Runtime.getRuntime().freeMemory();
//        时间 进行相减
        long time = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++)
        {
            test1+=i;
        }
//        内存：4890712
//        时间：106
        for (int i = 0; i < 5000; i++)
        {
            test2.append(i);
        }
//        内存：0
//        时间：1
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("内存："+(num2-num));
        System.out.println("时间："+(time2-time));
//        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test2.capacity());
        System.out.println(test2.length());
        StringBuilder stringBuilder3 = new StringBuilder();
//        链式
        stringBuilder3.append("hello").append("world");
        System.out.println(stringBuilder3);


    }
}
