package com.learn;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:48
 * @description
 **/
public class Test09
{
    public static void main(String[] args)
    {
        try(BufferedReader inputStream = new BufferedReader
                ( new InputStreamReader
                        ( new URL("http://www.baidu.com").openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter
                        (new OutputStreamWriter
                                (new FileOutputStream("baidu.html")))
               )
        {
           String msg;
           while ((msg = inputStream.readLine())!=null)
           {
               bufferedWriter.write(msg);
               bufferedWriter.newLine();
               bufferedWriter.flush();

           }


        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
