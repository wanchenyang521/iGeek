package com.wanchenyang.homework.guanka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 16:12
 * @description
 **/
public class Test4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day18\\src\\com\\wanchenyang\\homework\\guanka\\student.txt"));
        ArrayList<Student> arrayList = new ArrayList<Student>();
        String[] strings = new String[4];
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            strings = line.split("\\s+");
            Student student = new Student(strings[0],strings[1],strings[2],Integer.valueOf(strings[3]));
            arrayList.add(student);
        }

        int sum=0;
        for (int i = 0; i < arrayList.size(); i++)
        {
            sum+=arrayList.get(i).getAge();
        }
        System.out.println("平均年龄："+sum/arrayList.size());
        bufferedReader.close();

    }
}
