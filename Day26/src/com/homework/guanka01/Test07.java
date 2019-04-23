package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:53
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        File file1 = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\Test05.java");
        File file2 = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01");
        printfResult(file1);
        printfResult(file2);

    }
    public static void printfResult(File file)
    {
        if(file.isDirectory())
        {
            System.out.println(file.getName()+"是一个文件夹");
        }
        else if(file.isFile())
        {
            System.out.println(file.getName()+"是一个文件");
        }
    }
}
