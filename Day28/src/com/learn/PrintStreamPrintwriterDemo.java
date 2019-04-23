package com.learn;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 14:05
 * @description
 **/
public class PrintStreamPrintwriterDemo
{
    public static void main(String[] args)
    {
        try
        {
            PrintStream stream = new PrintStream("test1.txt");
            stream.println("hi");
            stream.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
