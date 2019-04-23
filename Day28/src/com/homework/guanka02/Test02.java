package com.homework.guanka02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 11:39
 * @description
 **/
public class Test02
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("wcy1", 18, "male");
        Student student2 = new Student("wcy2", 18, "male");
        Student student3 = new Student("wcy3", 18, "male");
        Student student4 = new Student("wcy4", 18, "male");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("test02.txt"));
        objectOutputStream.writeObject(studentArrayList);
        objectOutputStream.close();


    }
}
