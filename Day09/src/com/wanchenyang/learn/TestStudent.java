package com.wanchenyang.learn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 15:32
 * @description
 **/
public class TestStudent
{
    public static void main(String[] args)
    {
        int choose;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<StudentOs> students = new ArrayList<StudentOs>();
        while (true)
        {
            System.out.println("----------欢迎进入学生管理系统----------");
            System.out.println("1.查看所有学生 2.添加学生 3.删除学生 4.修改学生  5.退出");
            choose = scanner.nextInt();
            switch (choose)
            {
                case 1:
                    showMessage(students);
                    break;
                case 2:
                    count = add(students, count);
                    break;
                case 3:
                    del(students);
                    count--;
                    break;
                case 4:
                    setStd(students);
                    break;
                case 5:
                    System.out.println("----------欢迎再次使用本系统----------");
                    System.exit(0);
                    break;

            }
        }
    }

    //    显示一个信息
    public static void show(ArrayList<StudentOs> students, int count)
    {
        System.out.println("学号:" + students.get(count).getStdId()
                + "\t姓名:" + students.get(count).getStdName()
                + "\t年龄:" + students.get(count).getStdAge()
                + "\t性别:" + students.get(count).getSex());
    }

    //查看所有的学生
    public static void showMessage(ArrayList<StudentOs> students)
    {
        System.out.println("所有学生信息：");
        if (students.size() == 0)
        {
            System.out.println("无");
        }
        else
        {
            for (int i = 0; i < students.size(); i++)
            {
                show(students, i);
            }
        }
    }

    //    添加学生
    public static int add(ArrayList<StudentOs> students, int count)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String s = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getStdId().equals(s))
            {
                System.out.println("学号重复");
                flag = false;
                break;
            }
        }
        if (flag)
        {
            students.add(new StudentOs());
            students.get(count).setStdId(s);
            System.out.println("请输入姓名");
            students.get(count).setStdName(scanner.nextLine());
            System.out.println("请输入年龄");
            students.get(count).setStdAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("请输入性别");
            students.get(count).setSex(scanner.nextLine());
            show(students, count);
            count++;
        }
        return count;
    }
    //    显示下标
    public static void showIndex(ArrayList<StudentOs> students)
    {
        System.out.print("编号：");
        if (students.size() == 0)
        {
            System.out.println("无");
        }
        else
        {
            for (int i = 0; i < students.size(); i++)
            {
                System.out.print(students.get(i).getStdId() + " ");
            }
        }
    }
    //删除
    public static void del(ArrayList<StudentOs> students)
    {
        Scanner scanner = new Scanner(System.in);
        showIndex(students);
        if (students.size() == 0)
        {
            System.out.println("没有学生可删除");
        }
        else
        {
            Boolean stdIdFlag = false;
            System.out.println("\n请输入删除编号：");
            String index = scanner.nextLine();
            for (int i = 0; i < students.size(); i++)
            {
                if (index.equals(students.get(i).getStdId()))
                {
                    students.remove(i);
                    stdIdFlag = true;
                }
            }

            if (!stdIdFlag)
            {
                System.out.println("输入错误,学生不存在");
            }
            else
            {
                showIndex(students);
                System.out.println();
            }
        }

    }
    public static void setStd(ArrayList<StudentOs> students)
    {
        Scanner scanner = new Scanner(System.in);
        showIndex(students);
        if (students.size() == 0)
        {
        }
        else
        {
            System.out.println("\n请输入学生编号");
            String index = scanner.nextLine();
            for (int i = 0; i < students.size(); i++)
            {
                if (index.equals(students.get(i).getStdId()))
                {
                    System.out.println("请输入修改编号：");
                    show(students, i);
                    System.out.println("0.全部修改 1.修改学号 2.修改姓名 3.修改年龄 4.修改性别");
                    int flag = scanner.nextInt();
                    switch (flag)
                    {
                        case 0:
                            System.out.println("请输入学号");
                            scanner.nextLine();
                            String s = scanner.nextLine();
                            boolean flags = true;
                            for (int j = 0; j < students.size(); j++)
                            {
                                if (students.get(j).getStdId().equals(s))
                                {
                                    System.out.println("学号重复");
                                    flags = false;
                                    break;
                                }
                            }
                            if (flags)
                            {
                                students.get(i).setStdId(s);
                                System.out.println("请输入姓名");
                                students.get(i).setStdName(scanner.nextLine());
                                System.out.println("请输入年龄");
                                students.get(i).setStdAge(scanner.nextInt());
                                scanner.nextLine();
                                System.out.println("请输入性别");
                                students.get(i).setSex(scanner.nextLine());
                            }
                            break;
                        case 1:
                            System.out.println("请输入学号");
                            scanner.nextLine();
                            s = scanner.nextLine();
                            flags = true;
                            for (int j = 0; j < students.size(); j++)
                            {
                                if (students.get(j).getStdId().equals(s))
                                {
                                    System.out.println("学号重复");
                                    flags = false;
                                    break;
                                }
                            }
                            if (flags)
                            {
                                students.get(i).setStdId(s);
                            }
                            break;
                        case 2:
                            System.out.println("请输入姓名");
                            scanner.nextLine();
                            students.get(i).setStdName(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("请输入年龄");
                            scanner.nextLine();
                            students.get(i).setStdAge(scanner.nextInt());
                            break;
                        case 4:
                            System.out.println("请输入性别");
                            scanner.nextLine();
                            students.get(i).setSex(scanner.nextLine());
                            break;
                    }
                }
            }
        }
    }
}
