package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 09:35
 * @description
 **/
public class CopyTeacher
{
    public static void main(String[] args)
    {
//        copyFile("test02.txt", "copyTeacher.txt");
        copyFile("cy.jpg", "copyCy.jpg");
    }

    public static void copyFile(String srcPath,String destPath)
    {
//        创建源
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
//        选择流
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try
        {
            inputStream = new BufferedInputStream(new FileInputStream(srcFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(destFile));
            byte[] temp = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(temp))!=-1)
            {
                outputStream.write(temp,0,len);
            }
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
