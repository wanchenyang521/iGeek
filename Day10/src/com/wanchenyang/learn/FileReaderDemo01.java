package com.wanchenyang.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 09:53
 * @description
 **/
public class FileReaderDemo01
{
    public static void main(String[] args) throws IOException
    {
//        创建FileReader对象
        FileReader reader = new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\FileReaderDemo01.java");
////       读取一个字符
//        int ch = reader.read();
//        System.out.println((char) ch);
//        //       读取下一个字符
//        ch = reader.read();
//        System.out.println((char) ch);
//        //       读取下一个字符
//        ch = reader.read();
//        System.out.println((char) ch);
        int ch;
        while ((ch = reader.read()) != -1)
        {
            System.out.print((char) ch);
        }
        reader.close();

    }
}
