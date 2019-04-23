package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 11:04
 * @description
 **/
public class Test09
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter printWriter = new PrintWriter("test09.txt");

        printWriter.println("我爱Java");
        printWriter.flush();
        printWriter.close();
    }
}
