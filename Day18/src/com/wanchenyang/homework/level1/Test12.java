package com.wanchenyang.homework.level1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 14:24
 * @description
 *  编写一个校验用户名的程序, 检测键盘录入的用户名是否合法
 * 	要求:必须以英文开头,只能包含英文,数字和`_`;最少6位,做多12位
 **/
public class Test12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("以英文开头,只能包含英文,数字和`_`;最少6位,做多12位");
        String username = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z][\\w]{6,12}");
        Matcher matcher = pattern.matcher(username);
        boolean flag = matcher.matches();
        System.out.println(flag);
    }
}
