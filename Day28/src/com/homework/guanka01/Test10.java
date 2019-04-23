package com.homework.guanka01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 11:21
 * @description
 **/
public class Test10
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("array.txt", true);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("12");
        stringArrayList.add("122");
        stringArrayList.add("123");
        stringArrayList.add("124");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (String thisString:
             stringArrayList)
        {
            printWriter.println(thisString);
        }
        printWriter.close();

    }
}
