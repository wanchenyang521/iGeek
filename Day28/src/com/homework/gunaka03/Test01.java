package com.homework.gunaka03;

import java.io.*;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:26
 * @description
 **/
public class Test01
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        File file = new File("save.txt");
        if(file.exists())
        {
            System.out.println("**** 学生基本信息 *****");
            System.out.println("学号\t姓名\t身份证号\tJava成绩\t数学成绩\t英语成绩");
            ObjectInputStream objectInputStream = new ObjectInputStream
                    (new FileInputStream(file));
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.getId()+"\t"
                    +student.getName()+"\t"
                    +student.getPersonId()+"\t"
                    +student.getJava()+"\t"
                    +student.getMath()+"\t"
                    +student.getEnglish());
            objectInputStream.close();
        }
        else
        {
            file.createNewFile();
            System.out.println("***** 录入学生信息 *****");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学号：");
            String id = scanner.nextLine();
            System.out.println("请输入姓名：");
            String name = scanner.nextLine();
            System.out.println("请输入身份证号：");
            String personId = scanner.nextLine();
            System.out.println("请输入Java成绩：");
            String java = scanner.nextLine();
            System.out.println("请输入数学成绩：");
            String math = scanner.nextLine();
            System.out.println("请输入英语成绩：");
            String english = scanner.nextLine();
            Student student = new Student(id, name, personId, java, math, english);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream
                    (new FileOutputStream(file));
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();


        }

    }
}
