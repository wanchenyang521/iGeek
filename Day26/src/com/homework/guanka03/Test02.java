package com.homework.guanka03;


import java.io.File;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 15:45
 * @description
 * 键盘录入一个文件夹路径，删除该路径下的文件夹。
 * 要求：文件夹中包含有子文件夹
 **/
public class Test02
{

    public static void main(String[] args)
    {
        File file = inputFile();
        File pfile = file;
        delete(file,pfile);
    }

    public static File inputFile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入文件路径：");
        String pathName = scanner.nextLine();
        File file = new File(pathName);
        if(!file.exists())
        {
            throw new RuntimeException("输入的文件路径不存在");
        }
        if(!file.isDirectory())
        {
            throw new RuntimeException("输入的文件夹路径不存在");
        }
        return file;
    }
    //删除
    public static void delete(File file,File pfile)
    {
        //获取所有文件
        if(file.getName().equals(pfile.getName()))
        {
            File[] files = file.listFiles();
            for (File file2 : files)
            {
                if (file2.isDirectory())
                {
                    //如果是文件夹，递归删除
                    delete(file2, pfile);
                }
            }
        }
        else
        {
            File[] files = file.listFiles();
            for (File file2 : files)
            {
                if(file2.isFile())
                {
                    boolean flag = file2.delete();
                    if(flag)
                    {
                        System.out.println(file2+"成功删除");
                    }else
                    {
                        System.out.println(file2+"删除失败");
                    }
                }
                else
                {
                    //如果是文件夹，递归删除
                    delete(file2,pfile);
                }
            }
        }
        if(file.getName().equals(pfile.getName()))
        {
            System.out.println("删除完毕");
        }
        else
        {
            boolean success = file.delete();
            if(success)
            {
                System.out.println(success+"成功删除");
            }else
            {
                System.out.println(success+"删除失败");
            }
        }
    }
}
