package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:13
 * @description
 **/
public class TeacherTest
{
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher();
        Student s = new Student();
        teacher.test(s);
        System.out.println(s);
        Student s1 = teacher.getStudent();
        System.out.println(s1);
    }
}
