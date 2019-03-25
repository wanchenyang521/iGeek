package com.wanchenyang.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 15:57
 * @description
 **/
public class Text03
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> students = new ArrayList<Student>();
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\name.txt"), "UTF-8");
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\name.txt"));
        String temp;
        while ((temp=bufferedReader.readLine())!=null)
        {
            String[] strings = temp.split(",");
            Student student = new Student();
            student.setStdId(strings[0]);
            student.setStdName(strings[1]);
            if(student.getStdName().equals("卢俊义"))
            {
                student.setStdName("史文恭");
            }
            student.setStdSex(strings[2]);
            student.setStdAge(Integer.parseInt(strings[3]));
            students.add(student);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day10\\src\\com\\wanchenyang\\homework\\txt\\name.txt"));
        for (int i = 0; i < students.size(); i++)
        {
            bufferedWriter.write(students.get(i).getStdId()+",");
            bufferedWriter.write(students.get(i).getStdName()+",");
            bufferedWriter.write(students.get(i).getStdSex()+",");
            bufferedWriter.write(String.valueOf(students.get(i).getStdAge()));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
