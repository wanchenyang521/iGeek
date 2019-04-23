package com.homework.guanka02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:07
 * @description
 **/
public class Test03
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream("test02.txt"));
        ArrayList<Student> studentArrayList = (ArrayList<Student>) objectInputStream.readObject();
        objectInputStream.close();
        for (Student thisStudent:
             studentArrayList)
        {
            System.out.println(thisStudent);
        }

    }
}
