package com.homework.guanka02;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 11:26
 * @description
 **/
public class Test01
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = new FileInputStream("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"gbk");
        OutputStream outputStream = new FileOutputStream("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\test2.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream,"gbk");
        int len = -1;
        while ((len = inputStreamReader.read())!=-1)
        {
            outputStreamWriter.write((char)len);
        }
        outputStreamWriter.close();
        outputStream.close();
        inputStreamReader.close();
        inputStream.close();

    }
}
