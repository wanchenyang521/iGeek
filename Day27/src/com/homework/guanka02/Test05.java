package com.homework.guanka02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-16 11:39
 * @description
 **/
public class Test05
{
    public static void main(String[] args)
    {
        System.out.println("a"+"出现了"+calChar('a')+"次");
    }
    public static int calChar(char ch)
    {
        FileInputStream fileInputStream = null;
        int count = 0;
       try
       {
           fileInputStream = new FileInputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\guanka01Test02.txt");

           int len = -1;
           while ((len = fileInputStream.read())!=-1)
           {
               if((char)len==ch)
               {
                   count++;
               }
           }

       }
       catch (FileNotFoundException e)
       {
           e.printStackTrace();
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       return count;
    }
}
