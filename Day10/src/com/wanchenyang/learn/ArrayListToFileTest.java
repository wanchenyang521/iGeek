package com.wanchenyang.learn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 14:12
 * @description
 * ArrayList 集合中的字符串数据存储到文本文件
 * 每一个字符串元素作为文件中的一行数据
 **/
public class ArrayListToFileTest
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\BufferedStreamDemo04.txt"));
        for (int i = 0; i < arrayList.size(); i++)
        {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
