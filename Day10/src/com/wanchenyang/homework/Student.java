package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-13 15:29
 * @description
 **/
public class Student
{
    private String stdId;
    private String stdName;
    private String stdSex;
    private int stdAge;

    public String getStdId()
    {
        return stdId;
    }

    public void setStdId(String stdId)
    {
        this.stdId = stdId;
    }

    public String getStdName()
    {
        return stdName;
    }

    public void setStdName(String stdName)
    {
        this.stdName = stdName;
    }

    public String getStdSex()
    {
        return stdSex;
    }

    public void setStdSex(String stdSex)
    {
        this.stdSex = stdSex;
    }

    public int getStdAge()
    {
        return stdAge;
    }

    public void setStdAge(int stdAge)
    {
        this.stdAge = stdAge;
    }

    public Student()
    {
    }

    public Student(String stdId, String stdName, String stdSex, int stdAge)
    {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdSex = stdSex;
        this.stdAge = stdAge;
    }
}
