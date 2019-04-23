package com.wanchenyang.homework.level1;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 14:07
 * @description
 **/
public class Test10
{
    public static void main(String[] args)
    {
        String brithDay = "1998-02-07";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Date data=dateFormat.parse(brithDay);
            System.out.println(data);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

    }
}
