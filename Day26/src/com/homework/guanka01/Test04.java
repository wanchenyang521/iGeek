package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:42
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\ccc\\bbb\\aaa";
        File file = new File(path);
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);


    }
}
