package com.homework.guanka01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:57
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("test06.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
            objectInputStream.close();

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
