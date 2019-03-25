package com.wanchenyang.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 19:11
 * @description
 **/
public class Extend04
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\text.txt"));
        ArrayList<String> arrayList = new ArrayList<String>();
        String temp;
        while ((temp = bufferedReader.readLine())!=null)
        {
            arrayList.add(temp);
        }

        OutputStreamWriter writerStream = new OutputStreamWriter(new FileOutputStream("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\text.txt"),"UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(writerStream);
        Collections.reverse(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
        {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();


    }
}
