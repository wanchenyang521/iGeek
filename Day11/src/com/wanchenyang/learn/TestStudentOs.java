package com.wanchenyang.learn;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-14 09:45
 * @description
 **/
public class TestStudentOs
{
    public static void main(String[] args) throws IOException
    {
        int choose;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true)
        {
            System.out.println("----------欢迎进入学生管理系统----------");
            System.out.println("1.查看所有学生 2.添加学生 3.删除学生 4.修改学生 5.退出");
            choose = scanner.nextInt();
            switch (choose)
            {
                case 1:
                    showMessage(students);
                    break;
                case 2:
//                    先录入到数组
                    studentMessage(students);
                    break;
                case 3:
                    del(students);
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

    //    写入文件
    public static void writeMess(ArrayList<Student> students) throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day11\\src\\com\\wanchenyang\\learn\\StudentMessage.txt"));
        for (int i = 0; i < students.size(); i++)
        {
            bufferedWriter.write(students.get(i).getStdId() + ",");
            bufferedWriter.write(students.get(i).getStdName() + ",");
            bufferedWriter.write(students.get(i).getStdAge() + ",");
            bufferedWriter.write(students.get(i).getStdDomicile());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    // 读取文件
    public static void readMess(ArrayList<Student> arrayList) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day11\\src\\com\\wanchenyang\\learn\\StudentMessage.txt"));
        String temp;
        while ((temp = bufferedReader.readLine()) != null)
        {
            String[] strings = temp.split(",");
            Student student = new Student();
            student.setStdId(strings[0]);
            student.setStdName(strings[1]);
            student.setStdAge(Integer.valueOf(strings[2]));
            student.setStdDomicile(strings[3]);
            arrayList.add(student);
        }
        bufferedReader.close();
    }

    //    显示一个信息
    public static void show(Student students)
    {
        System.out.println("学号:" + students.getStdId()
                + "\t姓名:" + students.getStdName()
                + "\t年龄:" + students.getStdAge()
                + "\t地址:" + students.getStdDomicile());
    }

    //查看所有的学生
    public static void showMessage(ArrayList<Student> students) throws IOException
    {
        students.clear();
        readMess(students);
        System.out.println("所有学生信息：");
        if (students.size() == 0)
        {
            System.out.println("无");
        }
        else
        {
            for (int i = 0; i < students.size(); i++)
            {
                show(students.get(i));
            }
        }
    }

    //    学生信息录入
    public static void studentMessage(ArrayList<Student> students) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String stdId = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++)
        {
            if (stdId.equals(students.get(i).getStdId()))
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            Student student = new Student();
            student.setStdId(stdId);
            System.out.println("请输入学生姓名");
            student.setStdName(scanner.nextLine());
            System.out.println("请输入学生年龄");
            student.setStdAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("请输入学生地址");
            student.setStdDomicile(scanner.nextLine());
            students.add(student);
            writeMess(students);
        }
        else
        {
            System.out.println("学号重复！！！重新输入");
        }
    }

    //   显示下标
    public static void showIndex(ArrayList<Student> students)
    {
        System.out.print("学号：");
        if (students.size() == 0)
        {
            System.out.println("无");
        }
        else
        {
            for (int i = 0; i < students.size(); i++)
            {
                System.out.print(students.get(i).getStdId() + ",");
            }
        }
    }

    //删除
    public static void del(ArrayList<Student> students) throws IOException
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
        writeMess(students);

    }

    public static void setStd(ArrayList<Student> students) throws IOException
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
                    show(students.get(i));
                    System.out.println("请输入修改编号：");
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
                                System.out.println("请输入地址");
                                students.get(i).setStdDomicile(scanner.nextLine());
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
                            System.out.println("请输入地址");
                            scanner.nextLine();
                            students.get(i).setStdDomicile(scanner.nextLine());
                            break;
                    }
                    writeMess(students);
                }
            }
        }


    }
}
