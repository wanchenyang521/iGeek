package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 10:59
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        File file = new File("cy.jpg");
        InputStream inputStream = null;
        try
        {
            inputStream =   new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(bytes))!=-1)
            {
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(inputStream!=null)
                {
                    inputStream.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
