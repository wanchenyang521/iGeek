package com.wanchenyang.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 08:49
 * @description
 *
 **/
public class FileWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileWriterDemo.txt");
    }
}
