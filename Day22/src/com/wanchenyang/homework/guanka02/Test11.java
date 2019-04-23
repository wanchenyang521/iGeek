package com.wanchenyang.homework.guanka02;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:34
 * @description
 **/
public class Test11
{
    public static void main(String[] args)
    {
//        1.	创建HashSet,用于存放学生
        HashSet<Student11> student11HashSet = new HashSet<Student11>();
//2.	使用add方法添加5个学生
        student11HashSet.add(new Student11("w", 10, 10));
        student11HashSet.add(new Student11("w1", 12, 100));
        student11HashSet.add(new Student11("w2", 13, 20));
        student11HashSet.add(new Student11("w3", 14, 40));
        student11HashSet.add(new Student11("w4", 15, 30));
        student11HashSet.add(new Student11("w4", 15, 30));
//3.	使用迭代器获取一个学生.
        Iterator<Student11> student11Iterator = student11HashSet.iterator();
//4.	定义总分变量
        int sumScore = 0;
        int height;
        int low;
//5.	定义最高分变量,初始化值为迭代出来的学生的成绩
//6.	定义最低分变量,初始化值为迭代出来的学生的成绩
        height = student11Iterator.next().getScore();
        low = height;

//7.	使用增强for循环获取遍历HashSet,获取到每个学生
        for (Student11 student:
             student11HashSet)
        {
//8.	在增强for中将学生的分数添加到总分
            sumScore += student.getScore();
//9.	在增强for中判断最高分是否小于这个学生的分数,如果最高分小于这个学生的分数,将这个学生的分数设置为最高分
//10.	在增强for中判断最低分是否大于这个学生的分数,如果最低分大于这个学生的分数,将这个学生的分数设置为最低分
            if(student.getScore()>height)
            {
                height=student.getScore();
            }
            if(student.getScore()<low)
            {
                low =student.getScore();
            }
        }
//11.	计算平均分(平均分 = 总分 / 人数)
        double averageScore = sumScore/student11HashSet.size();
//12.	按照格式打印
        System.out.println("总分"+sumScore);
        System.out.println("最高分"+height);
        System.out.println("最低分"+low);
        System.out.println("平均分"+averageScore);
    }
}
