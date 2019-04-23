package com.wanchenyang.homework.guanka;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:32
 * @description
 **/
public class Test1
{
    public static void main(String[] args)
    {
        String str = "2016-12-18";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Date date = dateFormat.parse(str);
            ((SimpleDateFormat) dateFormat).applyPattern("yyyy年MM月dd日");
            str = dateFormat.format(date);
            System.out.println(str);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

    }
}
