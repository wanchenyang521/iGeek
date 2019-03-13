package com.wanchenyang.homework;

import com.wanchenyang.learn.StudentOs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 19:27
 * @description
 **/
public class Test03
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        int count = 0;
        for (int i = 0; i < 3 ; i++)
        {
            add(students, i);
        }
        printAll(students);
        showOne(students, findMaxHight(students));
    }
//找出身高最高的学员
      public static int findMaxHight(ArrayList<Student> students)
      {
          System.out.println("身高最高的学员");
          double maxHight = students.get(0).getHight();
          int result=0;
          for (int i = 0; i < students.size(); i++)
          {

              if(maxHight<students.get(i).getHight())
              {
                  result = i;
              }
          }
          return result;
      }

    //    显示一个信息
    public static void showOne(ArrayList<Student> students,int count)
    {
        System.out.println("学号:"+students.get(count).getStdId()
                +"\t姓名:"+students.get(count).getStdName()
                +"\t性别:"+students.get(count).getStdSex()
                +"\t年龄:"+students.get(count).getStdAge()
                +"\t身高:"+students.get(count).getHight()
               );
    }

    //查看所有的学生
    public static void printAll( ArrayList<Student> students)
    {
        System.out.println("所有学生信息：");
        if (students.size()==0)
        {
            System.out.println("无");
        }
        else
        {
            for (int i = 0; i < students.size(); i++)
            {
                showOne(students, i);
            }
        }
    }
    //    添加学生
    public static void add(ArrayList<Student> students, int count)
    {
        Scanner scanner = new Scanner(System.in);
        students.add(new Student());
        System.out.println("请输入学号");
        String isSame = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < students.size(); i++)
        {
            if(isSame.equals(students.get(i).getStdId()))
            {
                System.out.println("请重新录入");
                flag = false;
                students.remove(count);
                break;
            }
        }
        if(flag)
        {
            students.get(count).setStdId(isSame);
            System.out.println("请输入姓名");
            students.get(count).setStdName(scanner.nextLine());
            System.out.println("请输入性别");
            students.get(count).setStdSex(scanner.nextLine());
            System.out.println("请输入年龄");
            students.get(count).setStdAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("请输入身高");
            students.get(count).setHight(scanner.nextDouble());
        }else
            {
                add(students, count);
            }
    }
}
