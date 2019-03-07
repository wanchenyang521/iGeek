package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 19:10
 * @description
 **/
public class Extend02MainApp
{
    public static void main(String[] args)
    {
        Extend02Teacher teacher = new Extend02Teacher("万晨阳", 21, "Java基础中面向对象");
        teacher.teach();


        Extend02Student student = new Extend02Student();
        student.setName("晨阳");
        student.setAge(20);
        student.setContent("面向对象");
        student.learn();


    }
}
