package com.learn;

import java.io.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-15 14:23
 * @description
 **/
public class Test07
{
    public static void main(String[] args)
    {
        String message = "";
        try( BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter  writer = new BufferedWriter(new OutputStreamWriter(System.out));)
        {


            while (!message.equals("exit"))
            {
                message = reader.readLine();
                writer.write(message);
                writer.newLine();
                writer.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
