package com.learn;

import javax.swing.*;
import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 09:17
 * @description
 * 打印子孙级目录和文件名称
 **/
public class Test10
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26");
        printFile(file);
    }
    public static void printFile(File file)
    {
        System.out.println(file.getName());
        if(file==null||!file.exists())
        {
            return ;
        }
        else if(file.isDirectory())
        {
            for (File src:
                 file.listFiles())
            {
               printFile(src);
            }
        }

    }

}
