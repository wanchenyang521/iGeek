package com.learn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 08:37
 * @description
 **/
public class CharStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("hello java");
        fileWriter.write("\nhello java");
        fileWriter.close();
        String path = "D:\\WorkSpace\\Java\\Day27\\test.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
//        单个字符
        int temp;
        while ((temp = fileReader.read())!=-1)
        {
            System.out.print((char)temp);
        }
        fileReader.close();
    }
}
