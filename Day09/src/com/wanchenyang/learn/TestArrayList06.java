package com.wanchenyang.learn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 11:36
 * @description
 * 通过键盘录入
 **/
public class TestArrayList06
{
//    public static void main(String[] args)
//    {
////        Student[] students = new Student[3];
//        ArrayList<Student> arrayList = new ArrayList<Student>();
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i <2; i++)
//        {
//            Student student = new Student();
//            System.out.println("请输入id");
////            students[i].setId(scanner.nextLine());
//            student.setName(scanner.nextLine());
//            System.out.println("请输入name");
////            students[i].setName(scanner.nextLine());
//            student.setName(scanner.nextLine());
//            System.out.println("请输入age");
////            students[i].setAge(scanner.nextInt());
//            student.setAge(scanner.nextInt());
////            arrayList.add(students[i]);
//            arrayList.add(student);
//            System.out.println(arrayList.get(i).getName()+",age:"+arrayList.get(i).getAge());
//        }
    public static void main(String[] args)
    {
        Student[] students = new Student[3];
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <students.length; i++)
        {
            students[i] = new Student();
            System.out.println("请输入id");
            students[i].setId(scanner.nextLine());
            System.out.println("请输入name");
            students[i].setName(scanner.nextLine());
            System.out.println("请输入age");
            students[i].setAge(scanner.nextInt());
            scanner.nextLine();
            arrayList.add(students[i]);
            System.out.println(arrayList.get(i).getName()+",age:"+arrayList.get(i).getAge());
        }

    }
}
