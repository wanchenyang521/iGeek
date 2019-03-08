package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 16:40
 * @description
 * 判断是不是对称
 * "abc"
 * "aba"
 **/
public class TestStringBuilder02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if(isSame(string))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static boolean isSame(String string)
    {
        StringBuilder s = new StringBuilder(string);
        s.reverse();
        String result = s.toString();
        return result.equals(string);
    }

    public static boolean isSame2(StringBuilder stringBuilder1)
    {

        if (stringBuilder1.reverse().equals(stringBuilder1))
        {
            return true;
        }
        return false;
    }
}
