package com.learn;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:10
 * @description
 * InputStreamReader 字节流通向字符流的桥梁
 * OutputStreamWriter 字符流通向字节流的桥梁
 *
 **/
public class Test06
{
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        BufferedWriter writer = null;
//        循环获取键盘录入字符，exit退出
        String message = "";
        try
        {
            reader= new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new OutputStreamWriter(System.out));
            while (!message.equals("exit"))
            {
                message = reader.readLine();
                writer.write(message);
                writer.newLine();
                writer.flush();
            }
        }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if(writer!=null)
                {
                    try
                    {
                        writer.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                if(reader!=null)
                {
                    try
                    {
                        reader.close();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }

    }
}
