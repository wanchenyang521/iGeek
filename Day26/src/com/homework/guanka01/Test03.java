package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:38
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\bbb";
        File file = new File(path);
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }
}
