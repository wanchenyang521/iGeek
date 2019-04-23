package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:16
 * @description
 **/
public class Test03
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("test03.txt");
        readChar(file);
        System.out.println("---");
        readCharArray(file);
    }

    private static void readCharArray(File file) throws IOException
    {
        FileReader fileReader = new FileReader(file);
        int len = -1;
        char[] chars = new char[1024];
        while((len = fileReader.read(chars))!=-1)
        {
            System.out.println(chars);
        }

    }

    private static void readChar(File file) throws IOException
    {
        FileReader fileReader = new FileReader(file);
        int temp;
        while ((temp = fileReader.read())!=-1)
        {
            System.out.println((char)temp);
        }
        fileReader.close();
    }
}
