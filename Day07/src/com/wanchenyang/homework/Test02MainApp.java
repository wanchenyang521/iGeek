package com.wanchenyang.homework;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:48
 * @description
 **/
public class Test02MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学员编号");
        String studentId = scanner.next();
        System.out.println("请输入学员姓名");
        String studentName = scanner.next();
        System.out.println("请输入学员性别");
        String studentSex = scanner.next();
        System.out.println("请输入学员身高");
        double studentHight = scanner.nextDouble();
        System.out.println("请输入学员年龄");
        int studentAge = scanner.nextInt();
        Test02Student student = new Test02Student(studentId,studentName,studentSex,studentHight,studentAge);
        System.out.println("学员编号"+student.getStudentId());
        System.out.println("学员姓名"+student.getStudentName());
        System.out.println("学员性别"+student.getStudentSex());
        System.out.println("学员身高"+student.getStudentHight());
        System.out.println("学员年龄"+student.getStudentAge());



    }
}
