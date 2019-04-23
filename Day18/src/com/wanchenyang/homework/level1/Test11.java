package com.wanchenyang.homework.level1;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 14:12
 * @description
 **/
public class Test11
{
    public static void main(String[] args)
    {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DATE, 500);

        int year = calendar.get(Calendar.YEAR);
        int MONTH = calendar.get(Calendar.MONTH);
        int DATE = calendar.get(Calendar.DATE);

        System.out.println("500天后是"+year+"年"+(MONTH+1)+"月"+DATE+"日");


    }
}
