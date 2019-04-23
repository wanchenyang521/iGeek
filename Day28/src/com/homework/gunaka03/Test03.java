package com.homework.gunaka03;

import java.io.*;
import java.util.TreeMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 16:17
 * @description
 * 1.转换流的使用
 *
 * C盘下有两个文本文件，分别为a.txt和b.txt，其中a.txt编码方式是gbk,而b.txt的编码方式是utf8。
 * 要求将使用转换流实现如下功能：
 * 将a.txt和b.txt文件的内容复制到c.txt文件中，保证内容不乱码。
 **/
public class Test03
{
    public static void main(String[] args) throws IOException
    {
        copy(new File("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\gunaka03\\a.txt"),
                new File("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\gunaka03\\c.txt"), "gbk");

        copy(new File("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\gunaka03\\b.txt"),
                new File("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\gunaka03\\c.txt"), "utf-8");
    }
    public static void copy(File srcFile,File destFile,String encode) throws IOException
    {
        InputStreamReader inputStreamReader = new InputStreamReader
                (new FileInputStream(srcFile),encode);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter
                (new FileOutputStream(destFile, true));
        int len = -1;
        char[] bytes = new char[1024];
        while ((len= inputStreamReader.read(bytes))!=-1)
        {
            outputStreamWriter.write(bytes,0,len);
        }
        inputStreamReader.close();
        outputStreamWriter.close();


    }
}
