package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:34
 * @description
 * 现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
 * 要求：使用utf8编码保存。
 **/
public class Test04
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream("test04.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
        outputStreamWriter.write("我爱Java");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
