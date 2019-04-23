package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-11 16:12
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\cy.jpg";
        File file = new File(path);
        printFile(file);
        System.out.println("----------");
        file = new File("cy.jpg");
        printFile(file);
    }
    public static void printFile(File file)
    {

        System.out.println("名称："+file.getName());
        System.out.println("路径："+file.getPath());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("父路径："+file.getParent());
        System.out.println("父路径File:"+file.getParentFile());
        if(file.getParentFile()!=null)
        {
            System.out.println("父路径Fil名称:"+file.getParentFile().getName());
        }
    }
}
