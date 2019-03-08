package com.wanchenyang.learn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 15:10
 * @description
 * 键盘录入字符串
 * 字符串首字母转大写
 * 其余为小写
 **/
public class Test08String
{
    public static void main(String[] args)
    {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strTemp = string.split(" ");
        for (int i = 0; i < strTemp.length; i++)
        {
            strTemp[i] = strTemp[i].substring(0, 1).toUpperCase()+strTemp[i].substring(1);
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<strTemp.length;i++)
        {
            sb.append(strTemp[i]);
        }
        System.out.println(sb);

    }
}
