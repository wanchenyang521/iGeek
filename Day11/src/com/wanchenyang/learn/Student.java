package com.wanchenyang.learn;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-14 08:38
 * @description
 **/
public class Student
{
    private String stdId;
    private String stdName;
    private int stdAge;
    private String stdDomicile;

    public Student()
    {
    }

    public Student(String stdId, String stdName, int stdAge, String stdDomicile)
    {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdDomicile = stdDomicile;
    }

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

    public int getStdAge()
    {
        return stdAge;
    }

    public void setStdAge(int stdAge)
    {
        this.stdAge = stdAge;
    }

    public String getStdDomicile()
    {
        return stdDomicile;
    }

    public void setStdDomicile(String stdDomicile)
    {
        this.stdDomicile = stdDomicile;
    }
}
