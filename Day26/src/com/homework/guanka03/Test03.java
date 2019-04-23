package com.homework.guanka03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-12 16:08
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {

        File file = inputFile();
        Map<String,Integer> map = new HashMap<>();
        staFileType(map, file);
        //遍历Map
        for (Map.Entry<String, Integer> entrySet : map.entrySet())
        {
            System.out.println(entrySet.getKey()+"的类型的文件有"+entrySet.getValue());
        }

    }

    //统计
    public static void staFileType(Map<String,Integer> map,File file)
    {
        //文件夹
        if(file.isDirectory())
        {
            //文件数组
            File[] files = file.listFiles();
            for (File file2 : files)
            {
                staFileType(map, file2);
            }
        }
        else
        {
            //文件名
            String fileName = file.getName();
            String key = fileName.substring(fileName.lastIndexOf(".")+1);
            if(map.containsKey(key))
            {
                map.put(key, map.get(key)+1);
            }else
            {
                map.put(key, 1);
            }
        }
    }

    public static File inputFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入文件路径：");
        String pathName = scanner.nextLine();

        File file = new File(pathName);
        if (!file.exists()) {
            throw new RuntimeException("输入的文件路径不存在");
        }
        if (!file.isDirectory()) {
            throw new RuntimeException("输入的文件夹路径不存在");
        }
        return file;
    }
}
