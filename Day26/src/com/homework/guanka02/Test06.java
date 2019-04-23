package com.homework.guanka02;

import java.io.File;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 15:24
 * @description
 * 1.    创建键盘录入对象Scanner
 * 2.	定义字符串接收用户输入的文件夹路径
 * 3.	根据文件夹路径创建文件对象
 * 4.	定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，返回long类型数值表示文件夹的大小。
 * 5.	调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，
 * 得到一个文件数组，定义一个变量size累加每一个文件的大小，遍历文件数组，判断是否是文件，如果是文件则获得文件大小并累加到变量size中，如果是文件夹，继续递归调用当前方法。
 **/
public class Test06
{
    public static void main(String[] args)
    {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file= new File(path);
        long len = calculate(file);
        System.out.println("文件夹大小"+len);
    }

    private static long calculate(File file)
    {
//        调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，
//        得到一个文件数组，定义一个变量size累加每一个文件的大小，
//        遍历文件数组，判断是否是文件，
//        如果是文件则获得文件大小并累加到变量size中
//        如果是文件夹，继续递归调用当前方法。
        long sum = 0;
        File[] files = file.listFiles();
        for (File thisFile:
             files)
        {
            if(thisFile.isFile())
            {
                sum += thisFile.length();
            }
            else if(thisFile.isDirectory())
            {
                calculate(thisFile);
            }
        }
        return sum;
    }
}
