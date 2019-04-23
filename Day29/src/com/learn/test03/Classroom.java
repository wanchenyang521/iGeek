package com.learn.test03;

import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-04-18 09:18
 * @description
 **/
public class Classroom
{
    private String classNumber;
    private ArrayList<Student> studentArrayList;

    public String getClassNumber()
    {
        return classNumber;
    }

    public void setClassNumber(String classNumber)
    {
        this.classNumber = classNumber;
    }

    public ArrayList<Student> getStudentArrayList()
    {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList)
    {
        this.studentArrayList = studentArrayList;
    }

    public Classroom()
    {
    }

    public Classroom(String classNumber, ArrayList<Student> studentArrayList)
    {
        this.classNumber = classNumber;
        this.studentArrayList = studentArrayList;
    }
}
