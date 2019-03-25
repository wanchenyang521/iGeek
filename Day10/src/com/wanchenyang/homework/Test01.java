package com.wanchenyang.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 15:21
 * @description
 * 项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 **/
public class Test01
{

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\test01.txt"));
        Scanner scanner = new Scanner(System.in);
        String temp;
        while (true)
        {
            System.out.println("请输入,当输入”886”时，程序结束");
            temp = scanner.nextLine();
            if(temp.equals("886"))
            {
                break;
            }
            else
            {
                arrayList.add(temp);
            }
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        
        
        
        
    }
}
