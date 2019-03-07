package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:22
 * @description
 **/
public class Test01Teacher
{
    private String teacherId;
    private String teacherName;
    private String teacherSex;
    private int teacherAge;
    private String teacherSubject;

    public String getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(String teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public String getTeacherSex()
    {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex)
    {
        this.teacherSex = teacherSex;
    }

    public int getTeacherAge()
    {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge)
    {
        this.teacherAge = teacherAge;
    }

    public String getTeacherSubject()
    {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject)
    {
        this.teacherSubject = teacherSubject;
    }

    public Test01Teacher()
    {
    }

    public Test01Teacher(String teacherId, String teacherName, String teacherSex, int teacherAge, String teacherSubject)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.teacherSubject = teacherSubject;
    }
}
