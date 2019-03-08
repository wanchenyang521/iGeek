package com.wanchenyang.homework;

import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-08 19:18
 * @description
 **/
public class Extend01Main
{
    public static void main(String[] args)
    {
        Extend01User[] users = new Extend01User[3];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        int choose;
        while (true)
        {
            System.out.println("请输入：");
            choose = scanner.nextInt();
            if(choose==1)
            {
                if(count==3)
                {
                    System.out.println("已满，无法注册");
                }
                else
                {
                    users[count++] = registe();
                }
            }

            if(choose == 2)
            {
                login(users);
            }
            if(choose == 3)
            {
                break;
            }
        }
    }

    public static Extend01User registe()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入username");
        String username = scanner.nextLine();
        System.out.println("请输入password");
        String password = scanner.nextLine();
        System.out.println("请输入birthday");
        String birthday = scanner.nextLine();
        System.out.println("请输入hobby");
        String hobby = scanner.nextLine();
        Extend01User user = new Extend01User(username,password,birthday,hobby);
        return user;
    }

//编写方法：login()，执行登陆流程：
//请用户输入登录名、登陆密码；
//使用登录名和密码进行验证；
//通过：打印：这个用户的所有信息；
//未通过：打印：用户名或密码错误！

    public static void login(Extend01User[] users)
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag =false;
        System.out.println("请输入username");
        String loginUsername = scanner.nextLine();
        System.out.println("请输入password");
        String loginUserpassword = scanner.nextLine();
        for (int i = 0; i <=users.length; i++)
        {
            if(users[i]==null)
            {
                break;
            }
            if(loginUsername.equals(users[i].getUsername()))
            {
                if(loginUserpassword.equals(users[i].getPassword()))
                {
                    flag = true;
                    System.out.println("username:"+users[i].getUsername());
                    System.out.println("password:"+users[i].getPassword());
                    System.out.println("birthday:"+users[i].getBirthday());
                    System.out.println("hobby:"+users[i].getHobby());
                    break;
                }
            }

        }
        if(flag == false)
        {
            System.out.println("用户名或密码错误！");
        }
    }
}
