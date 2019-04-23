package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 09:07
 * @description
 **/
public class Test03
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
            byte[] bytes = new byte[1024];
            int len = -1;//接受长度
            while ((len = fileInputStream.read(bytes))!=-1)
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
