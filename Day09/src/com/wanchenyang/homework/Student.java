package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 17:50
 * @description
 **/
public class Student
{
    private String stdId;
    private String stdName;
    private double hight;
    private int stdAge;
    private String stdSex;

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

    public Student(String stdId, String stdName, double hight, int stdAge)
    {
        this.stdId = stdId;
        this.stdName = stdName;
        this.hight = hight;
        this.stdAge = stdAge;
    }

    public void setStdAge(int stdAge)
    {
        this.stdAge = stdAge;
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

    public double getHight()
    {
        return hight;
    }

    public void setHight(double hight)
    {
        this.hight = hight;
    }

    public Student(String stdId, String stdName, double hight)
    {
        this.stdId = stdId;
        this.stdName = stdName;
        this.hight = hight;
    }

    public Student()
    {
    }
}
