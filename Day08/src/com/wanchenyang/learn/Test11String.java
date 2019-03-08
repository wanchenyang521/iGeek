package com.wanchenyang.learn;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 15:45
 * @description
 **/
public class Test11String
{
    public static void main(String[] args)
    {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
        System.out.println(reverseArraytoString(str));
    }
    public static String reverse(String string)
    {
        String result = "";
        for (int i = string.length()-1; i >=0 ; i--)
        {
            result += string.charAt(i);
        }
        return result;
    }

    public static String reverseArraytoString(String string)
    {
        char[] str = string.toCharArray();
//        for (int i = 0; i < str.length/2; i++)
//        {
//            char temp = str[i];
//            str[i] = str[str.length-i-1];
//            str[str.length-i-1] = temp;
//        }
        for (int i = 0,j=str.length-1; i <=j; i++,j--)
        {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        String result = new String(str);
        return result;
    }


}
