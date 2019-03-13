package com.wanchenyang.homework;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 17:49
 * @description
 **/
public class Test02
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student = new Student("it001","黄渤",1.72);
        Student student2 = new Student("it002","孙红雷",1.78);
        Student student3 = new Student("it003","章子怡",1.64);
        Student student4 = new Student("it004","杨颖",1.68);
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (int i = 0; i < students.size(); i++)
        {
            System.out.println("编号:"+students.get(i).getStdName()
                            +",姓名:" +students.get(i).getStdName()
                            +",身高:"+students.get(i).getHight()
                    );
        }
        System.out.println("集合大小:"+students.size());
        System.out.println("编号:"+students.get(2).getStdName()
                +",姓名:" +students.get(2).getStdName()
                +",身高:"+students.get(2).getHight()
        );

        students.remove(3);
        System.out.println("集合大小:"+students.size());
        students.set(0, new Student("it005","撒贝宁",1.67));
        System.out.println("身高在1.70以上的学员信息");
        for (int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getHight()>1.70)
            {
                System.out.println("编号:"+students.get(i).getStdName()
                        +",姓名:" +students.get(i).getStdName()
                        +",身高:"+students.get(i).getHight()
                );
            }
        }
        System.out.println("打印出“孙”姓的学员信息");
        for (int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getStdName().startsWith("孙"))
            {
                System.out.println("编号:"+students.get(i).getStdName()
                        +",姓名:" +students.get(i).getStdName()
                        +",身高:"+students.get(i).getHight()
                );
            }
        }


    }
}
