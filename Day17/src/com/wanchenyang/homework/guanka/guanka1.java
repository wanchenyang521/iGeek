package com.wanchenyang.homework.guanka;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-26 16:07
 * @description
 **/
public class guanka1
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("张三丰");
        arrayList.add("景甜");
        arrayList.add("林思意");
        arrayList.add("鹿晗");

        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("name.txt"));
            for (int i = 0; i < arrayList.size(); i++)
            {
                bufferedWriter.write(arrayList.get(i));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
