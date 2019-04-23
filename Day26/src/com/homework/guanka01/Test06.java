package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:51
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\Test05.java");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
    }
}
