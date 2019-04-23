package com.wanchenyang.homework.guanka02;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:01
 * @description
 * ArrayList集合有以下元素:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明","张柏芝","刘德华"}.1.使用HashSet将重复的元素去除.
 * 2.编写一个方法:将去重后的人员写入到D:\\a.txt中.
 * 3.编写一个方法:将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
 **/
public class Test06
{
    public static void main(String[] args) throws IOException
    {
        //    1.	定义ArrayList
        ArrayList<String> stringArrayList = new ArrayList<String>();
//2.	使用add方法往ArrayList添加指定的内容
        stringArrayList.add("张柏芝");
        stringArrayList.add("刘德华");
        stringArrayList.add("张亮");
        stringArrayList.add("张靓颖");
        stringArrayList.add("杨颖");
        stringArrayList.add("黄晓明");
        stringArrayList.add("张柏芝");
        stringArrayList.add("刘德华");
//3.	创建HashSet.将ArrayList的内容放入HashSet去除重复内容
        HashSet<String> stringHashSet = new HashSet<String>();
        for (String string:
             stringArrayList)
        {
            stringHashSet.add(string);
        }

//9.	调用save方法,传入去重后的名称
        save(stringHashSet);
//15.	调用read方法
        read();
    }

//4.	定义save(HashSet<String> hs)方法
    public static void save(HashSet<String> hs) throws IOException
    {
//5.	在save方法中创建BufferedWriter字符输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\WorkSpace\\Java\\Day22\\src\\com\\wanchenyang\\homework\\guanka02\\a.txt"));
//6.	在save方法中遍历获取每个名称
        Iterator<String> stringIterator = hs.iterator();
        while (stringIterator.hasNext())
        {
//7.	在save方法中将名称写入指定文件中
            bufferedWriter.write(stringIterator.next());
            bufferedWriter.newLine();
        }
//8.	在save方法中关闭流
        bufferedWriter.close();
    }
//10.	定义read()方法读取指定文件内容
    public static void read() throws IOException
    {
//11.	在read()方法中创建BufferedReader字符输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\WorkSpace\\Java\\Day22\\src\\com\\wanchenyang\\homework\\guanka02\\a.txt"));
//12.	在read()方法中读取文件中的名称
        String temp;
        while ((temp=bufferedReader.readLine())!=null)
        {
            //13.	在read()方法中判断名称是否以张开头
            char isZhang = temp.charAt(0);
            if(isZhang=='张')
            {
                //14.	在read()方法中打印以张开头的名称
                System.out.println(temp);
            }

        }



    }
}
