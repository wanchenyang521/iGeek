package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:12
 * @description
 **/
public class Teacher
{
    public void test(Student s)
    {
        s.study();
    }
    public Student getStudent()
    {
        Student s = new Student();
        return s;
    }
}
