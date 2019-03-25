package com.wanchenyang.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 10:59
 * @description
 *  BufferedWriter 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 *  BufferedReader 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
 **/
public class BufferedStreamDemo
{
    public static void main(String[] args) throws IOException
    {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\bufferedWriter.txt"));
//        bufferedWriter.write("hello");
//        bufferedWriter.flush();
//        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\bufferedWriter.txt"));
//        int ch;
//        while (( ch = bufferedReader.read())!=-1)
//        {
//            System.out.print((char)ch);
//        }

        char[] chars = new char[1024];
        int len;
        while ((len=bufferedReader.read(chars))!=-1)
        {
            System.out.println(chars);
        }

        bufferedReader.close();

    }
}
