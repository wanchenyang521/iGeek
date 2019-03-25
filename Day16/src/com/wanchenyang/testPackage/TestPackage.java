package com.wanchenyang.testPackage;

import java.util.Date;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 10:05
 * @description
 **/
public class TestPackage
{
    public static void main(String[] args)
    {
        String name = "hello";
        java.lang.String  name2 = "sd";
        Date date = new Date();
//        避免冲突
        java.sql.Date date1 = new java.sql.Date(0);
    }
}
