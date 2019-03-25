package com.wanchenyang.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 11:21
 * @description
 **/
public class TryCatchDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String path = scanner.nextLine();

        try
        {
            FileWriter fileWriter = new FileWriter(path);
            System.out.println("成功");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("go");
    }
}
