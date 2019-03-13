package com.wanchenyang.homework;

import sun.java2d.pipe.AAShapePipe;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 20:01
 * @description
 **/
public class StudentsTool
{
    public void listStudents(ExtendStudent[] arr)
    {
//        遍历打印学生信息
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("姓名"+arr[i].getName()
                    +"年龄"+arr[i].getAge()
                    +"成绩"+arr[i].getAge());
        }
    }

    public int getMaxScore(ExtendStudent[] arr)
    {
//        获取学生成绩的最高分坐标
        int hight = arr[0].getScore();
        int result = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(hight<arr[i].getScore())
            {
                hight = arr[i].getScore();
                result = i;
            }
        }
        return result;
    }
    public ExtendStudent getMaxStudent(ExtendStudent[] arr)
    {
//        获取成绩最高的学员
        return arr[getMaxScore(arr)];

    }

    public int getAverageScore(ExtendStudent[] arr)
    {
//        获取学生成绩的平均值
        int averageScore=0;
        for (int i = 0; i < arr.length; i++)
        {
            averageScore+=arr[i].getScore();
        }
        return averageScore/arr.length;
    }
    public int getCount(ExtendStudent[] arr)
    {
//        获取不及格的学员数量
        int num = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].getScore()<60)
            {
                num++;
            }
        }
        return num;
    }


}
