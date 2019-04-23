package com.wanchenyang.learn;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 09:45
 * @description
 **/
public class CalendarTest
{
    public static void main(String[] args)
    {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        Calendar calendar2 = new GregorianCalendar(2019, 03, 26);
        System.out.println(calendar2);

//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int date = calendar.get(Calendar.DATE);
//        int weekend = calendar.get(Calendar.WEDNESDAY);
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(date);
//        System.out.println(weekend);


        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR,8055);
        System.out.println(calendar1.get(Calendar.YEAR));

        Calendar calendar3 = new GregorianCalendar();
        System.out.println(calendar3.get(Calendar.YEAR));

        calendar3.add(Calendar.YEAR, 100);
        System.out.println(calendar3.get(Calendar.YEAR));

//        日期对象和时间对象转化
        Date date1 = calendar3.getTime();
        System.out.println(date1);
        Calendar calendar4 = new GregorianCalendar();
        calendar4.setTime(date1);
        System.out.println(calendar4);

    }
    public void printCalendar(Calendar calendar)
    {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int weekend = calendar.get(Calendar.DAY_OF_WEEK);
        String wString = weekend ==0?"日":weekend+"";
        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        System.out.println(year+"年"
                +month+"月"
                +date
                +wString+"周\t"
                +hour+":"
                +min+":"
                +sec
                );
    }


}
