package com.wanchenyang.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 11:18
 * @description
 **/
public class FileBufferedTest01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\BufferedStreamDemo.java"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\BufferedStreamDemo.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\BufferedStreamDemo01.txt"));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\BufferedStreamDemo02.txt"));
        //       利用字符
        int ch;
        while ((ch=bufferedReader.read())!=-1)
        {
            bufferedWriter.write((char)ch);
        }

//        利用数组
        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader2.read(chars))!=-1)
        {
            bufferedWriter2.write(chars, 0, len);
        }

        bufferedReader.close();
        bufferedReader2.close();
        bufferedWriter.close();
        bufferedWriter2.close();
    }
}
