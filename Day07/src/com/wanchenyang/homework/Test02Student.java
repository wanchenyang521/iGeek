package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:44
 * @description
 **/
public class Test02Student
{
    private String studentId;
    private String studentName;
    private String studentSex;
    private double studentHight;
    private int studentAge;

    public Test02Student(String studentId, String studentName, String studentSex, double studentHight, int studentAge)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentHight = studentHight;
        this.studentAge = studentAge;
    }

    public Test02Student()
    {
    }


    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentSex()
    {
        return studentSex;
    }

    public void setStudentSex(String studentSex)
    {
        this.studentSex = studentSex;
    }

    public double getStudentHight()
    {
        return studentHight;
    }

    public void setStudentHight(double studentHight)
    {
        this.studentHight = studentHight;
    }

    public int getStudentAge()
    {
        return studentAge;
    }

    public void setStudentAge(int studentAge)
    {
        this.studentAge = studentAge;
    }
}
