package com.wanchenyang.learn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-14 08:37
 * @description
 **/
public class Test01
{

    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean flag = true;
        while (flag)
        {
            System.out.println("0.退出 1.录入");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 0:
                    flag = false;
                    break;
                case 1:
                    studentMessage(students);
                    break;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day11\\src\\com\\wanchenyang\\learn\\StudentMessage.txt"));
        for (int i = 0; i < students.size(); i++)
        {
            bufferedWriter.write(students.get(i).getStdId()+",");
            bufferedWriter.write(students.get(i).getStdName()+",");
            bufferedWriter.write(students.get(i).getStdAge()+",");
            bufferedWriter.write(students.get(i).getStdDomicile());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

//    学生信息录入
    public static void studentMessage(ArrayList<Student> students)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String stdId = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++)
        {
            if(stdId.equals(students.get(i).getStdId()))
            {
                flag = false;
                break;
            }
        }
        if(flag)
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
        }
        else
        {
            System.out.println("学号重复！！！重新输入");
        }
    }



}
