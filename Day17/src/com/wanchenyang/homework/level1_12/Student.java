package com.wanchenyang.homework.level1_12;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-25 20:27
 * @description
 **/
public class Student
{
    private String name;
    private int score;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        if(score<0)
            throw new NoScoreException("分数不能为负数:"+score);
        else
        {
            this.score = score;
        }

    }

    public Student()
    {
    }

    public Student(String name, int score)
    {
        setName(name);
        setScore(score);
    }
}
