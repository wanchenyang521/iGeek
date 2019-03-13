package com.wanchenyang.learn;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 11:17
 * @description
 **/
public class TestArrayList05
{
    public static void main(String[] args)
    {
        Student[] students = new Student[3];
        students[0] = new Student("001", "Wan", 20);
        students[1] = new Student("002", "Chen", 20);
        students[2] = new Student("003", "yang", 20);
        ArrayList<Student> arrayList = new ArrayList<Student>();
        for (int i = 0; i < students.length; i++)
        {
            arrayList.add(students[i]);
            System.out.println(arrayList.get(i).getName()+",age:"+arrayList.get(i).getAge());
        }
    }
}
