package com.homework.guanka02;

import java.io.File;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 11:30
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file= new File(path);
        File[] files = file.listFiles();
        for (File thisFile:
             files)
        {
            boolean delete = thisFile.delete();
            if(delete)
            {
                System.out.println(thisFile.getName()+"删除成功");
            }
            else
            {
                System.out.println(thisFile.getName()+"删除失败");
            }
        }
        files = file.listFiles();
        if(files.length==0)
        {
            boolean deletefile = file.delete();
            System.out.println(deletefile);
        }

    }



}
