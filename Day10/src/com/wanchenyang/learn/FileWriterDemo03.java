package com.wanchenyang.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 09:17
 * @description
 **/
public class FileWriterDemo03
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw  = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileWriterDemo03.txt");
//        写一个字符串数据
        fw.write("hello");
//        写一个字符串中的一部分数据
        fw.write("java",1,3);
        fw.write("world");
        //写一个字符数据
        fw.write('a');
        fw.write(97);
        fw.write(65);
//        写一个字符数组
        char[] chs = {'e','f','g'};
        fw.write(chs);
//        写一个字符数组的一部分
        fw.write(chs,0,1);
        fw.flush();
        fw.close();

    }
}
