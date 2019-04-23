package com.homework.guanka02;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:15
 * @description
 **/
public class Test05
{
    public static void main(String[] args) throws IOException
    {
        PrintStream printStream = new PrintStream("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\copyapple.jpg");
        BufferedInputStream bufferedInputStream = new BufferedInputStream
                (new FileInputStream("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\apple.jpg"));
        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = bufferedInputStream.read(bytes))!=-1)
        {
            printStream.write(bytes,0,len);
        }
        printStream.close();
        bufferedInputStream.close();
    }
}
