package com.homework.guanka01;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 10:48
 * @description
 **/
public class Test06
{
    public static void main(String[] args)
    {

        try
        {
            Student student1 = new Student("wcy", 18, "male");
            FileOutputStream fileOutputStream = new FileOutputStream("test06.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student1);
            objectOutputStream.flush();
            objectOutputStream.close();
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
