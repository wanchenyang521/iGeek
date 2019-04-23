package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:01
 * @description
 **/
public class Test12
{
    public static void main(String[] args)
    {
        File dir = new File("./");
        File[] files = dir.listFiles();
        for (File thisFile:
             files)
        {
            System.out.println(thisFile);
        }
    }
}
