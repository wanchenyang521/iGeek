package com.wanchenyang.learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 14:43
 * @description
 **/
public class Self
{
    public static void main(String[] args) throws ParseException
    {
//        获取当前日期时间
//        Date date = new Date();
//        System.out.println(date);
//
//        使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
//        使用方法 before()，after() 和 equals()。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new Date (99, 2, 18)) 返回true。
//        使用 compareTo() 方法，它是由 Comparable 接口定义的，Date 类实现了这个接口。


////        使用 SimpleDateFormat 格式化日期
//        Date dNow = new Date( );
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println("当前时间为: " + dateFormat.format(dNow));
//
//        //将一个Date格式化为日期/时间字符串
//        //把时间对象按照格式字符串指定的格式，转换成相应的字符串
//        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//        String str = dateFormat.format(new Date());
//        System.out.println(str);
//        System.out.println(new Date());
////        给定字符串的开始解析文本，以生成一个日期
//        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = dateFormat2.parse("2019-3-26 09:05:20");
//        System.out.println(date);


//        设置和获取日期数据的特定部分,使用Calendar 类

//        Calendar calendar = Calendar.getInstance();
        /*
        * Calendar.YEAR	年份
        Calendar.MONTH	月份
        Calendar.DATE	日期
        Calendar.DAY_OF_MONTH	日期，和上面的字段意义完全相同
        Calendar.HOUR	12小时制的小时
        Calendar.HOUR_OF_DAY	24小时制的小时
        Calendar.MINUTE	分钟
        Calendar.SECOND	秒
        Calendar.DAY_OF_WEEK星期几
        *
        * */
//        System.out.println(calendar.getTime());
//        calendar.set(Calendar.DATE, 10);
//        System.out.println(calendar.getTime());
////        add加减几天
//        calendar.add(Calendar.DATE, 11);
//        System.out.println(calendar.getTime());
//
//        String s = "2019-03-26";
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-mm");
//        Date date = dateFormat.parse(s);
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DATE));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));




    }
}
