package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 08:57
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        File file = new File("test02.txt");
        OutputStream fileOutputStream = null;

        try
        {
            fileOutputStream = new FileOutputStream(file);
            String message = "fuck world";
            byte[] bytes = message.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
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
            try
            {
                if ((fileOutputStream!=null))
                {
                    fileOutputStream.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
