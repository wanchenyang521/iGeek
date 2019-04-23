package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:06
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {

        OutputStream outputStream = null;
        try
        {
            outputStream = new FileOutputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test02.txt");
            byte[] bytes = new byte[]{99,98,97};
            outputStream.write(bytes);
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
