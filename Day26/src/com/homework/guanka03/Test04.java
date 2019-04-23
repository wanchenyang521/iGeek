package com.homework.guanka03;

import java.io.File;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 16:31
 * @description
 **/
public class Test04
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入文件路径：");
        String pathName = scanner.nextLine();
        File file = new File(pathName);
        printName(file,0);
    }

    //打印结构目录
    public static void printName(File file, int level)
    {
        for(int i=0;i<level;i++)
        {
            System.out.print("\t");
        }
        System.out.println(file.getName());
        if(file.isDirectory())
        {
            File[] files = file.listFiles();
            for (File file2 : files) {
                printName(file2,level+1);
            }
        }
    }

}
