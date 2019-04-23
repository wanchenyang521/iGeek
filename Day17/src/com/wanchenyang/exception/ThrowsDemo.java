package com.wanchenyang.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 14:42
 * @description
 **/
public class ThrowsDemo
{
    public static void main(String[] args)
    {
        try
        {
//            在主函数内选择处理还是不处理
//            向外抛还是在函数内trycatch处理
            method();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("go");
    }

    public static void method() throws IOException
    {
        method2();
    }
    public static void method2() throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String path = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(path);
        System.out.println("成功");


    }
}
