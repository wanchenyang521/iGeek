package com.homework.guanka03;

import sun.security.util.Length;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 15:29
 * @description
 * 使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)
 **/
public class Test01
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka02");
        filterFile(file);


    }

    public static void filterFile(File file)
    {
        if(!file.exists())
        {
            return;
        }
        File[] files = file.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname)
            {
                if(pathname.isDirectory())
                {
                    return true;
                }
                if(pathname.isHidden())
                {
                    return false;
                }
                if(pathname.isFile())
                {
                    long len = pathname.length();
                    if(len/1024 < 200)
                    {
                        return true;
                    }
                }
                return false;
            }
        });
        for (File thisFile : files)
        {
            if (thisFile.isDirectory())
            {
                filterFile(thisFile);
            }
            else
            {
                System.out.println(thisFile);
            }
        }

    }
}
