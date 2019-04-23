package com.homework.guanka02;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:11
 * @description
 **/
public class Test04
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter printWriter = new PrintWriter("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\copytest04.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\guanka02\\test04.txt"));
        String line = null;
        while ((line = bufferedReader.readLine())!=null)
        {
            printWriter.println(line);
        }
        bufferedReader.close();
        printWriter.close();

    }
}
