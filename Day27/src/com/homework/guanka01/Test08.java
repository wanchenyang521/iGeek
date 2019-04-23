package com.homework.guanka01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:41
 * @description
 **/
public class Test08
{
    public static void main(String[] args) throws IOException
    {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test08.txt"));
        bufferedOutputStream.write(97);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
