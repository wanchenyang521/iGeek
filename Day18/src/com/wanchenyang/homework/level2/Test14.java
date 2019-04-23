package com.wanchenyang.homework.level2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:09
 * @description
 **/
public class Test14
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        testSimpleDataFormatInLoop();

        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println("时间："+result);

        long start2 = System.currentTimeMillis();
        testSimpleDataFormatOutLoop();
        long end2 = System.currentTimeMillis();
        long result2 = end2-start2;
        System.out.println("时间2："+result2);


    }


    public static void testSimpleDataFormatInLoop()
    {
        Date now = new Date();
        for (int i = 0; i < 100000; i++)
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.format(now);
        }
    }
    public static void testSimpleDataFormatOutLoop()
    {
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 100000; i++)
        {
             dateFormat.format(now);
        }
    }
}
