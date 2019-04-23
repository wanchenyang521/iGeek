package com.homework.guanka01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:07
 * @description
 * 键盘接收用户输入的一行字符串，将这行字符串写入到C盘下b.txt文件中
 * 要求：一次写出一个字符数组。
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String line = scanner.nextLine();
        char[] bytes = line.toCharArray();
        FileWriter fileWriter = new FileWriter("test02.txt");
        fileWriter.write(bytes);
        fileWriter.flush();
        fileWriter.close();



    }
}
