package com.wanchenyang.learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 14:12
 * @description
 **/
public class CalendarModel
{
    public static void main(String[] args) throws ParseException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 yyyy-MM-mm");
        String dateString = scanner.nextLine();

        String[] str = dateString.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int dayOfMonth  = Integer.parseInt(str[2]);
        Calendar calendar = new GregorianCalendar(year, month-1, dayOfMonth);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int maxDate = calendar.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int i = 0; i <calendar.get(Calendar.DAY_OF_WEEK)-1; i++)
        {
            System.out.print("\t");
        }

        for (int i = 1; i <=maxDate ; i++)
        {
            if(calendar.get(Calendar.DATE)==dayOfMonth)
            {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*\t");
            }
            else
            {
                System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
            }
            if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
            {
                System.out.println();
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }






//
//        for (int i = 1; i < 32; i++)
//        {
//            System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
//            if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
//            {
//                System.out.println();
//            }
//           calendar.add(Calendar.DAY_OF_MONTH, 1);
//
//        }
//
    }
}

//        String str = "2019-03-26";
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-mm");
//        Date date = dateFormat.parse(dateString);
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        calendar.set(Calendar.DAY_OF_MONTH, 1);
////        System.out.println(date);