package com.wanchenyang.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 11:30
 * @description
 **/
public class BufferedStreamDemo02
{
    public static void main(String[] args) throws IOException
    {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\bufferedWriter02.txt"));
//        bufferedWriter.write("Hello");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Hello2");
//        bufferedWriter.newLine();


//        for (int i = 0; i < 10; i++)
//        {
//            bufferedWriter.write("Hello"+i);
//            bufferedWriter.newLine();
//            bufferedWriter.flush();
//        }
//        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\bufferedWriter02.txt"));
//        String line = bufferedReader.readLine();
//        System.out.println(line);
//        line = bufferedReader.readLine();
//        System.out.println(line);
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
