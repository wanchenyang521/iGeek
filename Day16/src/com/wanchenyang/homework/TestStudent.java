package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:20
 * @description
 **/
public class TestStudent
{
    public static void main(String[] args)
    {
        Student s1 = new Student("景甜",22);
        Student s2 = new Student("林思意",18);
        System.out.println(s1.school);
        s1.school = " 极客营";
        System.out.println(s2.school);
    }
}
