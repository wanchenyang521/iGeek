package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 19:38
 * @description
 * 1.键盘录入一个整数(正数或者负数都可以, 但是符号位不算有效的数字位)
 * 2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
 * 3.在main方法中打印该数字是几位数
 **/
public class Extend05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int num = scanner.nextInt();
        System.out.println(num+"是"+statistics(num)+"位数");
    }
    public static int statistics(int num)
    {
        String s = String.valueOf(num).replaceAll("[^0-9]", "");
        return s.length();
    }
}
