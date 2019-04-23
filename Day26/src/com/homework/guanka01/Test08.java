package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:56
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01");
        File[] files = file.listFiles();
        for (File thisFile:
             files)
        {
            System.out.println(thisFile);
        }
    }
}
