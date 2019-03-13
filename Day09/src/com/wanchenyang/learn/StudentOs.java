package com.wanchenyang.learn;


/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-11 15:41
 * @description
 **/
public class StudentOs
{
    private String stdId;//学号
    private String stdName;//姓名
    private int stdAge; //年龄
    private String sex ; //性别

    public StudentOs()
    {
    }

    public StudentOs(String stdId, String stdName, int stdAge, String sex)
    {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.sex = sex;
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

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }
}
