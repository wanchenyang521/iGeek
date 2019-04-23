package com.wanchenyang.homework.guanka02;

import java.util.Objects;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-03 21:34
 * @description
 * 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,
 * 生成get/set方法.
 * 创建5个学生放到HashSet中(姓名和年龄相同的认为是同一学生).
 * 使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 *
 **/
public class Student11
{
    private String name;
    private int age;
    private int score;

    @Override
    public String toString()
    {
        return "Student11{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof Student11))
        {
            return false;
        }
        Student11 student11 = (Student11) o;
        return age == student11.age &&
                score == student11.score &&
                Objects.equals(name, student11.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age, score);
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

    public Student11()
    {
    }

    public Student11(String name, int age, int score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
