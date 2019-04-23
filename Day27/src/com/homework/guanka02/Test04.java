package com.homework.guanka02;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 11:36
 * @description
 **/
public class Test04
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka02\\testD";
        String pathCopy = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka02\\copy.txt";
        directoryCopy(new File(path),pathCopy);
    }

    //    文件夹啊
    public static void directoryCopy(File file,String copyFile)
    {
        File[] files = file.listFiles();
        for (File thisFile:
                files)
        {
            copyFile(thisFile, new File(copyFile));
        }
    }

    //    字节流复制文件
    public static void copyFile(File srcFile,File descFile)
    {
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try
        {
            inputStream = new BufferedInputStream(new FileInputStream(srcFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(descFile,true));

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
