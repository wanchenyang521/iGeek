package com.wanchenyang.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 14:02
 * @description
 **/
public class BufferedStreamDemo03
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\learn\\BufferedStreamDemo03.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\BufferedStreamDemo03.txt"));
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }


        bufferedReader.close();
        bufferedWriter.close();
    }

}
