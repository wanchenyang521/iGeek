package com.wanchenyang.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 09:02
 * @description
 * 相对路径：相对当前项目而言，在项目的根目录下（a.txt）
 * 绝对路径：以盘符为开始（D:\WorkSpace\Java\Day10\FileWriterDemo.txt）
 *
 * close() 和 flush()
 * flush() 刷新缓冲区，流对象还可以继续使用
 * close() 先刷新缓冲区，然后通知系统释放资源，流对象不可以在被使用
 *
 **/
public class FileWriterDemo02
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileWriterDemo.txt");
        fw.write("123");
        fw.flush();
        fw.write("abc");
        fw.flush();
        fw.close();
//         java.io.IOException: Stream closed
//        fw.write("aaa");
//        fw.flush();
    }
}
