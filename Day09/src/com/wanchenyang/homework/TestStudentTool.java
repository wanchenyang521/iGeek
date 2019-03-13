package com.wanchenyang.homework;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 20:14
 * @description
 **/
public class TestStudentTool
{
    public static void main(String[] args)
    {
        ExtendStudent[] student = new ExtendStudent[5];
        student[0] = new ExtendStudent("w", 20, 20);
        student[1] = new ExtendStudent("c", 22, 40);
        student[2] = new ExtendStudent("y", 21, 50);
        student[3] = new ExtendStudent("x", 24, 70);
        student[4] = new ExtendStudent("z", 25, 90);
        StudentsTool studentsTool = new StudentsTool();
        studentsTool.listStudents(student);
        System.out.println("最高分："+studentsTool.getMaxScore(student));
        System.out.println("最高分成员："+ studentsTool.getMaxStudent(student).toString(studentsTool.getMaxStudent(student)));
        System.out.println("学生成绩的平均值:"+studentsTool.getAverageScore(student));
        System.out.println("不及格的学员数量:"+studentsTool.getCount(student));
    }
}
