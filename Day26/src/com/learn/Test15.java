package com.learn;

import java.io.File;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 10:15
 * @description
 **/
public class Test15
{
    public static void main(String[] args) {
        File dir = new File("./");
        method(dir);
    }

    /**
     * @Title: method
     * @Description: 定义递归打印方法,打印该文件夹中所有的文件路径
     * @param dir
     */
    public static void method(File dir) {

        //获取该文件夹中的所有文件对象
        File[] filesDirs = dir.listFiles();
        //依次获取所有的文件对象
        for (File file : filesDirs) {
            //判断该文件对象是文件还是文件夹
            if(file.isFile()) {
                //如果是文件,打印路径
                System.out.println(file.getAbsolutePath());
            }else {
                //System.out.println(file.getAbsolutePath());
                //如果是文件夹,调用方法,打印该文件夹中所有的文件路径
                method(file);
            }
        }
    }

}
