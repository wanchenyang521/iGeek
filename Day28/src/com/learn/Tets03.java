package com.learn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 08:53
 * @description
 **/
public class Tets03
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("test2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
    }
}
