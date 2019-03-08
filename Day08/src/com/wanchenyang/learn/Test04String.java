package com.wanchenyang.learn;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 11:04
 * @description 模拟登录，三次机会，提示还有几次
 **/
public class Test04String
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入str1：");
        String str1 = scanner.nextLine();
        System.out.println("str1:" + str1);

        String str2;
        int count = 0;
        while (count < 3)
        {
            System.out.print("请输入str2：");
            str2 = scanner.nextLine();
            System.out.println("str2:" + str2);
            if (str1.equals(str2))
            {
                System.out.println("恭喜");
                System.out.println("str1:" + str1 + "str2:" + str2);
                break;
            }
            else
            {
                count++;
                if (count == 3)
                {
                    System.out.println("结束");
                    break;
                }
                System.out.println("还剩" + (3 - count) + "机会");
            }
        }

    }
}
