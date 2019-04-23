package com.homework.guanka01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:16
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        InputStream inputStream = null;

        try
        {
            inputStream = new FileInputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test03.txt");
            int len = -1;
            while ((len = inputStream.read())!=-1)
            {
                System.out.print((char)len);
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
