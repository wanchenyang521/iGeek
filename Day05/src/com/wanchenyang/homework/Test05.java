package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-05 16:55
 * @description
 * 有定义一个方法, 可以接受一个整数,
 * 如果为[90,100]这个范围方法返回’A’
 * 如果为[80,90)这个范围方法返回’B’
 * 如果为[70,80)这个范围方法返回’C’
 * 如果为[60,70)这个范围方法返回’D’
 * 如果为[0,60)这个范围方法返回’E’
 * 整数不在以上范围的返回’F’
 **/
public class Test05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int score = scanner.nextInt();
        System.out.println(getLevel(score));

    }
    public static String getLevel(int score)
    {
       if (score>=90&&score<=100)
       {
           return "A";
       }
       else if(score>=80&&score<90)
       {
           return "B";
       }
       else if(score>=70&&score<80)
       {
           return "C";
       }
       else if(score>=60&&score<70)
       {
           return "D";
       }
       else if(score>=0&&score<60)
       {
           return "E";
       }
       else
       {
            return "F";
       }
    }

}
