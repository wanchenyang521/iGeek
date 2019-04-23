package com.wanchenyang.learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 09:03
 * @description
 **/
public class DateFormatTest
{
    public static void main(String[] args) throws ParseException
    {
        //将一个Date格式化为日期/时间字符串
        //把时间对象按照格式字符串指定的格式，转换成相应的字符串
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String str = dateFormat.format(new Date());

        System.out.println(str);
        System.out.println(new Date());
//        给定字符串的开始解析文本，以生成一个日期
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat2.parse("2019-3-26 09:05:20");
        System.out.println(date);

    }
}
