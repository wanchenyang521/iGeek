package com.homework.guanka01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:41
 * @description
 **/
public class Test05
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = new FileInputStream("test04.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
        int len = -1;
        while ((len = inputStreamReader.read())!=-1)
        {
            System.out.println((char) len);
        }
        inputStreamReader.close();
    }
}
