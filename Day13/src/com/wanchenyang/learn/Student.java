package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-18 10:44
 * @description
 **/
public class Student extends Person
{
    String id;

    public Student(String name,int age,String id)
    {
        super(name,age);
        this.id = id;
    }
}
