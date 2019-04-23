package com.homework.guanka03;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 16:16
 * @description
 * 模拟用户登录和注册功能实现。
 * 接收用户输入的用户名和密码，然后和文件中存储的用户名、密码匹配。
 * 如果文件已经存在用户名并且密码也是正确的，提示登录成功，否则提示登录失败。
 * 如果文件中不存在该用户名，则使用该用户名和密码注册一个新的账号，并提示注册成功。
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username:");
        String username = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();
        login(username, password);

    }

    private static boolean login(String username, String password)
    {
        BufferedReader bufferedReader = null;
        //创建文件
        try
        {
            File file = new File("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka03\\test01");
            if(!file.exists())
            {
                file.createNewFile();
                return false;
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            boolean flag = false;
            while ((line = bufferedReader.readLine())!=null)
            {
                String[] strings = line.split("-");
                if(username.equals(strings[0]))
                {
                    flag = true;
                    if(password.equals(strings[1]))
                    {
                        System.out.println("登录成功");
                        return true;
                    }
                    else
                    {
                        System.out.println("密码错误");
                        return false;
                    }
                }


            }
            if(!flag)
            {
                System.out.println("不存在，进行注册中");
                register(username,password);
            }


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(bufferedReader!=null)
            {
                try
                {
                    bufferedReader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    private static void register(String username, String password)
    {
        BufferedWriter bufferedWriter = null;
        try
        {
            bufferedWriter = new BufferedWriter
                    (new FileWriter("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka03\\test01",true));
            bufferedWriter.write(username);
            bufferedWriter.write("-");
            bufferedWriter.write(password);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("注册成功");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
