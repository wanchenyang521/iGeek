package com.wanchenyang.learn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 10:35
 * @description
 **/
public class FileRWTest01
{
    public static void main(String[] args) throws IOException
    {
        FileReader reader = new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\FileReaderDemo01.java");
        FileWriter fileWriter = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileRWTest01.txt");
        FileWriter fileWriter2 = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileRWTest02.txt");
//       利用字符
        int ch;
        while ((ch=reader.read())!=-1)
        {
            fileWriter.write((char)ch);
        }
        fileWriter.flush();
//        字符数组copy
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars))!=-1)
        {
            fileWriter2.write(chars,0,len);
        }
        fileWriter2.flush();

        fileWriter.close();
        fileWriter2.close();
        reader.close();
    }
}
