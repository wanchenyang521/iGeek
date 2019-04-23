package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:03
 * @description
 * 1.    创建字节输出流FileOutputStream对象并指定文件路径。
 * 2.	调用字节输出流的write(int byte)方法写出数据
 **/
public class Test01
{
    public static void main(String[] args)
    {

        OutputStream outputStream = null;
        try
        {
           outputStream = new FileOutputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test01.txt");
           outputStream.write(97);
           outputStream.flush();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(outputStream!=null)
            {
                try
                {
                    outputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
