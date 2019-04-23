package com.learn.test03;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 09:16
 * @description
 **/
public class Student
{
    private String name;
    private String class_number;
    private double score;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getClass_number()
    {
        return class_number;
    }

    public void setClass_number(String class_number)
    {
        this.class_number = class_number;
    }

    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    public Student()
    {
    }

    public Student(String name, String class_number, double score)
    {
        this.name = name;
        this.class_number = class_number;
        this.score = score;
    }
}
