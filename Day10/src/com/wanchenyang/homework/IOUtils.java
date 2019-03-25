package com.wanchenyang.homework;

import java.io.*;
import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 18:33
 * @description
 **/
public class IOUtils
{
//    参数String srcFile:要复制的源文件
//    参数String destDir:复制产生的新文件的存储路径(目标路径)
//    要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
    public void copyFile2Dir(String srcFile,String destDir) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
        StringBuilder stringBuilder = new StringBuilder();
        if(destDir.endsWith("\\")||destDir.endsWith("/"))
        {
            stringBuilder.append(destDir).append(srcFile);
        }
        else
        {
            stringBuilder.append(destDir).append("\\").append(srcFile);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(stringBuilder.toString()));
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

//    参数File srcDir:要复制的源文件夹
//    参数File destDir:复制产生的新文件的存储路径(目标路径)
//    要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)

    public void copyDir2Dir(String srcDir,String destDir) throws Exception
    {
        File file = new File(srcDir);
        String[] files = file.list();
        for (int i = 0; i < files.length; i++)
        {
            System.out.println(files[i]);
            if (files[i].endsWith(".txt"))
            {
                System.out.println("这是我要复制的文件:" + files[i]);
                copyTxt(files[i], destDir);
            }
        }
        System.out.println("复制完成!");
    }
    public static void copyTxt(String a, String b) throws Exception
    {
        String line;
        File file = new File(b);
        file.mkdir();
        File file2 = new File(b, a);
        file2.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        BufferedReader br = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\"+a));
        while ((line = br.readLine()) != null)
        {
            bw.write(line);
            bw.flush();
            System.out.println("成功写入!");
        }
        br.close();
        bw.close();
    }



    public static void main(String[] args) throws Exception
    {
        IOUtils ioUtils = new IOUtils();
        ioUtils.copyFile2Dir("bufferedWriter.txt", "D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt");
        ioUtils.copyDir2Dir("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt", "D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\test");
    }

}
