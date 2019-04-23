package com.learn;

import java.io.File;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 08:42
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\io.txt");
        File file2 = new File("D:\\WorkSpace\\Java\\Day26\\ios");
        try
        {
//            创建文件
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            boolean newFile2 = file2.createNewFile();
            System.out.println(newFile2);

//            删除文件
            newFile = file.delete();
            System.out.println(newFile);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
