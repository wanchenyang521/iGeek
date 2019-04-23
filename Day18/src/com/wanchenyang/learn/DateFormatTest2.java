package com.wanchenyang.learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 09:36
 * @description
 **/
public class DateFormatTest2
{
    public static void main(String[] args) throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat(SimpleFormatPattern.rule1);
        String sTime = "2019年05月21日";
        Date dTime = dateFormat.parse(sTime);
        System.out.println(dTime);

    }
}
