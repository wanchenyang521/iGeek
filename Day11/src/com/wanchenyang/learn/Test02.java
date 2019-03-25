package com.wanchenyang.learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-14 09:14
 * @description
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day11\\src\\com\\wanchenyang\\learn\\StudentMessage.txt"));
        ArrayList<Student> arrayList = new ArrayList<Student>();
        String temp;
        while ((temp = bufferedReader.readLine())!=null)
        {
            String[] strings = temp.split(",");
            Student student = new Student();
            student.setStdId(strings[0]);
            student.setStdName(strings[1]);
            student.setStdAge(Integer.valueOf(strings[2]));
            student.setStdDomicile(strings[3]);
            arrayList.add(student);
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i).getStdId()+",");
            System.out.print(arrayList.get(i).getStdName()+",");
            System.out.print(arrayList.get(i).getStdAge()+",");
            System.out.println(arrayList.get(i).getStdDomicile());
        }
        bufferedReader.close();

    }

}
