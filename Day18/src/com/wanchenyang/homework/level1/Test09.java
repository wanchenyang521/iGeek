package com.wanchenyang.homework.level1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:47
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = dateFormat.format(now);
        System.out.println(result);
    }

}
