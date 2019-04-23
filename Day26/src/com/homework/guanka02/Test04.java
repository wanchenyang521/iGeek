package com.homework.guanka02;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:16
 * @description
 **/
public class Test04 implements FileFilter
{

    @Override
    public boolean accept(File pathname)
    {
//        if(pathname.isDirectory())
//        {
//            return true;
//        }
        String name = pathname.getName();
        if(name.endsWith(".java"))
            return true;
        else
            return false;
    }
}
