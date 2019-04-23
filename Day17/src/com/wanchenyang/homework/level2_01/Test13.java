package com.wanchenyang.homework.level2_01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 20:35
 * @description
 **/
public class Test13
{
    /**
     * @param src 源文件路径
     * @param dest 目标文件路径
     */
    public static void copyFile(String src,String dest)
    {
        BufferedReader bufferedReader =null;
        BufferedWriter bufferedWriter =null;

        try
        {
            bufferedReader = new BufferedReader(new FileReader(src));
            bufferedWriter = new BufferedWriter(new FileWriter(dest));
            char[] chs = new char[1024];
            int len=0;
            while ((len = bufferedReader.read(chs))!=-1)
            {
               bufferedWriter.write(chs,0,len);
               bufferedWriter.flush();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(bufferedReader!=null|bufferedWriter!=null)
                {
                    bufferedReader.close();
                    bufferedWriter.close();
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        copyFile("D:\\WorkSpace\\Java\\Day17\\content.txt","D:\\WorkSpace\\Java\\Day17\\Copycontent.txt");
    }

}
