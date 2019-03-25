package com.wanchenyang.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 18:58
 * @description
 **/
public class Extend02
{
    public static void main(String[] args) throws IOException
    {
        String[] user = new String[2];
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\user.txt"));
        String temp;
        while ((temp=bufferedReader.readLine())!=null)
        {
            user = temp.split(",");
            arrayList.add(user);
        }
//        重复验证
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入username");
        String username = scanner.nextLine();
        boolean flag =true;
        for (int i = 0; i < arrayList.size(); i++)
        {
            if(username.equals(arrayList.get(i)[0]))
            {
                flag = false;
            }
        }
        if(flag)
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\user.txt",true));
            System.out.println("请输入password");
            String password = scanner.nextLine();
//            user[0] = username;
//            user[1] = password;
//            arrayList.add(user);
//            for (int i = 0; i < arrayList.size(); i++)
//            {
//
//            }
            bufferedWriter.write(username+",");
            bufferedWriter.write(password);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        else
        {
            System.out.println("用户名已存在");
        }


    }
}
