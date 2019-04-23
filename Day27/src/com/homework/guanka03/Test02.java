package com.homework.guanka03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 08:35
 * @description
 * 在d盘目录下有一个加密文件a.txt（文件里只有英文和数字），密码是“igeek”
 * 当密码输入正确时才能读取文件里的数据。
 * 现要求用代码来模拟读取文件的过程，并统计文件里各个字母出现的次数，
 * 并把统计结果按照如下格式输出到d盘的count.txt中。
 **/
public class Test02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码");
        while (true)
        {
            String password = scanner.nextLine();
            if(password.equals("igeek"))
            {
                break;
            }
            else
            {
                System.out.println("密码错误，重新输入");
            }
        }
//        存放数据
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
//        统计计文件里各个字母出现的次数
        calcCount(characterIntegerMap);
//        保存
        saveNum(characterIntegerMap);


    }

    private static void saveNum(Map<Character, Integer> characterIntegerMap)
    {
        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\count.txt",true));
        )
        {
           for (Map.Entry<Character,Integer> thisEntry:
                 characterIntegerMap.entrySet())
            {
                bufferedWriter.write(thisEntry.getKey()+"："+thisEntry.getValue()+"个");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void calcCount(Map<Character, Integer> characterIntegerMap)
    {
        try(   BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day27\\src\\com\\homework\\a.txt"));
        )
        {
            String line = null;
            while ((line = bufferedReader.readLine())!=null)
            {
                for (int i = 0; i < line.length(); i++)
                {
                    Character character = line.charAt(i);
                    if(characterIntegerMap.containsKey(character))
                    {
                        characterIntegerMap.put(character, characterIntegerMap.get(character).intValue()+1);
                    }
                    else
                    {
                        characterIntegerMap.put(character, 1);
                    }
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
    }
}
