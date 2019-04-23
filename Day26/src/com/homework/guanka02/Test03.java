package com.homework.guanka02;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:10
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework");
        printFile(file);
    }

    public static void printFile(File file)
    {
        File[] files = file.listFiles();
        for (File thisFile:
             files)
        {
            if(thisFile.isFile())
            {
                System.out.println(thisFile.getAbsolutePath());
            }
            else if(thisFile.isDirectory())
            {
                printFile(thisFile);
            }
        }

    }

}
