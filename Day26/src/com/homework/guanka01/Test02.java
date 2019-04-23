package com.homework.guanka01;

import java.io.File;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:35
 * @description
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        String path = "D:\\WorkSpace\\Java\\Day26\\src\\com\\homework\\guanka01\\a.txt";
        File file = new File(path);
        if(!file.exists())
        {
            file.createNewFile();
        }
    }
}
