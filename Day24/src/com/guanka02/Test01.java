package com.guanka02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-09 15:28
 * @description
 **/
public class Test01
{
    public static void main(String[] args)
    {
        HashMap<String,String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (students.size()<5)
        {
            System.out.println("请输入name,age");
            String temp = scanner.nextLine();
            String[] temps = temp.split(",");
            students.put(temps[0], temps[1]);
        }

        System.out.println(students);
    }
}
