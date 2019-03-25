package com.wanchenyang.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 10:11
 * @description
 **/
public class FileReaderDemo02
{
    public static void main(String[] args) throws IOException
    {
        FileReader reader = new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\FileReaderDemo01.java");
        char[] ch = new char[1024];
//        返回字符数量
//        int len = reader.read(ch);
//        System.out.println(ch);
//        System.out.println(new String(ch));
//        len = reader.read(ch);
//        System.out.println(ch);
//        System.out.println(new String(ch));
        int len;
        while ((len=reader.read(ch))!=-1)
        {
            System.out.print(ch);
        }
        reader.close();

    }
}
