package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 09:17
 * @description
 **/
public class CopyFile
{
    public static void main(String[] args)
    {
        File file = new File("test02.txt");
        CopyoutFile(CopyinputFile(file));

    }

//    获取文件
    public static StringBuffer CopyinputFile(File file)
    {
        InputStream fileInputStream = null;
        StringBuffer stringBuffer = new StringBuffer();
        try
        {
            fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = -1;//接受长度

            while ((len = fileInputStream.read(bytes))!=-1)
            {
                String string = new String(bytes, 0, len);
                stringBuffer.append(string);
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
        return stringBuffer;
    }
//    写文件
    public static void CopyoutFile(StringBuffer stringBuffer)
    {
        File file = new File("CopyTest.txt");
        OutputStream fileOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream(file);

            byte[] bytes = String.valueOf(stringBuffer).getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
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
            try
            {
                if ((fileOutputStream!=null))
                {
                    fileOutputStream.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
