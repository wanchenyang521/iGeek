package com.homework.guanka01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:12
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {

        OutputStream outputStream = null;
        try
        {
            outputStream = new FileOutputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test03.txt",true);
            String message = "i love java\r\n";
            for (int i = 0; i < 5; i++)
            {
                outputStream.write(message.getBytes());
                outputStream.flush();
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
