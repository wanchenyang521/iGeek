package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 08:52
 * @description
 * 1.mkdir() 创建指定的目录，确保它的上级目录存在
 * 2.mkdir() 创建指定的目录,上级目录可以不存在
 **/
public class Test08
{
    public static void main(String[] args)
    {
        File file = new File("D:\\WorkSpace\\Java\\Day26\\dir\\test");
//        boolean mkdir = file.mkdir();
//        System.out.println(mkdir);
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
//      创建目录
        file = new File("D:\\WorkSpace\\Java\\Day26\\dir\\test2");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);


    }
}
