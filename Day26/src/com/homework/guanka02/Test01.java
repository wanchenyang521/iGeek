package com.homework.guanka02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:04
 * @description
 **/
public class Test01
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String path = scanner.nextLine();
        File file = new File(path);
        if(file.exists())
        {
            System.out.println("文件存在");
            System.out.println(file.length());
        }
        else
        {
            file.createNewFile();
        }
    }
}
