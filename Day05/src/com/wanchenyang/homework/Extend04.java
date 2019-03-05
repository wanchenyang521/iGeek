package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 19:29
 * @description
 * 定义一个方法, 去打印指定两个年份之间所有的闰年年份
 * 如:将2000和2005传入方法,方法执行完毕会打印出这段之间的所有闰年年份
 * 2000和2004
 * 计算公历年闰年的算法: 四年一闰，百年不闰，四百年再闰
 **/
public class Extend04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入开始年份");
        int yearStart = scanner.nextInt();
        System.out.println("请输入结束年份");
        int yearEnd = scanner.nextInt();
        for (int i = yearStart; i <=yearEnd ; i++)
        {
            if(isLeapYear(i))
            {
                System.out.print(i+" ");
            }
            else
            {
                
            }
        }
        {

        }

    }
    public static boolean isLeapYear(int year)
    {
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            return true;
        }
        return false;
    }

}
