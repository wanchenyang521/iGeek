package com.wanchenyang.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 09:28
 * @description
 **/
public class FileWriterDemo01
{
    public static void main(String[] args) throws IOException
    {
        //文件没有会自己创建
        //文件存在会替换文件
        FileWriter fw = new FileWriter("D:\\WorkSpace\\Java\\Day10\\FileWriterDemo.txt");
        fw.write("Fuck World");//放在缓存区，没有满不会写入文件
        fw.flush(); //手动将缓存区的内容写入文件
        fw.write("Fuck！！！World");//再次调用将内容添加已有内容后面
        fw.flush(); //手动将缓存区的内容写入文件
//        写完之后将输出流关闭，释放资源
        fw.close();


    }
}
