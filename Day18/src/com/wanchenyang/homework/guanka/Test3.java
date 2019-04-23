package com.wanchenyang.homework.guanka;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:54
 * @description
 **/
public class Test3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入手机号");
        String num = scanner.nextLine();
        boolean flag2 =true;

        if(num.length()!=11)
        {
            System.out.println("不是11位");
            flag2 = false;
        }

//        拿到Pattern对象，表达式对象
        Pattern pattern =Pattern.compile("\\d+");
//        船舰Mamatcher对象
        Matcher matcher = pattern.matcher(num);
        boolean flag = matcher.matches();
        if(!flag)
        {
            System.out.println("不是纯数字");
            flag2 = false;
        }

        if(flag2)
        {
            System.out.println(num+"是手机号");
        }
        if((num.charAt(num.length()-1) == num.charAt(num.length()-2)) && (num.charAt(num.length()-1) == num.charAt(num.length()-3)))
        {
            System.out.println("而且该手机号是靓号!");
        }



    }
}
