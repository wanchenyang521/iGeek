package com.wanchenyang.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 15:28
 * @description
 * 需求说明：从控制台接收3名学员的信息，
 * 每条进行存储到一个Student对象中，将多个Student对象存储到一个集合中。
 * 输入完毕后，将所有学员信息存储到文件Student.txt中。
 * 每名学员信息存储一行，多个属性值中间用逗号隔开。
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> students = new ArrayList<Student>();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\Student.txt"));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            Student student = new Student();
            students.add(student);
            System.out.println("第"+(i+1)+"位同学信息");
            System.out.println("请输入id");
            students.get(i).setStdId(scanner.nextLine());
            System.out.println("请输入name");
            students.get(i).setStdName(scanner.nextLine());
            System.out.println("请输入sex");
            students.get(i).setStdSex(scanner.nextLine());
            System.out.println("请输入age");
            students.get(i).setStdAge(scanner.nextInt());
            scanner.nextLine();
        }
        for (int i = 0; i < students.size(); i++)
        {
            bufferedWriter.write(students.get(i).getStdId()+",");
            bufferedWriter.write(students.get(i).getStdName()+",");
            bufferedWriter.write(students.get(i).getStdSex()+",");
            bufferedWriter.write(String.valueOf(students.get(i).getStdAge()));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

    }
}
