package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 18:34
 * @description
 * 请用户输入一个“QQ号码”，我们来判断这个QQ号码是否正确。
 * 要求：使用方法来完成判断功能。
 *
 * 1.	建立MainApp类，并包含main()方法。
 * 2.	在MainApp类中定义方法：checkQQ (String qq)
 * 方法内实现验证。验证规则：
 * 1)	必须是5—12位数字；
 * 2)	首位不能是0；
 * 3.	在main()方法中，请用户输入QQ号码
 * 4.	调用checkQQ (String qq)方法进行判断，并打印判断结果。
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入qq：");
        String qq = scanner.nextLine();
        if(checkQQ(qq))
        {
            System.out.println("qq:"+qq);
            System.out.println("正确");
        }
        else
        {
            System.out.println("错误");
        }
    }
    public static boolean checkQQ (String qq)
    {
        if(qq.length()<5||qq.length()>12)
        {
            System.out.println("必须是5—12位数字");
            return false;
        }
        if(qq.substring(0, 1).equals("0"))
        {
            System.out.println("首字母不为0");
            return false;
        }
        if(!isNumber(qq))
        {
            System.out.println("必须是5—12位数字");
            System.out.println("");
            return false;
        }
        return true;
    }
    public static boolean isNumber(String str){
        for (int i = 0; i < str.length(); i++)
        {
            if (!Character.isDigit(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

}
