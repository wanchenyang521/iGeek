package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-19 10:21
 * @description
 **/
public class Student extends Person
{
    private double score;

    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    public Student(String name, String age, double score)
    {
        super(name, age);
        this.score = score;
    }

    public Student()
    {
    }

    @Override
    public void eat()
    {
        System.out.println("成绩为"+score+"分的"+super.getAge()+"岁的"+super.getName()+"学生在吃学生餐");
    }

    @Override
    public void say(String content)
    {

    }

    public void study()
    {
        System.out.println("成绩为"+score+"分的"+super.getAge()+"岁的"+super.getName()+"学生在学习");
    }

}
