package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 08:44
 * @description
 *字节流
 **/
public class Test01
{
    public static void main(String[] args)
    {
        File file = new File("test.txt");
        InputStream fileInputStream = null;
        try
        {
            fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        try
        {
//            根据需求选择合适的字符流。字节流

//            int data = fileInputStream.read();
//            System.out.println(data);
//            System.out.println((char) data);
            int temp;
            while ((temp = fileInputStream.read())!=-1)
            {
                System.out.println((char)temp);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }finally
        {
//            释放资源
            try
            {
                if(fileInputStream!=null)
                {
                    fileInputStream.close();
                }

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
