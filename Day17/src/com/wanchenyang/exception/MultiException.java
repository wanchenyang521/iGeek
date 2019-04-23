package com.wanchenyang.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 15:19
 * @description
 **/
public class MultiException
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String path = scanner.nextLine();
        try
        {
            FileWriter fileWriter = new FileWriter(path);
            System.out.println(10/0);
        }
        catch (ArithmeticException | IOException e)
        {
            System.out.println("您访问的文件不存在或者除数不能为0");
        }


        System.out.println("go");
    }
}
