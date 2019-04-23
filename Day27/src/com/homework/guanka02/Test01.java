package com.homework.guanka02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 16:03
 * @description
 **/
public class Test01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        try(OutputStream outputStream = new FileOutputStream("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\stu.txt"))
        {
            while (true)
            {

                System.out.println("请输入，end结束");
                message = scanner.nextLine()+"\r\n";
                if(message.equals("end\r\n"))
                {
                    break;
                }
                outputStream.write(message.getBytes());
                outputStream.flush();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } ;

        {

        }


    }
}
