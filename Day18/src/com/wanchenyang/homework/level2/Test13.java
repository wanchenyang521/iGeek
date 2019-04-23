package com.wanchenyang.homework.level2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 14:58
 * @description
 * 计算你活了多少天
 **/
public class Test13
{
    public static void main(String[] args)
    {
        String brithDay = "1998-02-07";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Date date = dateFormat.parse(brithDay);
            System.out.println("出生日期："+date);
            long brithDayTime = date.getTime();
//            系统毫秒
            long nowDayTime = System.currentTimeMillis();
            long result = nowDayTime-brithDayTime;
//            获得天数
            System.out.println(result/1000/60/60/24+"天");

        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
