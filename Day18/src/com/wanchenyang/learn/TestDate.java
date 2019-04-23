package com.wanchenyang.learn;

import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 08:48
 * @description
 **/
public class TestDate
{
    public static void main(String[] args)
    {
//        1000毫秒 = 1s
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());

        System.out.println("指定日期相同"+date.equals(date1));

        System.out.println("指定日期之前"+date.before(date1));

        System.out.println("指定日期之后"+date.after(date1));

        Date date2 = new Date(2020-1900,3,10);
        System.out.println(date2);
    }
}
