package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-11 16:25
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\cy.jpg";
        File file = new File(path);
        printFile(file);
        System.out.println("---");
        file = new File("cy.jpg");
        printFile(file);
        System.out.println("++++++");
        file = new File("D:\\WorkSpace\\Java\\Day26");
        printFile(file);

        file = new File("xx");
        if(file==null||file.exists())
        {
            System.out.println("文件不存在");
        }
        else
        {
            if(file.isFile())
            {
                System.out.println("文件操作");
            }
            else
            {
                System.out.println("文件夹操作");
            }
        }


    }
    public static void printFile(File file)
    {
        System.out.println("是否存在："+file.exists());
        System.out.println("是否是文件"+file.isFile());
        System.out.println("是否是目录"+file.isDirectory());
    }
}
