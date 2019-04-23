package com.homework.gunaka03;

import java.io.Serializable;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-17 15:27
 * @description
 **/
public class Student implements Serializable
{
    private String id;
    private String name;
    private transient String personId;
    private String java;
    private String math;
    private String english;

    @Override
    public String toString()
    {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", java='" + java + '\'' +
                ", math='" + math + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPersonId()
    {
        return personId;
    }

    public void setPersonId(String personId)
    {
        this.personId = personId;
    }

    public String getJava()
    {
        return java;
    }

    public void setJava(String java)
    {
        this.java = java;
    }

    public String getMath()
    {
        return math;
    }

    public void setMath(String math)
    {
        this.math = math;
    }

    public String getEnglish()
    {
        return english;
    }

    public void setEnglish(String english)
    {
        this.english = english;
    }

    public Student()
    {
    }

    public Student(String id, String name, String personId, String java, String math, String english)
    {
        this.id = id;
        this.name = name;
        this.personId = personId;
        this.java = java;
        this.math = math;
        this.english = english;
    }
}
