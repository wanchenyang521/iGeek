package com.homework.guanka01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 09:54
 * @description
 * 从键盘接收用户输入的一行字符串，将这行字符串写入到C盘下a.txt文件中
 * 要求：一次写出一个字符。
 *
 *
 * 1.	创建键盘录入对象
 * 2.	接收用户输入的一行字符串
 * 3.	创建字符输出流对象并关联目标文件
 * 4.	遍历字符串获得每一个字符
 * 5.	调用输出流对象方法将字符写出到文件中。
 * 6.	关闭流释放资源。
 **/
public class Test01
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String input = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("test01.txt");
        for (int i = 0; i < input.length(); i++)
        {
            fileWriter.write(input.charAt(i));
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
