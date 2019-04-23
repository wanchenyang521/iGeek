package com.homework.gunaka03;

import java.io.*;
import java.util.Scanner;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:42
 * @description
 * 1.	打印流的使用
 * 从键盘输入一个文件夹路径，
 * 利用打印流将该文件夹下的所有文件(包括子文件夹)复
 * 制到D盘下temp文件夹下
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        File srcfile = getFile();
        File destFile = new File("D:\\WorkSpace\\Java\\Day28\\src\\com\\homework\\gunaka03\\temp");
        copyFile(srcfile,destFile);
    }

    private static void copyFile(File srcfile, File destFile)
    {
        if(!destFile.exists())
        {
            destFile.mkdirs();
        }
        File[] files = srcfile.listFiles();
        for (File thisFile:
             files)
        {
            File newFile = new File(srcfile,thisFile.getName());
            if(newFile.isDirectory())
            {
                copyFile(thisFile, destFile);
            }
            else
            {

                copy(thisFile,destFile);
            }

        }

    }

    private static void copy(File thisFile, File destFile)
    {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream
                (new FileInputStream(thisFile)))
        {

            PrintStream printStream = new PrintStream(destFile+"\\"+thisFile.getName());
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bufferedInputStream.read())!=-1)
            {
                printStream.write(bytes, 0, len);
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
    }

    private static File getFile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String line = scanner.nextLine();
        File file = new File(line);
        if(!file.exists())
        {
            throw new RuntimeException("路径不存在");
        }
        if(!file.isDirectory())
        {
            throw new RuntimeException("不是文件夹");
        }
        return file;
    }
}
