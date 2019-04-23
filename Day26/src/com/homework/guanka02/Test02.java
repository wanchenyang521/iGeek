package com.homework.guanka02;

import java.io.File;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:08
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String path = scanner.nextLine();
        File file = new File(path);
        if(file.isFile())
        {
            System.out.println(file.length());
        }
        else if (file.isDirectory())
        {
            int sum = 0;
            File[] files = file.listFiles();
            for (File thisFile:
                 files)
            {
                sum+= thisFile.length();
                System.out.println(thisFile);
            }
            System.out.println("和："+sum);
        }
    }
}
