package com.homework.guanka01;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:45
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\a.txt";
        File file = new File(path);
        file.delete();
        String path2 = "D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\aaa";
        File file1 = new File(path2);
        file1.delete();

    }
}
