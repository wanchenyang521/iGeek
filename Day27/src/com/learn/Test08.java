package com.learn;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:35
 * @description
 **/
public class Test08
{
    public static void main(String[] args)
    {
//        try(InputStream inputStream = new URL("http://www.baidu.com").openStream();)
//        {
//            int temp=-1;
//            while ((temp=inputStream.read())!=-1)
//            {
//
//                System.out.print((char) temp);
//                if ((char) temp == '>')
//                {
//                    System.out.println();
//                }
//            }
//
//        }
        try(InputStreamReader inputStream =new InputStreamReader( new URL("http://www.baidu.com").openStream());)
        {
            int temp=-1;
            while ((temp=inputStream.read())!=-1)
            {

                System.out.print((char) temp);
                if ((char) temp == '>')
                {
                    System.out.println();
                }
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
