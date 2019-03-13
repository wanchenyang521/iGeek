package com.wanchenyang.homework;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 20:37
 * @description
 *                (1)创建10个学生对象存入ArrayList集合中
 * 			(2)打印最高分的学员姓名、年龄、成绩  [要求封装1个方法  参数是集合对象   返回值类型为Student]
 * 			(3)打印10个学生的总成绩和平均分		 [要求封装两个方法完成]
 * 			(4)打印不及格的学员信息及数量		 [要求封装一个方法完成]
 **/
public class ExtendTest02
{
    public static void main(String[] args)
    {
        ArrayList<ExtendStudent> students = new ArrayList<ExtendStudent>();
        ExtendStudent[] student = new ExtendStudent[10];
        student[0] = new ExtendStudent("w", 20, 20);
        student[1] = new ExtendStudent("c", 22, 40);
        student[2] = new ExtendStudent("y", 21, 50);
        student[3] = new ExtendStudent("x", 24, 70);
        student[4] = new ExtendStudent("z", 25, 900);
        student[5] = new ExtendStudent("w", 20, 20);
        student[6] = new ExtendStudent("c", 22, 40);
        student[7] = new ExtendStudent("y", 21, 50);
        student[8] = new ExtendStudent("x", 24, 70);
        student[9] = new ExtendStudent("z", 25, 10);

        for (int i = 0; i < student.length; i++)
        {
            students.add(student[i]);
        }
        System.out.println("最高分成员："+ getMaxStudent(students).toString(getMaxStudent(students)));
        System.out.println("总成绩："+getSumScore(students));
        System.out.println("平均分："+getAverageScore(students));
        System.out.println("不及格："+getCount(students));

    }



    public static ExtendStudent getMaxStudent(ArrayList<ExtendStudent> students)
    {
//        获取成绩最高的学员
        return students.get(getMaxScore(students));
    }



    public static int getMaxScore(ArrayList<ExtendStudent> students)
    {
//        获取学生成绩的最高分
        int hight = students.get(0).getScore();
        int result = 0;
        for (int i = 0; i < students.size(); i++)
        {
            if(hight<students.get(i).getScore())
            {
                hight = students.get(i).getScore();
                result = i;
            }
        }
        return result;
    }


    public static int getSumScore(ArrayList<ExtendStudent> students)
    {
        int sumScore=0;
        for (int i = 0; i <students.size(); i++)
        {
            sumScore+=students.get(i).getScore();
        }
        return sumScore;

    }
    public static int getAverageScore(ArrayList<ExtendStudent> students)
    {
//        获取学生成绩的平均值
        int averageScore=getSumScore(students)/students.size();
        return averageScore;
    }

    public static int getCount(ArrayList<ExtendStudent> students)
    {
//        获取不及格的学员数量
        int num = 0;
        for (int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getScore()<60)
            {
                num++;
            }
        }
        return num;
    }

}
