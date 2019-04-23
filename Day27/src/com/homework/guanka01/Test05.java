package com.homework.guanka01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:20
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        InputStream inputStream = null;
        try
        {
            inputStream = new FileInputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test02.txt");
            byte[] bytes = new byte[1024];
            int len = -1;//接受长度
            while ((len = inputStream.read(bytes))!=-1)
            {
                String string = new String(bytes, 0, len);
                System.out.println(string);
            }
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
            if(inputStream!=null)
            {
                try
                {
                    inputStream.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
