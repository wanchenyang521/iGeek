package com.learn;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:04
 * @description
 * BufferedOutputStream
 **/
public class Test04
{
    public static void main(String[] args) throws IOException
    {
//        FileOutputStream fileOutputStream = new FileOutputStream("test02.txt");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("test04.txt"));
        bufferedOutputStream.write(97);
        bufferedOutputStream.write(new byte[]{101,97,97,98,98});
        bufferedOutputStream.flush();
        bufferedOutputStream.close();



    }
}














