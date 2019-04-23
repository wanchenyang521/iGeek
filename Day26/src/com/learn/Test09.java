package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 09:01
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26");
        String[] name = file.list();
        for (String thisString:
             name)
        {
            System.out.println(thisString);
//            System.out.println(thisString+"文件夹"+new File(thisString).isDirectory());
//            System.out.println(thisString+"文件"+new File(thisString).isFile());
        }
        File[] file1 = file.listFiles();
        for (File thisFile:
             file1)
        {
            System.out.println(thisFile.getAbsolutePath());
        }
        System.out.println("+++++");
        File[] files = File.listRoots();
        for (File thisFiles:
             files)
        {
            System.out.println(thisFiles.getAbsolutePath());
        }




    }
}
