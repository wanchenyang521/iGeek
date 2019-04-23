package com.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 09:51
 * @description
 **/
public class OutputStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream("test03.txt");
        outputStream.write(97);
        outputStream.flush();
        outputStream.close();
    }
}
