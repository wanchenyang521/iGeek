package com.homework.guanka01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:43
 * @description
 **/
public class Test09
{
    public static void main(String[] args) throws IOException
    {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test09.txt"));
        String s = "i love java";
        byte[] bytes = s.getBytes();
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }
}
