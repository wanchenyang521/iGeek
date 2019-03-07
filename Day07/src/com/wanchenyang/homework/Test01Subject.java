package com.wanchenyang.homework;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-07 16:25
 * @description
 **/
public class Test01Subject
{
    private String subjectId;
    private  String subjectName;
    private  String subjectDate;
    private String subjectDescribe;

    public String getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(String subjectId)
    {
        this.subjectId = subjectId;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public String getSubjectDate()
    {
        return subjectDate;
    }

    public void setSubjectDate(String subjectDate)
    {
        this.subjectDate = subjectDate;
    }

    public String getSubjectDescribe()
    {
        return subjectDescribe;
    }

    public void setSubjectDescribe(String subjectDescribe)
    {
        this.subjectDescribe = subjectDescribe;
    }

    public Test01Subject()
    {
    }
    public Test01Subject(String subjectId, String subjectName, String subjectDate, String subjectDescribe)
    {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectDate = subjectDate;
        this.subjectDescribe = subjectDescribe;
    }

}
