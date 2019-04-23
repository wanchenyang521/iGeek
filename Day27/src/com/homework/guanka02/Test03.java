package com.homework.guanka02;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 16:39
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        String path = "D:\\WorkSpace\\Java\\Day27\\src\\com\\learn";
        String pathCopy = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka02\\directory03";
        directoryCopy(new File(path),pathCopy);
    }

//    文件夹啊
    public static void directoryCopy(File file,String copyFile)
    {

        File[] files = file.listFiles();
        for (File thisFile:
             files)
        {
            copyFile(thisFile, new File(copyFile+"\\"+thisFile.getName()));
        }
    }

    //    字节流复制文件
    public static void copyFile(File srcFile,File descFile)
    {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try
        {
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(descFile);

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



