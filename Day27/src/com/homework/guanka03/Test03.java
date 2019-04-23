package com.homework.guanka03;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 08:54
 * @description
 * 从控制台获取输入的文件目录
 * 然后将该目录(包含子目录)下的.java文件复制到D:/java文件夹中,
 * 并统计java文件的个数.
 * 提示:如果有相同的名称的文件,
 * 如果两个Test01.java,
 * 则拷贝到目标文件夹时只能有一个Test01.java,
 * 另一个Test01.java要修改为另一个名称:该名称可随机生成,只要不重复即可.
 **/
public class Test03
{
    static int num = 0;
    public static void main(String[] args)
    {
        File file = getFile();
        File destFile = new File("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\test");
        destFile.mkdirs();
        copyJavaFile(file,destFile);
        System.out.println("个数"+num);

    }

    private static void copyJavaFile(File file, File destFile)
    {
        File[] files = file.listFiles(new FileFilter()
        {
            @Override
            public boolean accept(File pathname)
            {
                if(pathname.getName().endsWith(".java")||pathname.isDirectory())
                {
                    return true;
                }
                return false;
            }
        });
        for (File thisFile:
             files)
        {
            if(thisFile.isDirectory())
            {

                copyJavaFile(thisFile, destFile);
            }
            else
            {
                String name = thisFile.getName();
                System.out.println(name);
//              在目标文件下创建同名文件
                File destName = new File(destFile,name);
//              判断是否重名
//                是否存在
                if(destName.exists())
                {
//                    重命名目标文件名
                    destName = new File(destFile,destName.getName()+new Random().nextInt(1000));
                }
                copyFile(thisFile,destName);
            }
        }
    }

    private static void copyFile(File thisFile, File destFile)
    {
        num++;
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(thisFile));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile,true)))
        {
            int len = -1;
            byte[] bytes = new byte[1024];
            while ((len = bufferedInputStream.read(bytes))!=-1)
            {
                bufferedOutputStream.write(bytes, 0, len);
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

    //    根据用户输入创建对象
    public static File getFile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件目录");
        String url = scanner.nextLine();
        File file = new File(url);
        if(!file.exists())
        {
            throw new RuntimeException("文件不存在");
        }
        if(!file.isDirectory())
        {
            throw new RuntimeException("输入不是文件目录");
        }
        return file;
    }
}

