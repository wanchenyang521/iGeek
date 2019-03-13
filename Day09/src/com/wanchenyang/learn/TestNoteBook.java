package com.wanchenyang.learn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 14:34
 * @description
 **/
public class TestNoteBook
{
    public static void main(String[] args)
    {
        int choose;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<NoteBook> arrayList = new ArrayList<NoteBook>();
        while (true)
        {
            System.out.println(" 0.退出 1.新建 2.存储 3.查看 4.删除 5.记录数量 6.列出记录");
            choose = scanner.nextInt();
            switch (choose)
            {
                case 0:
                    System.exit(0);
                case 1:
                     count=add(arrayList,count);
                    break;
                case 2:
                    insert(arrayList);
                    break;
                case 3:
                    look(arrayList);
                    break;
                case 4:
                    del(arrayList);
                    break;
                case 5:
                    System.out.println("一共有记录"+arrayList.size()+"条");
                    break;
                case 6:
                    message(arrayList);
                    break;
            }
        }
    }

    public static int add( ArrayList<NoteBook> arrayList,int count)
    {
        arrayList.add(new NoteBook());
        arrayList.get(count).setId(count);
        System.out.println("记录编号："+arrayList.get(count).getId());
        System.out.println("记录内容："+arrayList.get(count).getString());
        count++;
        return count;
    }
    public static void insert(ArrayList<NoteBook> arrayList)
    {
        Scanner scanner = new Scanner(System.in);
       show(arrayList);
        System.out.println();
        System.out.println("请输入修改那条记录：");
        int index = scanner.nextInt();
        System.out.println("请输入增加内容：");
        scanner.nextLine();
        String s = scanner.nextLine();
        arrayList.get(index).setString(s);
    }
    public static void look(ArrayList<NoteBook> arrayList)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查看下标：");
        int index = scanner.nextInt();
        System.out.println(arrayList.get(index).getString());
    }
    public static void del(ArrayList<NoteBook> arrayList)
    {
        Scanner scanner = new Scanner(System.in);
        show(arrayList);
        System.out.println("请输入删除下标：");
        int index = scanner.nextInt();
        arrayList.remove(index);
        show(arrayList);
    }
    public static void message(ArrayList<NoteBook> arrayList)
    {
        System.out.println("详情：");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println("Id:"+arrayList.get(i).getId()+" word:"
                    +arrayList.get(i).getString());
        }
    }

    public static void show(ArrayList<NoteBook> arrayList)
    {
        System.out.print("编号为：");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i).getId()+" ");
        }
    }

}
