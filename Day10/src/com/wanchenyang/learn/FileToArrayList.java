package com.wanchenyang.learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 14:24
 * @description
 **/
public class FileToArrayList
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\BufferedStreamDemo04.txt"));
        ArrayList<String> arrayList = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null)
        {
            arrayList.add(line);
        }
        bufferedReader.close();
        System.out.println(arrayList);
    }
}
