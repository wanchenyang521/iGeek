package com.homework.guanka02;

import java.io.*;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 16:25
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\stu.txt")))
        {
            ArrayList<Student> students = new ArrayList<Student>();
            String s;
            while ((s = reader.readLine())!=null)
            {
                String[] temp =s.split("-");
                Student student = new Student(temp[0],temp[1]);
                students.add(student);
            }
            System.out.println(students);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
