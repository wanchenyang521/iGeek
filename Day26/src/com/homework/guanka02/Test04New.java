package com.homework.guanka02;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 15:11
 * @description
 **/
public class Test04New
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka02");
        File[] files = file.listFiles(new FileFilter()
        {
            @Override
            public boolean accept(File pathname)
            {
                String name = pathname.getName();
                if(name.endsWith(".java"))
                    return true;
                else
                    return false;
            }
        });

        for (File thisFile:
                files)
        {
            System.out.println(thisFile.getName());
        }


    }
}
