package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 15:25
 * @description
 * 利用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
 **/
public class Test10
{
    public static void main(String[] args)
    {
        String src = "D:\\WorkSpace\\Java\\Day27\\cy.jpg";
        String destPath = "D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\cy10.jpg";
        copyFile(src,destPath);

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
            int len = -1;
            while ((len = inputStream.read())!=-1)
            {
                outputStream.write((char)len);
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
