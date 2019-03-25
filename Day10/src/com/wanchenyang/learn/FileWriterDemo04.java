package com.wanchenyang.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 09:36
 * @description
 * 换行
 * windows  \r\n 会有改变
 * linux \n
 * mac \r
 *FileWriter fw  = new FileWriter(fileName,append）
 **/
public class FileWriterDemo04
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw  = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileWriterDemo05.txt",true);
//        String os = System.getProperty("os.name");
//        System.out.println(os);
//        fw.write("\n");
//        fw.write("hello");
//        fw.write("\n");
//        fw.write("world");
//        fw.write("\r\n");
//        fw.write("fuck");
        for (int i = 0; i < 10; i++)
        {
            fw.write("Hello"+i);
//            fw.write("\r\n");
            fw.write(System.getProperty("line.separator"));
        }
        fw.close();
        System.out.println("资源关闭");

    }
}
