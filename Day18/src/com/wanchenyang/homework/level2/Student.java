package com.wanchenyang.homework.level2;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-27 15:20
 * @description
 **/
public class Student
{
    private String name;
    private String sex;
    private int age;
    private String qq;

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", qq='" + qq + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getQq()
    {
        return qq;
    }

    public void setQq(String qq)
    {
        this.qq = qq;
    }

    public Student()
    {
    }

    public Student(String name, String sex, int age, String qq)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.qq = qq;
    }
}
