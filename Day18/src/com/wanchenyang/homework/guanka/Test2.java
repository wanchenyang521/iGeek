package com.wanchenyang.homework.guanka;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:47
 * @description
 **/
public class Test2
{
    public static void main(String[] args)
    {
        long start1 = System.currentTimeMillis();
        StringTime();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        StringBuilderTime();
        long end2 = System.currentTimeMillis();

        System.out.println("string"+(end1-start1));
        System.out.println("stringBuilder"+(end2-start2));

    }
    public static void StringTime()
    {
        String s ="";
        for (int i = 0; i < 100000; i++)
        {
            s+=i;
        }
    }
    public static void StringBuilderTime()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <100000 ; i++)
        {
            stringBuilder.append(i);
        }
    }

}
