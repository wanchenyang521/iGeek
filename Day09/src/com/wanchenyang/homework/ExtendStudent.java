package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 19:58
 * @description
 **/
public class ExtendStudent
{
    private String name;
    private int age;
    private int score;

    public ExtendStudent(String name, int age, int score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public ExtendStudent()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }
    public void eat()
    {
        System.out.println("吃饭");
    }
    public void study(String content)
    {
        System.out.println("content:"+content);
    }


    public String toString(ExtendStudent student)
    {
//        StudentsTool studentsTool = new StudentsTool();
            return  "["+student.getName()+","+student.getAge()+","+student.getScore()+"]" ;
//        return "最高分成员："+studentsTool.getMaxStudent(student).getName()+
//                "成绩："+studentsTool.getMaxStudent(student).getScore()+
//                "年龄："+studentsTool.getMaxStudent(student).getAge();

    }

}

