package com.wanchenyang.homework.level2;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:30
 * @description
 **/
public class Test17
{
    public static void main(String[] args)
    {
        String string = "Hello12345World6789012";
        String newStr=string.replaceAll("\\d+", "#");
        System.out.println(newStr);
    }
}
