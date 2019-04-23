package com.homework.guanka01;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 11:00
 * @description
 **/
public class Test08
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String string = scanner.nextLine();
        PrintStream printStream = new PrintStream("test08.txt");
        printStream.println(string);
        printStream.close();


    }
}
