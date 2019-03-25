package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-23 11:20
 * @description
 **/
public class Student
{
    //	学校
    public static String school  = "清华大学";
    //	姓名
    private String name;
    //	年龄
    private int age;
    //	构造方法
    public Student() {
        super();
    }
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

}
