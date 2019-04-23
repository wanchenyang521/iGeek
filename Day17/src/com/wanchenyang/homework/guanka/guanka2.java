package com.wanchenyang.homework.guanka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:11
 * @description
 **/
public class guanka2
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("name.txt"));
            String len;
            while ((len=bufferedReader.readLine())!=null)
            {
                arrayList.add(len);
            }
            bufferedReader.close();

            for (int i = 0; i < arrayList.size(); i++)
            {
                System.out.println(arrayList.get(i));
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
    }
}
