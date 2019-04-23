package com.homework.guanka02;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:24
 * @description
 **/
public class Test04Demo
{

    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka02");
        File[] files = file.listFiles(new Test04());
        for (File thisFile:
             files)
        {
            System.out.println(thisFile.getName());
        }



    }

}
