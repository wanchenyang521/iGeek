package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:33
 * @description
 **/
public class Test11
{
    public static void main(String[] args)
    {
        String src = "D:\\WorkSpace\\Java\\Day27\\cy.jpg";
        String dest = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy11.jpg";
        copyFile(src, dest);
    }
    public static void copyFile(String src,String dest)
    {
        File srcFile = new File(src);
        File descFile = new File(dest);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try
        {
           inputStream = new BufferedInputStream(new FileInputStream(srcFile));
           outputStream = new BufferedOutputStream(new FileOutputStream(descFile));

           byte[] bytes = new byte[1024];
           int len = -1;
           while ((len = inputStream.read(bytes))!=-1)
           {
               outputStream.write(bytes,0,len);
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
